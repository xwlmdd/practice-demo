package com.mdd.spring.tx.business;

import com.alibaba.fastjson.JSON;
import com.mdd.spring.tx.dao.vo.Order;
import com.mdd.spring.tx.service.OrderService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

@Service
public class BizService {
    @Resource
    private OrderService orderService;

    /**
     * 由于queryOrderById的传播行为是supoort，那么queryOrderById会加入到serive方法的事务，并且可以洞悉updateOrder的结果
     * 如果queryOrderById的传播行为是not_supoort,request_new，则无法最新获取updateOrder的结果，因为updateOrder事务还没提交
     * @return
     */
    @Transactional
    public Order serive(){
        String orderId = "1540104707166";
        orderService.updateOrder(orderId,8);
        Order order = orderService.queryOrderById(orderId);
        System.out.println(JSON.toJSONString(order));
        return order;
    }
}
