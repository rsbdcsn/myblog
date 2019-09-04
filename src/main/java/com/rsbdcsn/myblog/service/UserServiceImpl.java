package com.rsbdcsn.myblog.service;

import com.rsbdcsn.myblog.bean.User;
import com.rsbdcsn.myblog.common.R;
import com.rsbdcsn.myblog.mapper.UserMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @Description
 * @Author rsbdcsn
 * @Date 2019/9/3 16:23
 * @Versuin 1.00
 */
@Service
public class UserServiceImpl implements UserService {

    @Resource
    UserMapper userMapper;

    @Override
    public R CreateUserByUser(User user) {
        int result = userMapper.insertUserByUser(user);
        return R.ok().data(result);
    }

     @Override
    public R removeUserByUserId(int userId) {
         int result = userMapper.deteleUserByUserId(userId);
         return R.ok().data(result);
    }

    @Override
    public R alterUserByUser(User user) {
        int deleteRusult = userMapper.deteleUserByUserId(user.getUserId());
        int alterResult = 0;
        if(deleteRusult == 1){
            alterResult = userMapper.insertUserByUser(user);
        }
        if(alterResult == 1){
            return R.ok().data(alterResult);
        }else{
            return R.error().data(alterResult);
        }
    }

    @Override
    public R queryUserByUserId(int userId) {
        User user = userMapper.selectUserByUserId(userId);
        return R.ok().data(user);
    }
}
