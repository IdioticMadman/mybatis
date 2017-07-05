package com.robert.vo;

import com.robert.enmu.Sex;

import java.util.List;

/**
 * Created by robert on 2017/7/4.
 */
public class Student {

    private int id;
    private String cnname;
    private Sex sex;
    private String selfcardNo;
    private String note;
    private StudentSelfcard studentSelfcard;
    private List<StudentLecture> studentLectures;

    public StudentSelfcard getStudentSelfcard() {
        return studentSelfcard;
    }

    public void setStudentSelfcard(StudentSelfcard studentSelfcard) {
        this.studentSelfcard = studentSelfcard;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCnname() {
        return cnname;
    }

    public void setCnname(String cnname) {
        this.cnname = cnname;
    }

    public Sex getSex() {
        return sex;
    }

    public void setSex(Sex sex) {
        this.sex = sex;
    }

    public String getSelfcardNo() {
        return selfcardNo;
    }

    public void setSelfcardNo(String selfcardNo) {
        this.selfcardNo = selfcardNo;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public List<StudentLecture> getStudentLectures() {
        return studentLectures;
    }

    public void setStudentLectures(List<StudentLecture> studentLectures) {
        this.studentLectures = studentLectures;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", cnname='" + cnname + '\'' +
                ", sex=" + sex +
                ", selfcardNo='" + selfcardNo + '\'' +
                ", note='" + note + '\'' +
                ", studentSelfcard=" + studentSelfcard +
                ", studentLectures=" + studentLectures +
                '}';
    }
}
