package com.mdd.mybatis.service;

import com.alibaba.fastjson.JSON;
import com.mdd.mybatis.BaseTest;
import com.mdd.mybatis.dao.vo.Order;
import org.junit.Test;

import javax.annotation.Resource;

public class OrderServiceTest extends BaseTest {
    @Resource
    private OrderService orderService;

    @Test
    public void saveUserTest() {
        Order order = Order.builder()
                .orderId(System.currentTimeMillis() + "")
                .name("月饼")
                .status(Order.Status.INIT)
                .type(Order.Type.food)
                .build();
        orderService.saveOrder(order);
    }

    @Test
    public void queryUserTest() {
        Order order = orderService.queryOrder("");
        System.out.println(JSON.toJSONString(order));
    }
}
