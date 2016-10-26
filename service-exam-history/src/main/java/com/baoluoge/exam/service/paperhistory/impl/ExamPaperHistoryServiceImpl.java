package com.baoluoge.exam.service.paperhistory.impl;

import com.baoluoge.exam.dao.paperhistory.UserExamPaperHistoryMapper;
import com.baoluoge.exam.domain.UserExamPaperHistory;
import com.baoluoge.exam.domain.UserExamPaperHistoryExample;
import com.baoluoge.exam.enmus.ExamType;
import com.baoluoge.exam.service.paperhistory.ExamPaperHistoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.math.BigDecimal;
import java.util.Date;

/**
 * Created by PaulZhang on 2016/9/27.
 */
@Service(value = "ExamPaperHistoryService")
public class ExamPaperHistoryServiceImpl implements ExamPaperHistoryService {

    @Autowired
    private UserExamPaperHistoryMapper examPaperHistoryMapper;

    @Override
    @Transactional(readOnly = true)
    public long userExerciseTimes(int userId, int paperId) {
        UserExamPaperHistoryExample example = new UserExamPaperHistoryExample();
        example.createCriteria().andUserIdEqualTo(userId)
                .andExamPaperIdEqualTo(paperId)
                .andTypeEqualTo(ExamType.ACTUAL.getValue())
                .andIsDeleteEqualTo(Boolean.FALSE);

        return examPaperHistoryMapper.countByExample(example);
    }

    @Override
    @Transactional(readOnly = true)
    public float userExerciseAvgScore(int userId, int paperId) {

        return examPaperHistoryMapper.selectAvgScoreByUser(userId, paperId);
    }

    @Override
    @Transactional(readOnly = true)
    public float userExerciseMaxScore(int userId, int paperId) {
        return examPaperHistoryMapper.selectMaxScoreByUser(userId, paperId);
    }

    @Override
    @Transactional(rollbackFor = RuntimeException.class)
    public boolean createExamHistory(int type, int examPaperId, int userId, String examResult, float totalScore, float realTotalScore, float score1, float realScore1, float score2, float realScore2, float score3, float realScore3, float score4, float realScore4, float score5, float realScore5) {
        Date now = new Date();
        UserExamPaperHistory history = new UserExamPaperHistory();
        history.setCreateTime(now);
        history.setExamPaperId(examPaperId);
        history.setExamResult(examResult);
        history.setIsDelete(Boolean.FALSE);
        history.setRealScore1(BigDecimal.valueOf(realScore1));
        history.setRealScore2(BigDecimal.valueOf(realScore2));
        history.setRealScore3(BigDecimal.valueOf(realScore3));
        history.setRealScore4(BigDecimal.valueOf(realScore4));
        history.setRealScore5(BigDecimal.valueOf(realScore5));
        history.setScore1(BigDecimal.valueOf(score1));
        history.setScore2(BigDecimal.valueOf(score2));
        history.setScore3(BigDecimal.valueOf(score3));
        history.setScore4(BigDecimal.valueOf(score4));
        history.setScore5(BigDecimal.valueOf(score5));
        history.setRealTotalScore(BigDecimal.valueOf(realTotalScore));
        history.setTotalScore(BigDecimal.valueOf(totalScore));
        history.setType(type);
        // history.setUpdateTime(now);
        history.setUserId(userId);
        return examPaperHistoryMapper.insertSelective(history) > 0;
    }
}
