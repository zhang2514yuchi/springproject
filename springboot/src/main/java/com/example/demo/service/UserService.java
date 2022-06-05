//package com.example.demo.service;
//
//import cn.hutool.log.Log;
//import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
//import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
//import com.example.demo.controller.dto.UserDTO;
//import com.example.demo.entity.User;
//import com.example.demo.mapper.UserMapper;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//
//@Service
//public class UserService extends ServiceImpl<UserMapper, User> {
//
//    public boolean saveUser(User user) {
////        if(user.getId() == null){
////            return save(user);
////        }else{
////            return updateById(user);
////        }
//        return saveOrUpdate(user);
//    }
//    private static final Log LOG = Log.get();
//    public boolean login(UserDTO userDTO) {
//
//        QueryWrapper<User> queryWrapper = new QueryWrapper<>();
//        queryWrapper.eq("username", userDTO.getUsername());
//        queryWrapper.eq("password", userDTO.getPassword());
//        // 处理异常情况
//        try {
//            User one = getOne(queryWrapper);
//            return one != null;
//        } catch (Exception e) {
//            LOG.error(e);
//            return false;
//        }
//    }
//
//
////    @Autowired
////    private UserMapper userMapper;
////
////    public int save(User user){
////        if(user.getId() == null){ //user没有id，则表示是新增
////            return userMapper.inert(user);
////        }else{//否则为更新
////            return userMapper.update(user);
////        }
////    }
//
//}
