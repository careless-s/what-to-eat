package com.careless.whattoeat.menu.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.careless.whattoeat.menu.mapper.MenuMapper;
import com.careless.whattoeat.menu.pojo.entity.Menu;
import com.careless.whattoeat.menu.service.MenuService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;

@Service
@AllArgsConstructor
public class MenuServiceImpl extends ServiceImpl<MenuMapper, Menu> implements MenuService {

    /**
     * 随机获取菜单
     *
     * @param num 菜单数量
     * @return 菜单名数组
     */
    @Override
    public List<String> listMenu(Integer num) {
        int compareResult = num.compareTo(10);
        if (compareResult > 0) {
            throw new RuntimeException("你是猪吗？？？");
        }
        List<Menu> menuList = list();
        if (num.compareTo(menuList.size()) >= 0) {
            return menuList.stream().map(Menu::getName).toList();
        }
        // 随机排列menuList中的元素
        Collections.shuffle(menuList);
        // 取前num个元素作为随机选择的结果
        return menuList.subList(0, num).stream().map(Menu::getName).toList();
    }
}
