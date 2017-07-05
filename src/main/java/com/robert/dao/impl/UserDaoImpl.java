package com.robert.dao.impl;

import com.robert.dao.UserDao;
import com.robert.vo.User;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

/**
 * Created by robert on 2017/6/21.
 */
public class UserDaoImpl implements UserDao {

    private SqlSession sqlSession;

    public UserDaoImpl(SqlSession sqlSession) {
        this.sqlSession = sqlSession;
    }

    public Integer selectCount() {
        return sqlSession.selectOne("com.robert.vo.selectCount");
    }

    public User queryUserById(Long id) {
        return sqlSession.selectOne("com.robert.vo.getById", id);
    }

    public List<User> queryAllUser() {
        return sqlSession.selectList("com.robert.dao.UserDao.list");
    }

    public List<User> queryUserByYear(String year) {
        return sqlSession.selectList("com.robert.dao.UserDao.queryUserByYear", year);
    }

    public int addUser(User user) {
        return sqlSession.insert("com.robert.vo.insert", user);
    }

    public void updateUser(User user) {
        sqlSession.update("com.robert.vo.update", user);
    }

    public void deleteUserById(Long id) {
        sqlSession.delete("com.robert.vo.delete", id);
    }

    public int login(String userName, String password) {
//        return sqlSession.("com.robert.vo.login", userName, password);
        return 0;
    }
}
