package com.fengbang.dashboard.core.util;

import tk.mybatis.mapper.entity.Example;

import java.util.Map;

/**
 * @description:
 * @author:QianHuaSheng
 * @since:2018/2/27
 */
public class ExampleUtil {
    public static Example getExample(Class cla, Map<String, String> map, String order) {
        Example example = new Example(cla);
        Example.Criteria criteria = example.createCriteria();
        if (map != null) {
            for (String key : map.keySet()) {
                String s = map.get(key);
                criteria.andEqualTo(key, s);
            }
        }
        if (order != null && !"".equals(order)) {
            example.setOrderByClause(order);
        }
        return example;
    }
}
