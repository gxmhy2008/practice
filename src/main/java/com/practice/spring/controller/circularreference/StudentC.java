package com.practice.spring.controller.circularreference;

public class StudentC {
    private StudentA studentA;

    public StudentC(StudentA studentA) {
        this.studentA = studentA;
    }
}
