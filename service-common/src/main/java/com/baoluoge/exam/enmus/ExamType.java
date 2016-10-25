package com.baoluoge.exam.enmus;

/**
 * Created by PaulZhang on 2016/9/27.
 */
public enum ExamType {
    ACTUAL(1), // 实战模拟
    SIMULATION(2); // 练习模拟

    private int value;

    ExamType(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}
