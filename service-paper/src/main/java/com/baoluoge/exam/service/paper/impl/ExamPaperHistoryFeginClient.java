package com.baoluoge.exam.service.paper.impl;

import com.fasterxml.jackson.databind.node.ObjectNode;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by PaulZhang on 2016/10/27.
 */
@FeignClient(name = "paper-history-service")
public interface ExamPaperHistoryFeginClient {

    @RequestMapping("/paperHistory/exerciseAvgScore")
    public ObjectNode userExerciseAvgScore(@RequestParam("userId") int userId,
                                           @RequestParam("paperId") int paperId);
}
