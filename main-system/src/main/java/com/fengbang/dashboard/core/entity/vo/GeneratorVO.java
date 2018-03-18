package com.fengbang.dashboard.core.entity.vo;

import lombok.Data;

/**
 * @description:
 * @author:QianHuaSheng
 * @since:2018/2/27
 */
@Data
public class GeneratorVO {
    //菜单名称
    private String menuName;
    //上级ID
    private String menuSuperior;
    //菜单路径（没必要了）
//    private String menuResource;
    //生成表名
    private String tableName;
    //生成类型（要生成的项目）
    private String type;
    //所要生成的数据库
    private String dateBase;
}
