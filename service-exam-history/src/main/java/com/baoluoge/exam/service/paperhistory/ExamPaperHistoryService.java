package com.baoluoge.exam.service.paperhistory;

/**
 * 试卷模拟结果service
 * <p>
 * Created by PaulZhang on 2016/9/27.
 */
public interface ExamPaperHistoryService {

    /**
     * 统计实战模拟次数
     *
     * @param userId
     * @param paperId
     * @return
     */
    long userExerciseTimes(int userId, int paperId);

    /**
     * 统计实战模拟平均分
     *
     * @param userId
     * @param paperId
     * @return
     */
    float userExerciseAvgScore(int userId, int paperId);

    /**
     * 统计实战模拟最高分
     *
     * @param userId
     * @param paperId
     * @return
     */
    float userExerciseMaxScore(int userId, int paperId);

    /**
     * 创建试卷模拟记录
     *
     * @param type
     * @param examPaperId
     * @param userId
     * @param examResult
     * @param totalScore
     * @param realTotalScore
     * @param score1
     * @param realScore1
     * @param score2
     * @param realScore2
     * @param score3
     * @param realScore3
     * @param score4
     * @param realScore4
     * @param score5
     * @param realScore5
     * @return
     */
    boolean createExamHistory(int type, int examPaperId, int userId, String examResult, float totalScore, float realTotalScore,
                              float score1, float realScore1,
                              float score2, float realScore2,
                              float score3, float realScore3,
                              float score4, float realScore4,
                              float score5, float realScore5);
}
