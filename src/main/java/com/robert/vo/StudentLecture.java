package com.robert.vo;

import java.math.BigDecimal;

/**
 * Created by robert on 2017/7/5.
 */
public class StudentLecture {
    private int id;
    private int studentId;
    private int lectureId;
    private BigDecimal grade;
    private String note;

    private Lecture lecture;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public int getLectureId() {
        return lectureId;
    }

    public void setLectureId(int lectureId) {
        this.lectureId = lectureId;
    }

    public BigDecimal getGrade() {
        return grade;
    }

    public void setGrade(BigDecimal grade) {
        this.grade = grade;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public Lecture getLecture() {
        return lecture;
    }

    public void setLecture(Lecture lecture) {
        this.lecture = lecture;
    }

    @Override
    public String toString() {
        return "StudentLecture{" +
                "id=" + id +
                ", studentId=" + studentId +
                ", lectureId=" + lectureId +
                ", grade=" + grade +
                ", note='" + note + '\'' +
                ", lecture=" + lecture +
                '}';
    }
}
