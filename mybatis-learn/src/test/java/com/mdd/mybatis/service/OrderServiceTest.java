package com.mdd.mybatis.service;

import com.alibaba.fastjson.JSON;
import com.mdd.mybatis.BaseTest;
import com.mdd.mybatis.dao.vo.Order;
import com.mdd.mybatis.dao.vo.Status;
import org.junit.Test;

import javax.annotation.Resource;

public class OrderServiceTest extends BaseTest {
    @Resource
    private OrderService orderService;

    @Test
    public void saveOrderTest() {
        Order order = Order.builder()
                .orderId(System.currentTimeMillis() + "")
                .name("月饼")
                .status(Status.CANCELED)
                .type(Order.Type.food)
                .build();
        orderService.saveOrder(order);
    }

    @Test
    public void queryOrderTest() {
        Order order = orderService.queryOrder("");
        System.out.println(JSON.toJSONString(order));
    }
}
