package com.learn.mybatis.dao;

import com.learn.mybatis.pojo.User;

/**
 * @program: mybatis
 * @description
 * @author: Mr.Yang
 * @create: 2021-07-16 11:41
 **/
public interface UserDao {
    public User selectUser(Integer id);
}
