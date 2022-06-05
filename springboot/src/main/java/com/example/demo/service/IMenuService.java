package com.example.demo.service;

import com.example.demo.entity.Menu;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author 张宇驰
 * @since 2022-06-01
 */
public interface IMenuService extends IService<Menu> {

    List<Menu> findMenus(String name);
}
