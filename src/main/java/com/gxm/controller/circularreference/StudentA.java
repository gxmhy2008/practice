package com.gxm.controller.circularreference;

public class StudentA {
    private StudentB studentB;

    public StudentA(StudentB studentB) {
        this.studentB = studentB;
    }
}
