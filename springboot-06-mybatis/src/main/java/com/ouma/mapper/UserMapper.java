package com.ouma.mapper;

import com.ouma.pojo.User;
//import org.apache.ibatis.annotations.Mapper;
//import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

//@Mapper

public interface UserMapper {

//    @Select("select * from t_user")
    public List<User> findAll();
}
