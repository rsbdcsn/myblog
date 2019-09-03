package com.rsbdcsn.myblog.bean;

import lombok.Data;

import java.util.Date;

/**
 * @Description
 * @Author rsbdcsn
 * @Date 2019/9/3 14:24
 * @Versuin 1.00
 */
@Data
public class Article extends BaseBean{
    private Integer articleId;
    private Integer userId;
    private String articleContent;
    private Date articleCreateDate;
    private Date articleAlterDate;
    private int articleVisit;
    private int articleCommentCount;
}
