package com.baoluoge.exam.vo;


import com.baoluoge.exam.domain.ExamPaper;

import java.util.Objects;

/**
 * Created by PaulZhang on 2016/9/27.
 */
public class ExamPaperVO {

    private int paperId;

    private String paperName;

    private long times;

    private float avgScore;

    private float highestScore;

    private boolean isFree;

    public int getPaperId() {
        return paperId;
    }

    public void setPaperId(int paperId) {
        this.paperId = paperId;
    }

    public String getPaperName() {
        return paperName;
    }

    public void setPaperName(String paperName) {
        this.paperName = paperName;
    }

    public long getTimes() {
        return times;
    }

    public void setTimes(long times) {
        this.times = times;
    }

    public float getAvgScore() {
        return avgScore;
    }

    public void setAvgScore(float avgScore) {
        this.avgScore = avgScore;
    }

    public float getHighestScore() {
        return highestScore;
    }

    public void setHighestScore(float highestScore) {
        this.highestScore = highestScore;
    }

    public boolean getIsFree() {
        return isFree;
    }

    public void setIsFree(boolean free) {
        isFree = free;
    }

    public static ExamPaperVO getExamPaperVO(ExamPaper examPaper) {
        ExamPaperVO examPaperVO = null;
        if (Objects.nonNull(examPaper)) {
            examPaperVO = new ExamPaperVO();
            examPaperVO.setPaperId(examPaper.getId());
            examPaperVO.setPaperName(examPaper.getName());
            examPaperVO.setIsFree(examPaper.getIsFree());
        }
        return examPaperVO;
    }
}
