package com.mdd.mybatis.dao;

import com.mdd.mybatis.dao.vo.User;

public interface UserDao {
    /**
     * 保存用户
     *
     * @param user
     * @return
     */
    int saveUser(User user);

    /**
     * 保存用户
     *
     * @param user
     * @return
     */
    int saveUserWithType(User user);

    /**
     * 查询用户
     *
     * @param user
     * @return
     */
    User queryUser(User user);

}
