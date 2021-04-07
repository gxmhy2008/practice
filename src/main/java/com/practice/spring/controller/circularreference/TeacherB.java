package com.practice.spring.controller.circularreference;

public class TeacherB {
    private TeacherA teacherA;

    public TeacherB() {
        System.out.println("TeacherB");
    }

    public TeacherA getTeacherA() {
        System.out.println("TeacherB getTeacherA");
        return teacherA;
    }

    public void setTeacherA(TeacherA teacherA) {
        System.out.println("TeacherB setTeacherA");
        this.teacherA = teacherA;
    }
}
