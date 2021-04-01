package com.gxm.controller.circularreference;

public class TeacherA {
    private TeacherB teacherB;

    public TeacherA() {
        System.out.println("TeacherA");
    }

    public TeacherB getTeacherB() {
        System.out.println("TeacherA getTeacherB");
        return teacherB;
    }

    public void setTeacherB(TeacherB teacherB) {
        System.out.println("TeacherA setTeacherB");
        this.teacherB = teacherB;
    }
}
