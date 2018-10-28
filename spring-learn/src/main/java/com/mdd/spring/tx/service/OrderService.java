package com.mdd.spring.tx.service;

import com.mdd.spring.tx.dao.vo.Order;

public interface OrderService {

    int updateOrder(String orderId,Integer status);

    Order queryOrderById(String orderId);
}
