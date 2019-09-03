package com.rsbdcsn.myblog.service;

import com.rsbdcsn.myblog.bean.User;
import com.rsbdcsn.myblog.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @version 1.00
 * @Description:
 * @Author rsbdcsn
 * @Date 2019/9/3 16:23
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserMapper userMapper;

    @Override
    public User CreateUserByUser(User user) {
        User resultUser = userMapper.insertUserByUser(user);
        return resultUser;
    }

    @Override
    public int removeUserByUserId(int userId) {
        int result = userMapper.deteleUserByUserId(userId);
        return result;
    }

    @Override
    public int alterUserByUser(User user) {
        int result = userMapper.updateUserByUser(user);
        return result;
    }

    @Override
    public int queryUserByUserId(int userId) {
        int result = userMapper.selectUserByUserId(userId);
        return result;
    }
}
