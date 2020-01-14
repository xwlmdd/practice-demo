package com.mdd.laboratory.mapstruct.mapper;

import com.mdd.laboratory.mapstruct.bo.OrderBO;
import com.mdd.laboratory.mapstruct.dto.AddressDTO;
import com.mdd.laboratory.mapstruct.dto.OrderDTO;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring")
public interface OrderMapper {

    OrderMapper INSTANCE = Mappers.getMapper(OrderMapper.class);

    @Mappings({
            @Mapping(source = "phoneNum", target = "phone"),
            @Mapping(target = "name",source = "name",defaultValue = "笔记本"),
            @Mapping(target = "idNo", expression = "java(com.mdd.laboratory.mapstruct.bo.OrderBO.encryptIdNo(orderDTO.getIdNo()))"),
            @Mapping(target = "createTime",source = "createTime",dateFormat = "yyyy-MM-dd")
    })
    // 1、使用expression 就不需要声明 source 2、使用expression java方法是可访问的权限
    OrderBO convertBO(OrderDTO orderDTO);
    // 多个源参数的映射方法
    OrderBO convertBO2(OrderDTO orderDTO, AddressDTO addressDTO);
}
