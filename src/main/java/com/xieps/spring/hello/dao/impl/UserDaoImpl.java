package com.xieps.spring.hello.dao.impl;

import com.xieps.spring.hello.dao.UserDao;

/**
 * @author xieps
 * @version 1.0
 * @date 2021/10/16 20:37
 */
public class UserDaoImpl implements UserDao {

    @Override
    public void getUserInfo() {
        System.out.println("默认获取userInfo信息.................");
    }
}
