package com.fengbang.dashboard.core.util;

import lombok.Data;

/**
 * @author luxin
 * @ClassName: PageQuery
 * @Description: 分页查询对象抽象类
 * @date: 2017/8/30 19:55
 */
@Data
public class PageQuery {

    public PageQuery() {

    }

    public PageQuery(Integer currentPage, Integer pageSize) {
        this.currenPage = currentPage;
        this.pageSize = pageSize;
    }

    public PageQuery(Integer currentPage) {
        this.currenPage = currentPage;
    }

    /**
     * @Fields : 当前页数
     */
    private Integer currenPage;

    /**
     * @Fields : 每页显示条数
     */
    private Integer pageSize;

}