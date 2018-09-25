package com.mdd.mybatis.dao;

import com.mdd.mybatis.dao.vo.Order;

public interface OrderDao {
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
     * @param order
     * @return
     */
    Order queryOrder(Order order);

}
