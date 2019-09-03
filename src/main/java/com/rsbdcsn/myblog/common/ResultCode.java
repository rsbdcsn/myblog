package com.rsbdcsn.myblog.common;

/**
 * @Description
 * @Author rsbdcsn
 * @Date 2019/9/3 21:40
 * @Versuin 1.00
 */
public enum ResultCode {

    OK(20000),
    ERROR(20001),
    LOGIN_ERROR(20002),
    ACCESS_LOGIN(20003),
    REMOTE_ERROR(20004),
    REPEAT_ERROR(20005);

    private int code;

    ResultCode(Integer code){
        this.code = code;
    }

    public Integer getCode(){
        return code;
    }
}
