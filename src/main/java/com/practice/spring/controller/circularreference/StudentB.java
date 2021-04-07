package com.practice.spring.controller.circularreference;

public class StudentB {
    private StudentC studentC;

    public StudentB(StudentC studentC) {
        this.studentC = studentC;
    }
}
