package com.mdd.mybatis.dao.vo;

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