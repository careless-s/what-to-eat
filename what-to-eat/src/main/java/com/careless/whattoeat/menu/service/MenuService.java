package com.careless.whattoeat.menu.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.careless.whattoeat.menu.pojo.entity.Menu;

import java.util.List;

public interface MenuService extends IService<Menu>  {

    /**
     * 随机获取菜单
     *
     * @param num 菜单数量
     * @return 菜单名数组
     */
    List<String> listMenu(Integer num);
}
