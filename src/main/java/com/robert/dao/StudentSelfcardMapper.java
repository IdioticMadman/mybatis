package com.robert.dao;

import com.robert.vo.StudentSelfcard;

/**
 * Created by robert on 2017/7/4.
 */
public interface StudentSelfcardMapper {

    StudentSelfcard findStudentSelfcardByStudentId(int id);
}
