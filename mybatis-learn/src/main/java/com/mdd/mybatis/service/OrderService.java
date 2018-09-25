package com.mdd.mybatis.service;

import com.mdd.mybatis.dao.vo.Order;

public interface OrderService {
    /**
     * 保存订单
     *
     * @param order
     * @return
     */
    int saveOrder(Order order);

    /**
     * 查询订单
     *
     * @param orderId
     * @return
     */
    Order queryOrder(String orderId);
}
