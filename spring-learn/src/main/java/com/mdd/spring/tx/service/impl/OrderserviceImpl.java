package com.mdd.spring.tx.service.impl;

import com.mdd.spring.tx.dao.OrderDao;
import com.mdd.spring.tx.dao.vo.Order;
import com.mdd.spring.tx.service.OrderService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

@Service
public class OrderserviceImpl implements OrderService {

    @Resource
    private OrderDao orderDao;

    @Override
    public int updateOrder(String orderId,Integer status) {
        return orderDao.updateOrder(orderId,status);
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRES_NEW)
    public Order queryOrderById(String orderId) {
        return orderDao.queryOrder(orderId);
    }


}
