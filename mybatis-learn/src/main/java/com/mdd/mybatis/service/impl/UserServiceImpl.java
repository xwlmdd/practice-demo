package com.mdd.mybatis.service.impl;

import com.mdd.mybatis.dao.UserDao;
import com.mdd.mybatis.dao.vo.User;
import com.mdd.mybatis.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service("userService")
public class UserServiceImpl implements UserService {
    @Resource
    private UserDao userDao;

    @Override
    public int saveUser(User user) {
        return userDao.saveUser(user);
    }

    @Override
    public User queryUser(User user) {
        return userDao.queryUser(user);
    }
}
