package com.robert.vo;

import java.util.Date;

/**
 * Created by robert on 2017/7/4.
 */
public class StudentSelfcard {

    private int id;
    private String studentId;
    private String native_;
    private Date issueDate;
    private Date endDate;
    private String note;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public String getNative_() {
        return native_;
    }

    public void setNative_(String native_) {
        this.native_ = native_;
    }

    public Date getIssueDate() {
        return issueDate;
    }

    public void setIssueDate(Date issueDate) {
        this.issueDate = issueDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    @Override
    public String toString() {
        return "StudentSelfcard{" +
                "id=" + id +
                ", studentId='" + studentId + '\'' +
                ", native_='" + native_ + '\'' +
                ", issueDate=" + issueDate +
                ", endDate=" + endDate +
                ", note='" + note + '\'' +
                '}';
    }
}
