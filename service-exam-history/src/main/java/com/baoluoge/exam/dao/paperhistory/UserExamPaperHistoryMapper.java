package com.baoluoge.exam.dao.paperhistory;

import com.baoluoge.exam.domain.UserExamPaperHistory;
import com.baoluoge.exam.domain.UserExamPaperHistoryExample;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserExamPaperHistoryMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_exam_paper_history
     *
     * @mbg.generated Mon Sep 26 10:23:54 CST 2016
     */
    long countByExample(UserExamPaperHistoryExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_exam_paper_history
     *
     * @mbg.generated Mon Sep 26 10:23:54 CST 2016
     */
    int deleteByExample(UserExamPaperHistoryExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_exam_paper_history
     *
     * @mbg.generated Mon Sep 26 10:23:54 CST 2016
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_exam_paper_history
     *
     * @mbg.generated Mon Sep 26 10:23:54 CST 2016
     */
    int insert(UserExamPaperHistory record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_exam_paper_history
     *
     * @mbg.generated Mon Sep 26 10:23:54 CST 2016
     */
    int insertSelective(UserExamPaperHistory record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_exam_paper_history
     *
     * @mbg.generated Mon Sep 26 10:23:54 CST 2016
     */
    List<UserExamPaperHistory> selectByExampleWithBLOBs(UserExamPaperHistoryExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_exam_paper_history
     *
     * @mbg.generated Mon Sep 26 10:23:54 CST 2016
     */
    List<UserExamPaperHistory> selectByExample(UserExamPaperHistoryExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_exam_paper_history
     *
     * @mbg.generated Mon Sep 26 10:23:54 CST 2016
     */
    UserExamPaperHistory selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_exam_paper_history
     *
     * @mbg.generated Mon Sep 26 10:23:54 CST 2016
     */
    int updateByExampleSelective(@Param("record") UserExamPaperHistory record, @Param("example") UserExamPaperHistoryExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_exam_paper_history
     *
     * @mbg.generated Mon Sep 26 10:23:54 CST 2016
     */
    int updateByExampleWithBLOBs(@Param("record") UserExamPaperHistory record, @Param("example") UserExamPaperHistoryExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_exam_paper_history
     *
     * @mbg.generated Mon Sep 26 10:23:54 CST 2016
     */
    int updateByExample(@Param("record") UserExamPaperHistory record, @Param("example") UserExamPaperHistoryExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_exam_paper_history
     *
     * @mbg.generated Mon Sep 26 10:23:54 CST 2016
     */
    int updateByPrimaryKeySelective(UserExamPaperHistory record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_exam_paper_history
     *
     * @mbg.generated Mon Sep 26 10:23:54 CST 2016
     */
    int updateByPrimaryKeyWithBLOBs(UserExamPaperHistory record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_exam_paper_history
     *
     * @mbg.generated Mon Sep 26 10:23:54 CST 2016
     */
    int updateByPrimaryKey(UserExamPaperHistory record);

    float selectAvgScoreByUser(@Param("userId") int userId, @Param("paperId") int paperId);

    float selectMaxScoreByUser(@Param("userId") int userId, @Param("paperId") int paperId);
}