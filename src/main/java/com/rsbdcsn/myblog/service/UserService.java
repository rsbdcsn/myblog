package com.rsbdcsn.myblog.service;

import com.rsbdcsn.myblog.bean.User;

/**
 * @version 1.00
 * @Description:
 * @Author rsbdcsn
 * @Date 2019/9/3 15:32
 */
public interface UserService {

    User CreateUserByUser(User user);

    int removeUserByUserId(int userId);

    int alterUserByUser(User user);

    int queryUserByUserId(int userId);

}
