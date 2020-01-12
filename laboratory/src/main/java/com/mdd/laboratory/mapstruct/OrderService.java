package com.mdd.laboratory.mapstruct;

import com.mdd.laboratory.mapstruct.bo.OrderBO;
import com.mdd.laboratory.mapstruct.dto.ItemDTO;
import com.mdd.laboratory.mapstruct.dto.OrderDTO;
import com.mdd.laboratory.mapstruct.enums.Type;
import com.mdd.laboratory.mapstruct.mapper.OrderMapper;
import lombok.extern.slf4j.Slf4j;

import java.util.Arrays;
import java.util.Date;

@Slf4j
public class OrderService {

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
        OrderBO orderBO = OrderMapper.INSTANCE.convertBO(orderDTO);
        log.info("{}", orderBO);

//        Mappers.getMapper()

    }
}
