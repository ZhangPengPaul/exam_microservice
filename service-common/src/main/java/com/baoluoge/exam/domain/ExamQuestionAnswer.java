package com.baoluoge.exam.domain;

import java.util.Date;

public class ExamQuestionAnswer {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column exam_question_answer.id
     *
     * @mbg.generated Mon Sep 26 10:23:54 CST 2016
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column exam_question_answer.exam_questions_narrow_id
     *
     * @mbg.generated Mon Sep 26 10:23:54 CST 2016
     */
    private Integer examQuestionsNarrowId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column exam_question_answer.answer_type
     *
     * @mbg.generated Mon Sep 26 10:23:54 CST 2016
     */
    private Integer answerType;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column exam_question_answer.code_number
     *
     * @mbg.generated Mon Sep 26 10:23:54 CST 2016
     */
    private String codeNumber;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column exam_question_answer.desc_content
     *
     * @mbg.generated Mon Sep 26 10:23:54 CST 2016
     */
    private String descContent;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column exam_question_answer.desc_img_url
     *
     * @mbg.generated Mon Sep 26 10:23:54 CST 2016
     */
    private String descImgUrl;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column exam_question_answer.desc_audio_path
     *
     * @mbg.generated Mon Sep 26 10:23:54 CST 2016
     */
    private String descAudioPath;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column exam_question_answer.desc_audio_repeat_times
     *
     * @mbg.generated Mon Sep 26 10:23:54 CST 2016
     */
    private Integer descAudioRepeatTimes;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column exam_question_answer.value
     *
     * @mbg.generated Mon Sep 26 10:23:54 CST 2016
     */
    private String value;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column exam_question_answer.is_righ
     *
     * @mbg.generated Mon Sep 26 10:23:54 CST 2016
     */
    private Boolean isRigh;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column exam_question_answer.order
     *
     * @mbg.generated Mon Sep 26 10:23:54 CST 2016
     */
    private Integer order;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column exam_question_answer.waittime_millseconds
     *
     * @mbg.generated Mon Sep 26 10:23:54 CST 2016
     */
    private Long waittimeMillseconds;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column exam_question_answer.timeout_millseconds
     *
     * @mbg.generated Mon Sep 26 10:23:54 CST 2016
     */
    private Long timeoutMillseconds;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column exam_question_answer.create_time
     *
     * @mbg.generated Mon Sep 26 10:23:54 CST 2016
     */
    private Date createTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column exam_question_answer.update_time
     *
     * @mbg.generated Mon Sep 26 10:23:54 CST 2016
     */
    private Date updateTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column exam_question_answer.is_delete
     *
     * @mbg.generated Mon Sep 26 10:23:54 CST 2016
     */
    private Boolean isDelete;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column exam_question_answer.id
     *
     * @return the value of exam_question_answer.id
     *
     * @mbg.generated Mon Sep 26 10:23:54 CST 2016
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column exam_question_answer.id
     *
     * @param id the value for exam_question_answer.id
     *
     * @mbg.generated Mon Sep 26 10:23:54 CST 2016
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column exam_question_answer.exam_questions_narrow_id
     *
     * @return the value of exam_question_answer.exam_questions_narrow_id
     *
     * @mbg.generated Mon Sep 26 10:23:54 CST 2016
     */
    public Integer getExamQuestionsNarrowId() {
        return examQuestionsNarrowId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column exam_question_answer.exam_questions_narrow_id
     *
     * @param examQuestionsNarrowId the value for exam_question_answer.exam_questions_narrow_id
     *
     * @mbg.generated Mon Sep 26 10:23:54 CST 2016
     */
    public void setExamQuestionsNarrowId(Integer examQuestionsNarrowId) {
        this.examQuestionsNarrowId = examQuestionsNarrowId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column exam_question_answer.answer_type
     *
     * @return the value of exam_question_answer.answer_type
     *
     * @mbg.generated Mon Sep 26 10:23:54 CST 2016
     */
    public Integer getAnswerType() {
        return answerType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column exam_question_answer.answer_type
     *
     * @param answerType the value for exam_question_answer.answer_type
     *
     * @mbg.generated Mon Sep 26 10:23:54 CST 2016
     */
    public void setAnswerType(Integer answerType) {
        this.answerType = answerType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column exam_question_answer.code_number
     *
     * @return the value of exam_question_answer.code_number
     *
     * @mbg.generated Mon Sep 26 10:23:54 CST 2016
     */
    public String getCodeNumber() {
        return codeNumber;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column exam_question_answer.code_number
     *
     * @param codeNumber the value for exam_question_answer.code_number
     *
     * @mbg.generated Mon Sep 26 10:23:54 CST 2016
     */
    public void setCodeNumber(String codeNumber) {
        this.codeNumber = codeNumber == null ? null : codeNumber.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column exam_question_answer.desc_content
     *
     * @return the value of exam_question_answer.desc_content
     *
     * @mbg.generated Mon Sep 26 10:23:54 CST 2016
     */
    public String getDescContent() {
        return descContent;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column exam_question_answer.desc_content
     *
     * @param descContent the value for exam_question_answer.desc_content
     *
     * @mbg.generated Mon Sep 26 10:23:54 CST 2016
     */
    public void setDescContent(String descContent) {
        this.descContent = descContent == null ? null : descContent.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column exam_question_answer.desc_img_url
     *
     * @return the value of exam_question_answer.desc_img_url
     *
     * @mbg.generated Mon Sep 26 10:23:54 CST 2016
     */
    public String getDescImgUrl() {
        return descImgUrl;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column exam_question_answer.desc_img_url
     *
     * @param descImgUrl the value for exam_question_answer.desc_img_url
     *
     * @mbg.generated Mon Sep 26 10:23:54 CST 2016
     */
    public void setDescImgUrl(String descImgUrl) {
        this.descImgUrl = descImgUrl == null ? null : descImgUrl.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column exam_question_answer.desc_audio_path
     *
     * @return the value of exam_question_answer.desc_audio_path
     *
     * @mbg.generated Mon Sep 26 10:23:54 CST 2016
     */
    public String getDescAudioPath() {
        return descAudioPath;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column exam_question_answer.desc_audio_path
     *
     * @param descAudioPath the value for exam_question_answer.desc_audio_path
     *
     * @mbg.generated Mon Sep 26 10:23:54 CST 2016
     */
    public void setDescAudioPath(String descAudioPath) {
        this.descAudioPath = descAudioPath == null ? null : descAudioPath.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column exam_question_answer.desc_audio_repeat_times
     *
     * @return the value of exam_question_answer.desc_audio_repeat_times
     *
     * @mbg.generated Mon Sep 26 10:23:54 CST 2016
     */
    public Integer getDescAudioRepeatTimes() {
        return descAudioRepeatTimes;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column exam_question_answer.desc_audio_repeat_times
     *
     * @param descAudioRepeatTimes the value for exam_question_answer.desc_audio_repeat_times
     *
     * @mbg.generated Mon Sep 26 10:23:54 CST 2016
     */
    public void setDescAudioRepeatTimes(Integer descAudioRepeatTimes) {
        this.descAudioRepeatTimes = descAudioRepeatTimes;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column exam_question_answer.value
     *
     * @return the value of exam_question_answer.value
     *
     * @mbg.generated Mon Sep 26 10:23:54 CST 2016
     */
    public String getValue() {
        return value;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column exam_question_answer.value
     *
     * @param value the value for exam_question_answer.value
     *
     * @mbg.generated Mon Sep 26 10:23:54 CST 2016
     */
    public void setValue(String value) {
        this.value = value == null ? null : value.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column exam_question_answer.is_righ
     *
     * @return the value of exam_question_answer.is_righ
     *
     * @mbg.generated Mon Sep 26 10:23:54 CST 2016
     */
    public Boolean getIsRigh() {
        return isRigh;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column exam_question_answer.is_righ
     *
     * @param isRigh the value for exam_question_answer.is_righ
     *
     * @mbg.generated Mon Sep 26 10:23:54 CST 2016
     */
    public void setIsRigh(Boolean isRigh) {
        this.isRigh = isRigh;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column exam_question_answer.order
     *
     * @return the value of exam_question_answer.order
     *
     * @mbg.generated Mon Sep 26 10:23:54 CST 2016
     */
    public Integer getOrder() {
        return order;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column exam_question_answer.order
     *
     * @param order the value for exam_question_answer.order
     *
     * @mbg.generated Mon Sep 26 10:23:54 CST 2016
     */
    public void setOrder(Integer order) {
        this.order = order;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column exam_question_answer.waittime_millseconds
     *
     * @return the value of exam_question_answer.waittime_millseconds
     *
     * @mbg.generated Mon Sep 26 10:23:54 CST 2016
     */
    public Long getWaittimeMillseconds() {
        return waittimeMillseconds;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column exam_question_answer.waittime_millseconds
     *
     * @param waittimeMillseconds the value for exam_question_answer.waittime_millseconds
     *
     * @mbg.generated Mon Sep 26 10:23:54 CST 2016
     */
    public void setWaittimeMillseconds(Long waittimeMillseconds) {
        this.waittimeMillseconds = waittimeMillseconds;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column exam_question_answer.timeout_millseconds
     *
     * @return the value of exam_question_answer.timeout_millseconds
     *
     * @mbg.generated Mon Sep 26 10:23:54 CST 2016
     */
    public Long getTimeoutMillseconds() {
        return timeoutMillseconds;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column exam_question_answer.timeout_millseconds
     *
     * @param timeoutMillseconds the value for exam_question_answer.timeout_millseconds
     *
     * @mbg.generated Mon Sep 26 10:23:54 CST 2016
     */
    public void setTimeoutMillseconds(Long timeoutMillseconds) {
        this.timeoutMillseconds = timeoutMillseconds;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column exam_question_answer.create_time
     *
     * @return the value of exam_question_answer.create_time
     *
     * @mbg.generated Mon Sep 26 10:23:54 CST 2016
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column exam_question_answer.create_time
     *
     * @param createTime the value for exam_question_answer.create_time
     *
     * @mbg.generated Mon Sep 26 10:23:54 CST 2016
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column exam_question_answer.update_time
     *
     * @return the value of exam_question_answer.update_time
     *
     * @mbg.generated Mon Sep 26 10:23:54 CST 2016
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column exam_question_answer.update_time
     *
     * @param updateTime the value for exam_question_answer.update_time
     *
     * @mbg.generated Mon Sep 26 10:23:54 CST 2016
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column exam_question_answer.is_delete
     *
     * @return the value of exam_question_answer.is_delete
     *
     * @mbg.generated Mon Sep 26 10:23:54 CST 2016
     */
    public Boolean getIsDelete() {
        return isDelete;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column exam_question_answer.is_delete
     *
     * @param isDelete the value for exam_question_answer.is_delete
     *
     * @mbg.generated Mon Sep 26 10:23:54 CST 2016
     */
    public void setIsDelete(Boolean isDelete) {
        this.isDelete = isDelete;
    }
}