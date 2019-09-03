package com.rsbdcsn.myblog.bean;


import lombok.Data;

import java.util.Date;

/**
 * @version 1.00
 * @Description:
 * @Author rsbdcsn
 * @Date 2019/9/3 13:51
 */
@Data
public class User extends BaseBean{
    private Integer userId;
    private String userIp;
    private String userName;
    private String userPassword;
    private String userNickname;
    private String userImage;
    private String userEmail;
    private String userQq;
    private String userTelephoneNumber;
    private Date userRegistrationTime;
    private String userStatus;
}
