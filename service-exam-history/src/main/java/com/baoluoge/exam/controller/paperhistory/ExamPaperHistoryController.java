package com.baoluoge.exam.controller.paperhistory;

import com.baoluoge.exam.BusinessStatusCode;
import com.baoluoge.exam.Constants;
import com.baoluoge.exam.service.paperhistory.ExamPaperHistoryService;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.async.DeferredResult;
import rx.Observable;
import rx.schedulers.Schedulers;

import java.util.Objects;

/**
 * Created by PaulZhang on 2016/10/25.
 */
@RestController
@RequestMapping("/paperHistory")
public class ExamPaperHistoryController {

    @Autowired
    private ExamPaperHistoryService examPaperHistoryService;

    @GetMapping(value = "/exerciseTimes")
    public DeferredResult<ObjectNode> userExerciseTimes(@RequestParam("userId") int userId,
                                                        @RequestParam("paperId") int paperId) {
        DeferredResult<ObjectNode> result = new DeferredResult<>(Constants.REQUEST_TIME_OUT_MILLSECONDS);
        ObjectMapper mapper = new ObjectMapper();

        Observable.just(examPaperHistoryService.userExerciseTimes(userId, paperId))
                .subscribeOn(Schedulers.io())
                .subscribe(times -> {
                    ObjectNode node = mapper.createObjectNode();
                    node.put("code", BusinessStatusCode.OK);
                    if (Objects.nonNull(times)) {
                        node.put("times", times);
                    } else {
                        node.put("times", 0);
                    }

                    result.setResult(node);
                });
        return result;
    }
}
