package com.rsbdcsn.myblog.service;

import com.rsbdcsn.myblog.bean.User;
import com.rsbdcsn.myblog.common.R;

/**
 * @Description
 * @Author rsbdcsn
 * @Date 2019/9/3 15:32
 * @Versuin 1.00
 */
public interface UserService {

    R CreateUserByUser(User user);

    R removeUserByUserId(int userId);

    R alterUserByUser(User user);

    R queryUserByUserId(int userId);

}
