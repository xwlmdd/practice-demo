package com.mdd.mybatis.service;

import com.mdd.mybatis.dao.vo.User;

public interface UserService {
    /**
     * 保存用户
     *
     * @param user
     * @return
     */
    int saveUser(User user);

    /**
     * 查询用户
     *
     * @param user
     * @return
     */
    User queryUser(User user);
}
