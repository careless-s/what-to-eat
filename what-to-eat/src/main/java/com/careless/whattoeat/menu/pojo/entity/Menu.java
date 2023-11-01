package com.careless.whattoeat.menu.pojo.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@TableName("menu")
/* 菜谱实体 */
public class Menu {

    /** 主键id */
    @TableId(value = "id_", type = IdType.ASSIGN_UUID)
    private String id;

    /** 菜谱名称 */
    @TableField("name_")
    private String name;

    /** 是否生效 */
    @TableField("is_valid_")
    private Integer isValid;
}
