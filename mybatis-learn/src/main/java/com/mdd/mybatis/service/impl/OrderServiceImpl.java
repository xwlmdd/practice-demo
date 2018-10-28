package com.mdd.mybatis.service.impl;

import com.mdd.mybatis.dao.OrderDao;
import com.mdd.mybatis.dao.vo.Order;
import com.mdd.mybatis.dao.vo.Status;
import com.mdd.mybatis.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderServiceImpl implements OrderService {

    @Autowired
    private OrderDao orderDao;

    @Override
    public int saveOrder(Order order) {
        Order.builder().name("月饼")
                .orderId("20132011")
                .status(Status.INIT)
                .type(Order.Type.food)
                .build();
        return orderDao.saveOrder(order);
    }

    @Override
    public Order queryOrder(String orderId) {
        return orderDao.queryOrder(Order.builder().orderId(orderId).build());
    }
}
