package com.rsbdcsn.myblog.mapper;

import com.rsbdcsn.myblog.bean.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * @Description
 * @Author rsbdcsn
 * @Date 2019/9/3 15:16
 * @Versuin 1.00
 */
@Mapper
public interface UserMapper {

    int insertUserByUser(User user);

    int deteleUserByUserId(@Param("userId") int userId);

    User selectUserByUserId(@Param("userId") int userId);

}
