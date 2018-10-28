package com.mdd.mybatis.dao.vo;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Order {
    private Long id;
    private String orderId;
    private String name;
    private Type type;
    private Status status;

    public enum Type {
        education, advertising, trip, food
    }
}
