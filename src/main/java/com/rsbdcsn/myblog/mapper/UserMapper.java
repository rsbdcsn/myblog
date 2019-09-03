package com.rsbdcsn.myblog.mapper;

import com.rsbdcsn.myblog.bean.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

/**
 * @version 1.00
 * @Description:
 * @Author rsbdcsn
 * @Date 2019/9/3 15:16
 */
@Mapper
@Repository
public interface UserMapper {

    User insertUserByUser(User user);

    int deteleUserByUserId(int userId);

    int updateUserByUser(User user);

    int selectUserByUserId(int userId);

}
