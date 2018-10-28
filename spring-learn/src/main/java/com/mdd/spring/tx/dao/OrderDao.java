package com.mdd.spring.tx.dao;


import com.mdd.spring.tx.dao.vo.Order;
import org.apache.ibatis.annotations.Param;

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
     * @param orderId
     * @return
     */
    Order queryOrder(String orderId);

    /**
     * 根据订单
     * @param orderId
     * @return
     */
    int updateOrder(@Param("orderId") String orderId, @Param("status") Integer status);

}
