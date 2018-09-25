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

    public enum Status {

        INIT(1), SUCCESS(2), FAIL(3), CANCELED(4);

        private Integer status;


        public Integer getStatus() {
            return status;
        }

        public void setStatus(Integer status) {
            this.status = status;
        }

        Status(Integer status) {
            this.status = status;
        }
    }

    public enum Type {
        education, advertising, trip, food
    }
}
