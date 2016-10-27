package com.baoluoge.exam.controller.paper;

import com.baoluoge.exam.BusinessStatusCode;
import com.baoluoge.exam.Constants;
import com.baoluoge.exam.domain.ExamPaper;
import com.baoluoge.exam.service.paper.ExamPaperService;
import com.baoluoge.exam.service.paper.impl.ExamPaperHistoryService;
import com.baoluoge.exam.util.page.Page;
import com.baoluoge.exam.vo.ExamPaperVO;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;
import org.apache.commons.collections4.CollectionUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.context.request.async.DeferredResult;
import rx.Observable;
import rx.schedulers.Schedulers;

import java.util.List;
import java.util.Objects;

/**
 * 试卷相关API
 * <p>
 * Created by PaulZhang on 2016/9/23.
 */
@RestController
@RequestMapping("/paper")
public class PaperController {

    @Autowired
    private DiscoveryClient discoveryClient;

    @Autowired
    private ExamPaperHistoryService examPaperHistoryService;

    @Autowired
    private ExamPaperService examPaperService;
//
//    @Autowired
//    private ExamPaperHistoryService examPaperHistoryService;
//
//    @Autowired
//    private ExamQuestionService examQuestionService;
//
//
//    @Autowired
//    private UserLearnLogService userLearnLogService;

    @GetMapping(value = "/instance-info")
    public ServiceInstance showInfo() {
        ServiceInstance serviceInstance = discoveryClient.getLocalServiceInstance();
        return serviceInstance;
    }

    /**
     * 获取题目类型列表
     *
     * @return
     */
//    @RequestMapping(value = "/getQuestionType", method = RequestMethod.GET)
//    public DeferredResult<ObjectNode> questionTypes() {
//        DeferredResult<ObjectNode> result = new DeferredResult<>(Constants.REQUEST_TIME_OUT_MILLSECONDS);
//        ObjectMapper mapper = new ObjectMapper();
//
//        Observable.from(questionTypeService.findAll()).subscribeOn(Schedulers.io())
//                .map(questionType -> {
//                    QuestionTypeVO questionTypeVO = null;
//                    if (Objects.nonNull(questionType)) {
//                        questionTypeVO = new QuestionTypeVO();
//                        questionTypeVO.setImgUrl(questionType.getImgUrl());
//                        questionTypeVO.setOrder(questionType.getOrder());
//                        questionTypeVO.setQuestionName(questionType.getQuestionName());
//                        questionTypeVO.setQuestionTypeId(questionType.getId());
//                    }
//
//                    return questionTypeVO;
//                })
//                .toList()
//                .subscribe(questionTypeVOs -> {
//                    ObjectNode node = mapper.createObjectNode();
//                    if (CollectionUtils.isNotEmpty(questionTypeVOs)) {
//                        node.put("code", BusinessStatusCode.OK);
//                        node.putPOJO("questionTypes", questionTypeVOs);
//                    } else {
//                        node.put("code", BusinessStatusCode.NO_QUESTION_TYPE);
//                        node.put("msg", "no question type");
//                    }
//
//                    result.setResult(node);
//                });
//        return result;
//    }
    @GetMapping("/test")
    public long test() {
        long times = examPaperHistoryService.userExerciseTimes(272, 1);
        return times;
    }

    /**
     * 获取试卷列表
     *
     * @param userId 用户id
     * @param pn     分页页码
     * @param size   每页数据量
     * @return
     */
    @GetMapping(value = "/getExamPaperList")
    public DeferredResult<ObjectNode> list(@RequestParam("userId") int userId,
                                           @RequestParam(value = "pn", required = false, defaultValue = "1") int pn,
                                           @RequestParam(value = "size", required = false, defaultValue = "20") int size) {
        DeferredResult<ObjectNode> result = new DeferredResult<>(Constants.REQUEST_TIME_OUT_MILLSECONDS);
        ObjectMapper mapper = new ObjectMapper();

        // 所有试卷
        Page<ExamPaper> page = examPaperService.findByPage(pn, size);
        Observable<Page<ExamPaper>> pageObservable = Observable.just(page);
        Observable<List<ExamPaperVO>> papersObservable = Observable.from(page.getItems()).subscribeOn(Schedulers.io())
                .map(ExamPaperVO::getExamPaperVO)
                .map(examPaperVO -> {
                    // 统计实战模拟次数
                    long times = examPaperHistoryService.userExerciseTimes(userId, examPaperVO.getPaperId());
                    examPaperVO.setTimes(times);
                    return examPaperVO;
                })
                .map(examPaperVO -> {
                    // 平均分
//                    float avgScore = examPaperHistoryService.userExerciseAvgScore(userId, examPaperVO.getPaperId());
                    float avgScore = examPaperHistoryService.userExerciseAvgScoreFegin(userId, examPaperVO.getPaperId());
                    examPaperVO.setAvgScore(avgScore);
                    return examPaperVO;
                })
                .map(examPaperVO -> {
                    // 最高分
                    //float maxScore = examPaperHistoryService.userExerciseMaxScore(userId, examPaperVO.getPaperId());
                    //examPaperVO.setHighestScore(maxScore);
                    return examPaperVO;
                })
                .toList();

        Observable.zip(pageObservable, papersObservable, (paperPage, paperVOList) -> {
            ObjectNode node = mapper.createObjectNode();
            if (Objects.nonNull(paperPage) && CollectionUtils.isNotEmpty(paperVOList)) {
                node.put("code", BusinessStatusCode.OK);
                node.put("totalPage", paperPage.getContext().getPageCount());
                node.put("totalItem", paperPage.getContext().getTotal());
                node.put("currentPage", paperPage.getIndex());
                node.putPOJO("items", paperVOList);
            } else {
                node.put("code", BusinessStatusCode.NO_PAPER);
                node.put("msg", "no paper");
            }
            return node;

        }).subscribeOn(Schedulers.io())
                .subscribe(result::setResult);

        return result;
    }


    /**
     * 获取试卷详细信息
     *
     * @param paperId 试卷id
     * @return
     */
//    @RequestMapping(value = "/getPaperDetail", method = RequestMethod.GET)
//    public DeferredResult<ObjectNode> detail(@RequestParam("paperId") int paperId) {
//        DeferredResult<ObjectNode> result = new DeferredResult<>(Constants.REQUEST_TIME_OUT_MILLSECONDS);
//        ObjectMapper mapper = new ObjectMapper();
//
//        Observable<List<ExamQuestionBroadVO>> broadVOObservable = examQuestionService.findQuestionDetail(paperId);
//        broadVOObservable.subscribe(examQuestionBroadVOs -> {
//            ObjectNode node = mapper.createObjectNode();
//            if (CollectionUtils.isNotEmpty(examQuestionBroadVOs)) {
//                node.put("code", BusinessStatusCode.OK);
//                node.putPOJO("examQuestionsBroads", examQuestionBroadVOs);
//            } else {
//                node.put("code", BusinessStatusCode.NO_QUESTION);
//                node.put("msg", "no question");
//            }
//
//            result.setResult(node);
//        });
//        return result;
//    }

    /**
     * 保存考试记录
     *
     * @param payload 试卷结果，结构见<a>http://192.168.6.220:9999/api_doc/uxue_exam/api.html#paper_saveExamHistory_post</a>
     * @return
     */
//    @RequestMapping(value = "/saveExamHistory", method = RequestMethod.POST)
//    public DeferredResult<ObjectNode> commit(@RequestBody Map<String, Object> payload) {
//        DeferredResult<ObjectNode> result = new DeferredResult<>(Constants.REQUEST_TIME_OUT_MILLSECONDS);
//        ObjectMapper mapper = new ObjectMapper();
//
//        int type = (int) payload.get("type");
//        int examPaperId = (int) payload.get("examPaperId");
//        int userId = (int) payload.get("userId");
//        String examResult = (String) payload.get("examResult");
//        String totalScore = (String) payload.get("totalScore");
//        String realTotalScore = (String) payload.get("realTotalScore");
//        String score1 = (String) payload.get("score1");
//        String realScore1 = (String) payload.get("realScore1");
//        String score2 = (String) payload.get("score2");
//        String realScore2 = (String) payload.get("realScore2");
//        String score3 = (String) payload.get("score3");
//        String realScore3 = (String) payload.get("realScore3");
//        String score4 = (String) payload.get("score4");
//        String realScore4 = (String) payload.get("realScore4");
//        String score5 = (String) payload.get("score5");
//        String realScore5 = (String) payload.get("realScore5");
//
//        Observable.just(examPaperHistoryService.createExamHistory(type, examPaperId, userId, examResult, Float.valueOf(totalScore),
//                Float.valueOf(realTotalScore), Float.valueOf(score1), Float.valueOf(realScore1), Float.valueOf(score2)
//                , Float.valueOf(realScore2), Float.valueOf(score3), Float.valueOf(realScore3), Float.valueOf(score4), Float.valueOf(realScore4),
//                Float.valueOf(score5), Float.valueOf(realScore5)))
//                .subscribeOn(Schedulers.io())
//                .subscribe(isSuccess -> {
//                    ObjectNode node = mapper.createObjectNode();
//                    if (isSuccess) {
//                        node.put("code", BusinessStatusCode.OK);
//                        // 保存学习记录日志
//                        getLearnTypeCreateLog(userId, examPaperId, type, Float.valueOf(realTotalScore), 0, 0, null);
//                    } else {
//                        node.put("code", BusinessStatusCode.FAILED);
//                    }
//
//                    result.setResult(node);
//                });
//        return result;
//    }

    /**
     * 保存学习记录日志
     *
     * @param userId
     * @param examPaperId
     * @param learnType
     * @param score
     * @param broadId
     * @param questionTypeId
     * @param wrongIds
     */
//    public void getLearnTypeCreateLog(int userId, int examPaperId, int learnType, float score, int broadId, int questionTypeId, String wrongIds) {
//        String learnTypesName = LearnTypes.getLearnTypeName(learnType);
//        String learnSourceNameL = "";
//        if (CommUtil.isNotZero(examPaperId)) {
//            ExamPaper examPaper = examPaperService.findById(examPaperId);
//            if (Objects.nonNull(examPaper)) {
//                learnSourceNameL = examPaper.getName();
//            }
//        }
//
//        userLearnLogService.createLog(userId, examPaperId, learnType, learnTypesName, learnSourceNameL, "", score, 0, questionTypeId, null);
//    }
}
