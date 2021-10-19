package com.xieps.spring.hello.service.impl;

import com.xieps.spring.hello.dao.UserDao;
import com.xieps.spring.hello.dao.impl.UserDaoImpl;
import com.xieps.spring.hello.dao.impl.UserMySqlDaoImpl;
import com.xieps.spring.hello.service.UserService;

/**
 * @author xieps
 * @version 1.0
 * @date 2021/10/16 20:39
 */
public class UserServiceImpl implements UserService {

    //private UserDao userDao = new UserDaoImpl();
    //private UserDao userDao = new UserMySqlDaoImpl();

    private UserDao userDao;

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public void getUserInfo() {

        userDao.getUserInfo();

    }

}
