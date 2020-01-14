package com.mdd.laboratory.mapstruct;

import com.mdd.laboratory.mapstruct.bo.OrderBO;
import com.mdd.laboratory.mapstruct.dto.ItemDTO;
import com.mdd.laboratory.mapstruct.dto.OrderDTO;
import com.mdd.laboratory.mapstruct.enums.Type;
import com.mdd.laboratory.mapstruct.mapper.OrderMapper;
import lombok.extern.slf4j.Slf4j;
import org.mapstruct.factory.Mappers;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Arrays;
import java.util.Date;

@Slf4j
public class OrderService {

    @Autowired
    private OrderMapper orderMapper;

    public static void main(String[] args) {

        OrderDTO orderDTO = OrderDTO.builder()
                .name("支付订单")
                .orderNo("P0001")
                .status(1)
                .idNo("007")
                .phoneNum("110")
                .type(Type.advertising)
                .items(Arrays.asList(ItemDTO.builder().itemName("毛豆").build()))
                .createTime(new Date())
                .build();
        // 一、映射器接口应定义一个名为 INSTANCE 的成员变量，该成员变量包含映射器类型的单个实例
        OrderBO orderBO = OrderMapper.INSTANCE.convertBO(orderDTO);
        log.info("{}", orderBO);

        OrderMapper mapper = Mappers.getMapper(OrderMapper.class);


    }
}
