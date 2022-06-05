package com.example.demo.service;

import com.example.demo.controller.dto.UserDTO;
import com.example.demo.entity.User;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author 张宇驰
 * @since 2022-05-30
 */
public interface IUserService extends IService<User> {

    UserDTO login(UserDTO userDTO);

    Object register(UserDTO userDTO);
}