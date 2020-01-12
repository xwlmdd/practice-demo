package com.mdd.laboratory.mapstruct.dto;

import com.mdd.laboratory.mapstruct.enums.Type;
import lombok.*;

import java.util.Date;
import java.util.List;
import java.util.Map;

@Setter
@Getter
@Builder
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class OrderDTO {

    private String orderNo;
    private String name;
    private String idNo;
    private String phoneNum;
    private Type type;
    private Integer status;
    private List<ItemDTO> items;
    private Map<String,String> orderDescMap;
    private Date createTime;
}

