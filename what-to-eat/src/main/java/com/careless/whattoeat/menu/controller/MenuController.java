package com.careless.whattoeat.menu.controller;

import com.careless.whattoeat.menu.service.MenuService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@AllArgsConstructor
@RestController
@CrossOrigin("*")
@RequestMapping("/menu")
public class MenuController {

    private MenuService menuService;

    /**
     * 随机获取菜单
     *
     * @param num 菜单数量
     * @return 菜单名数组
     */
    @GetMapping("/list")
    public List<String> listMenu(@RequestParam Integer num) {
        return menuService.listMenu(num);
    }
}
