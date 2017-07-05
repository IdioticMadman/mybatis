package com.robert.dao;

import com.robert.vo.User;

import java.util.List;

/**
 * Created by robert on 2017/6/21.
 */
public interface UserDao {
    public Integer selectCount();

    /**
     * 根据id查询用户信息
     *
     * @param id
     * @return
     */
    public User queryUserById(Long id);

    /**
     * 查询所有用户
     *
     * @return
     */
    public List<User> queryAllUser();

    /**
     * 添加用户信息
     *
     * @param user
     */
    public int addUser(User user);

    /**
     * 修改用户信息
     *
     * @param user
     */
    public void updateUser(User user);

    /**
     * 根据id删除用户信息
     *
     * @param id
     */
    public void deleteUserById(Long id);

    int login(String userName, String password);

    List<User> queryUserByYear(String year);

}
