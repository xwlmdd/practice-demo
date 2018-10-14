package com.mdd.mybatis.exception;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

@ControllerAdvice
public class GlobalExceptionHandler {

    /**
     * 处理所有不可知的异常
     * @return
     */
    @ExceptionHandler(Exception.class)
    @ResponseBody
    public String Handle(){
        return "其他异常处理";
    }

    /**
     * 处理所有不可知的异常
     * @return
     */
    @ExceptionHandler(BizException.class)
    @ResponseBody
    public String HandleBizException(){
        return "Biz异常处理";
    }
}
