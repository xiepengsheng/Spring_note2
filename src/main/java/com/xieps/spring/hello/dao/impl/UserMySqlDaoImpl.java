package com.xieps.spring.hello.dao.impl;

import com.xieps.spring.hello.dao.UserDao;

/**
 * @author xieps
 * @version 1.0
 * @date 2021/10/16 21:16
 */
public class UserMySqlDaoImpl implements UserDao {

    @Override
    public void getUserInfo() {
        System.out.println("mysql中获取用户信息.0.....");
    }
}
