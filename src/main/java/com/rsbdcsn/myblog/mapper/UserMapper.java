package com.rsbdcsn.myblog.mapper;

import com.rsbdcsn.myblog.bean.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

/**
 * @Description
 * @Author rsbdcsn
 * @Date 2019/9/3 15:16
 * @Versuin 1.00
 */
@Mapper
@Repository
public interface UserMapper {

    int insertUserByUser(User user);

    int deteleUserByUserId(int userId);

    int updateUserByUser(User user);

    User selectUserByUserId(int userId);

}
