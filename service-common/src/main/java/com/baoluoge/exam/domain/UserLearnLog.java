package com.baoluoge.exam.domain;

import java.math.BigDecimal;
import java.util.Date;

public class UserLearnLog {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_learn_log.id
     *
     * @mbg.generated Thu Oct 13 17:56:06 CST 2016
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_learn_log.user_id
     *
     * @mbg.generated Thu Oct 13 17:56:06 CST 2016
     */
    private Integer userId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_learn_log.learn_type
     *
     * @mbg.generated Thu Oct 13 17:56:06 CST 2016
     */
    private Integer learnType;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_learn_log.learn_type_name
     *
     * @mbg.generated Thu Oct 13 17:56:06 CST 2016
     */
    private String learnTypeName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_learn_log.learn_source_name_l
     *
     * @mbg.generated Thu Oct 13 17:56:06 CST 2016
     */
    private String learnSourceNameL;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_learn_log.learn_source_name_s
     *
     * @mbg.generated Thu Oct 13 17:56:06 CST 2016
     */
    private String learnSourceNameS;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_learn_log.score
     *
     * @mbg.generated Thu Oct 13 17:56:06 CST 2016
     */
    private BigDecimal score;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_learn_log.exam_paper_id
     *
     * @mbg.generated Thu Oct 13 17:56:06 CST 2016
     */
    private Integer examPaperId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_learn_log.exam_questions_broad_id
     *
     * @mbg.generated Thu Oct 13 17:56:06 CST 2016
     */
    private Integer examQuestionsBroadId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_learn_log.questions_type_id
     *
     * @mbg.generated Thu Oct 13 17:56:06 CST 2016
     */
    private Integer questionsTypeId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_learn_log.user_exam_wrong_history_ids
     *
     * @mbg.generated Thu Oct 13 17:56:06 CST 2016
     */
    private String userExamWrongHistoryIds;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_learn_log.begin_time
     *
     * @mbg.generated Thu Oct 13 17:56:06 CST 2016
     */
    private Date beginTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_learn_log.end_time
     *
     * @mbg.generated Thu Oct 13 17:56:06 CST 2016
     */
    private Date endTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_learn_log.create_time
     *
     * @mbg.generated Thu Oct 13 17:56:06 CST 2016
     */
    private Date createTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_learn_log.update_time
     *
     * @mbg.generated Thu Oct 13 17:56:06 CST 2016
     */
    private Date updateTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_learn_log.is_delete
     *
     * @mbg.generated Thu Oct 13 17:56:06 CST 2016
     */
    private Boolean isDelete;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_learn_log.id
     *
     * @return the value of user_learn_log.id
     *
     * @mbg.generated Thu Oct 13 17:56:06 CST 2016
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_learn_log.id
     *
     * @param id the value for user_learn_log.id
     *
     * @mbg.generated Thu Oct 13 17:56:06 CST 2016
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_learn_log.user_id
     *
     * @return the value of user_learn_log.user_id
     *
     * @mbg.generated Thu Oct 13 17:56:06 CST 2016
     */
    public Integer getUserId() {
        return userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_learn_log.user_id
     *
     * @param userId the value for user_learn_log.user_id
     *
     * @mbg.generated Thu Oct 13 17:56:06 CST 2016
     */
    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_learn_log.learn_type
     *
     * @return the value of user_learn_log.learn_type
     *
     * @mbg.generated Thu Oct 13 17:56:06 CST 2016
     */
    public Integer getLearnType() {
        return learnType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_learn_log.learn_type
     *
     * @param learnType the value for user_learn_log.learn_type
     *
     * @mbg.generated Thu Oct 13 17:56:06 CST 2016
     */
    public void setLearnType(Integer learnType) {
        this.learnType = learnType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_learn_log.learn_type_name
     *
     * @return the value of user_learn_log.learn_type_name
     *
     * @mbg.generated Thu Oct 13 17:56:06 CST 2016
     */
    public String getLearnTypeName() {
        return learnTypeName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_learn_log.learn_type_name
     *
     * @param learnTypeName the value for user_learn_log.learn_type_name
     *
     * @mbg.generated Thu Oct 13 17:56:06 CST 2016
     */
    public void setLearnTypeName(String learnTypeName) {
        this.learnTypeName = learnTypeName == null ? null : learnTypeName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_learn_log.learn_source_name_l
     *
     * @return the value of user_learn_log.learn_source_name_l
     *
     * @mbg.generated Thu Oct 13 17:56:06 CST 2016
     */
    public String getLearnSourceNameL() {
        return learnSourceNameL;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_learn_log.learn_source_name_l
     *
     * @param learnSourceNameL the value for user_learn_log.learn_source_name_l
     *
     * @mbg.generated Thu Oct 13 17:56:06 CST 2016
     */
    public void setLearnSourceNameL(String learnSourceNameL) {
        this.learnSourceNameL = learnSourceNameL == null ? null : learnSourceNameL.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_learn_log.learn_source_name_s
     *
     * @return the value of user_learn_log.learn_source_name_s
     *
     * @mbg.generated Thu Oct 13 17:56:06 CST 2016
     */
    public String getLearnSourceNameS() {
        return learnSourceNameS;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_learn_log.learn_source_name_s
     *
     * @param learnSourceNameS the value for user_learn_log.learn_source_name_s
     *
     * @mbg.generated Thu Oct 13 17:56:06 CST 2016
     */
    public void setLearnSourceNameS(String learnSourceNameS) {
        this.learnSourceNameS = learnSourceNameS == null ? null : learnSourceNameS.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_learn_log.score
     *
     * @return the value of user_learn_log.score
     *
     * @mbg.generated Thu Oct 13 17:56:06 CST 2016
     */
    public BigDecimal getScore() {
        return score;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_learn_log.score
     *
     * @param score the value for user_learn_log.score
     *
     * @mbg.generated Thu Oct 13 17:56:06 CST 2016
     */
    public void setScore(BigDecimal score) {
        this.score = score;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_learn_log.exam_paper_id
     *
     * @return the value of user_learn_log.exam_paper_id
     *
     * @mbg.generated Thu Oct 13 17:56:06 CST 2016
     */
    public Integer getExamPaperId() {
        return examPaperId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_learn_log.exam_paper_id
     *
     * @param examPaperId the value for user_learn_log.exam_paper_id
     *
     * @mbg.generated Thu Oct 13 17:56:06 CST 2016
     */
    public void setExamPaperId(Integer examPaperId) {
        this.examPaperId = examPaperId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_learn_log.exam_questions_broad_id
     *
     * @return the value of user_learn_log.exam_questions_broad_id
     *
     * @mbg.generated Thu Oct 13 17:56:06 CST 2016
     */
    public Integer getExamQuestionsBroadId() {
        return examQuestionsBroadId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_learn_log.exam_questions_broad_id
     *
     * @param examQuestionsBroadId the value for user_learn_log.exam_questions_broad_id
     *
     * @mbg.generated Thu Oct 13 17:56:06 CST 2016
     */
    public void setExamQuestionsBroadId(Integer examQuestionsBroadId) {
        this.examQuestionsBroadId = examQuestionsBroadId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_learn_log.questions_type_id
     *
     * @return the value of user_learn_log.questions_type_id
     *
     * @mbg.generated Thu Oct 13 17:56:06 CST 2016
     */
    public Integer getQuestionsTypeId() {
        return questionsTypeId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_learn_log.questions_type_id
     *
     * @param questionsTypeId the value for user_learn_log.questions_type_id
     *
     * @mbg.generated Thu Oct 13 17:56:06 CST 2016
     */
    public void setQuestionsTypeId(Integer questionsTypeId) {
        this.questionsTypeId = questionsTypeId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_learn_log.user_exam_wrong_history_ids
     *
     * @return the value of user_learn_log.user_exam_wrong_history_ids
     *
     * @mbg.generated Thu Oct 13 17:56:06 CST 2016
     */
    public String getUserExamWrongHistoryIds() {
        return userExamWrongHistoryIds;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_learn_log.user_exam_wrong_history_ids
     *
     * @param userExamWrongHistoryIds the value for user_learn_log.user_exam_wrong_history_ids
     *
     * @mbg.generated Thu Oct 13 17:56:06 CST 2016
     */
    public void setUserExamWrongHistoryIds(String userExamWrongHistoryIds) {
        this.userExamWrongHistoryIds = userExamWrongHistoryIds == null ? null : userExamWrongHistoryIds.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_learn_log.begin_time
     *
     * @return the value of user_learn_log.begin_time
     *
     * @mbg.generated Thu Oct 13 17:56:06 CST 2016
     */
    public Date getBeginTime() {
        return beginTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_learn_log.begin_time
     *
     * @param beginTime the value for user_learn_log.begin_time
     *
     * @mbg.generated Thu Oct 13 17:56:06 CST 2016
     */
    public void setBeginTime(Date beginTime) {
        this.beginTime = beginTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_learn_log.end_time
     *
     * @return the value of user_learn_log.end_time
     *
     * @mbg.generated Thu Oct 13 17:56:06 CST 2016
     */
    public Date getEndTime() {
        return endTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_learn_log.end_time
     *
     * @param endTime the value for user_learn_log.end_time
     *
     * @mbg.generated Thu Oct 13 17:56:06 CST 2016
     */
    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_learn_log.create_time
     *
     * @return the value of user_learn_log.create_time
     *
     * @mbg.generated Thu Oct 13 17:56:06 CST 2016
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_learn_log.create_time
     *
     * @param createTime the value for user_learn_log.create_time
     *
     * @mbg.generated Thu Oct 13 17:56:06 CST 2016
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_learn_log.update_time
     *
     * @return the value of user_learn_log.update_time
     *
     * @mbg.generated Thu Oct 13 17:56:06 CST 2016
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_learn_log.update_time
     *
     * @param updateTime the value for user_learn_log.update_time
     *
     * @mbg.generated Thu Oct 13 17:56:06 CST 2016
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_learn_log.is_delete
     *
     * @return the value of user_learn_log.is_delete
     *
     * @mbg.generated Thu Oct 13 17:56:06 CST 2016
     */
    public Boolean getIsDelete() {
        return isDelete;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_learn_log.is_delete
     *
     * @param isDelete the value for user_learn_log.is_delete
     *
     * @mbg.generated Thu Oct 13 17:56:06 CST 2016
     */
    public void setIsDelete(Boolean isDelete) {
        this.isDelete = isDelete;
    }
}