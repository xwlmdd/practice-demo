package com.mdd.mybatis.service;

import com.alibaba.fastjson.JSON;
import com.mdd.mybatis.BaseTest;
import com.mdd.mybatis.dao.vo.User;
import org.junit.Test;

import javax.annotation.Resource;

public class UserServiceTest extends BaseTest {
    @Resource
    private UserService userService;

    @Test
    public void saveUserTest(){
        User user = User.builder()
                .age(18)
                .name("毛豆豆")
                .password("123456")
                .userId("20132011")
                .build();

        userService.saveUser(user);
    }

    @Test
    public void queryUserTest(){
        User param = User.builder()
                .userId("20132011")
                .build();

        User user = userService.queryUser(param);
        System.out.println(JSON.toJSONString(user));
    }
}
