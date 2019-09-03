package com.rsbdcsn.myblog.common;


import lombok.Getter;
import lombok.Setter;

/**
 * @Description
 * @Author rsbdcsn
 * @Date 2019/9/3 21:33
 * @Versuin 1.00
 */
public class R {

    @Getter@Setter
    private boolean success;

    @Getter@Setter
    private Integer code;

    @Getter@Setter
    private String message;

    @Getter@Setter
    private Object object;

    private R(){}

    public static R ok(){
        R r = new R();
        r.setSuccess(true);
        r.setCode(ResultCode.OK.getCode());
        r.setMessage("成功了");
        return r;
    }

    public static R error(){
        R r = new R();
        r.setSuccess(false);
        r.setCode(ResultCode.ERROR.getCode());
        r.setMessage("失败了");
        return r;
    }

    public R code(Integer code){
        this.setCode(code);
        return this;
    }

    public R data(Object data){
        this.setObject(data);
        return this;
    }
}
