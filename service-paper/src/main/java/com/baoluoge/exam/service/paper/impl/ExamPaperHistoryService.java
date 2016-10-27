package com.baoluoge.exam.service.paper.impl;

import com.baoluoge.exam.BusinessStatusCode;
import com.fasterxml.jackson.databind.node.ObjectNode;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * Created by PaulZhang on 2016/10/25.
 */
@Service
public class ExamPaperHistoryService {

    private final String PAPER_HISTORY_SERVICE_ID = "paper-history-service";

    @Autowired
    private RestTemplate restTemplate;

    @Autowired
    private ExamPaperHistoryFeginClient paperHistoryFeginClient;

    private static final Logger LOGGER = LoggerFactory.getLogger(ExamPaperHistoryService.class);

    @HystrixCommand(fallbackMethod = "fallback")
    public long userExerciseTimes(int userId, int paperId) {
        long times = 0;
        ObjectNode node = restTemplate.getForObject("http://" + PAPER_HISTORY_SERVICE_ID + "/paperHistory/exerciseTimes?userId=" + userId + "&paperId=" + paperId, ObjectNode.class);
        if (node.get("code").intValue() == BusinessStatusCode.OK) {
            times = node.get("times").longValue();
        }

        return times;
    }

    @HystrixCommand(fallbackMethod = "scoreFallback")
    public float userExerciseAvgScore(int userId, int paperId) {
        float score = 0F;
        ObjectNode node = restTemplate.getForObject("http://" + PAPER_HISTORY_SERVICE_ID + "/paperHistory/exerciseAvgScore?userId=" + userId + "&paperId=" + paperId, ObjectNode.class);
        if (node.get("code").intValue() == BusinessStatusCode.OK) {
            score = node.get("score").floatValue();
        }

        return score;
    }

    public float userExerciseAvgScoreFegin(int userId, int paperId) {
        float score = 0F;
        ObjectNode node = paperHistoryFeginClient.userExerciseAvgScore(userId, paperId);
        if (node.get("code").intValue() == BusinessStatusCode.OK) {
            score = node.get("score").floatValue();
        }

        return score;
    }

    public long fallback(int userId, int paperId) {
        LOGGER.info("异常发生，进入fallback方法，接收的参数：userId = {}, paperId = {}", userId, paperId);
        return 0;
    }

    public float scoreFallback(int userId, int paperId) {
        LOGGER.info("异常发生，进入fallback方法，接收的参数：userId = {}, paperId = {}", userId, paperId);
        return 0;
    }
}
