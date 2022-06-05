package com.example.demo.mapper;

import com.example.demo.entity.User;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface UserMapper {
    @Select("SELECT * FROM sys_user")
    List<User> findAll();

    @Insert("INSERT into sys_user(username,password,nickname,email,phone,address) VALUES (#{username}, #{password}, #{nickname}, #{email}, #{phone}, #{address})")
    int inert(User user);


    int update(User user);
    @Delete("delete from sys_user where id = #{id}")
    Integer deleteById(@Param("id") Integer id);
}