package com.robert.test;

import com.robert.dao.StudentMapper;
import com.robert.dao.UserDao;
import com.robert.dao.impl.UserDaoImpl;
import com.robert.util.SqlSessionFactoryUtil;
import com.robert.vo.Student;
import com.robert.vo.StudentLecture;
import com.robert.vo.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/**
 * Created by robert on 2017/6/21.
 */
public class Test {

    public static void main(String[] args) {

        SqlSession sqlSession = SqlSessionFactoryUtil.openSqlSession();
        try {
            StudentMapper studentMapper = sqlSession.getMapper(StudentMapper.class);
            Student student = studentMapper.getStudent(1);
            List<StudentLecture> studentLectures = student.getStudentLectures();
            for (StudentLecture studentLecture : studentLectures) {
                System.out.println(studentLecture);
            }
            System.out.println(student.toString());
            sqlSession.commit();
        } catch (Exception e) {
            e.printStackTrace();
            sqlSession.rollback();
        }
    }

}
