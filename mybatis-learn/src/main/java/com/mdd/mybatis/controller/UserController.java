package com.mdd.mybatis.controller;

import com.mdd.mybatis.dao.vo.User;
import com.mdd.mybatis.exception.BizException;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class UserController {

    @RequestMapping("getUser")
    public User user(){
        getUser("20132011");
        return User.builder().userId("20132011").build();
    }

    private void getUser(String id)throws BizException{
        throw new BizException("biz");
    }

}
