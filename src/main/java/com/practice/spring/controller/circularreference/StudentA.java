package com.practice.spring.controller.circularreference;

public class StudentA {
    private StudentB studentB;

    public StudentA(StudentB studentB) {
        this.studentB = studentB;
    }
}
