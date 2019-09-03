package com.rsbdcsn.myblog.bean;

import lombok.Data;

import java.util.Date;

/**
 * @Description
 * @Author rsbdcsn
 * @Date 2019/9/3 14:30
 * @Versuin 1.00
 */
@Data
public class BaseBean {
    private Integer revision;
    private String createdBy;
    private Date createTime;
    private String updatedBy;
    private Date updatedTime;
}
