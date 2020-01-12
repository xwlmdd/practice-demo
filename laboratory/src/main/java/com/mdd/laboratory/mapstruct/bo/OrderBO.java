package com.mdd.laboratory.mapstruct.bo;

import com.mdd.laboratory.mapstruct.enums.Type;
import lombok.*;

import java.util.List;
import java.util.Map;

@Setter
@Getter
@Builder
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class OrderBO {

    private String orderNo;
    private String name;
    private String idNo;
    private String phone;
    private Type type;
    private Integer status;
    private List<ItemBO> items;
    private Map<String,String> orderDescMap;
    private String location;
    private String createTime;

    public static String encryptIdNo(String idNo){
        return "我被加密了，你看不到我";
    }
}

