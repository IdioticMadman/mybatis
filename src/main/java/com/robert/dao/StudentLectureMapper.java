package com.robert.dao;

import com.robert.vo.StudentLecture;

/**
 * Created by robert on 2017/7/5.
 */
public interface StudentLectureMapper {

    StudentLecture findStudentLectureByStudentId(int id);
}
