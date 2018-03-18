package com.fengbang.dashboard.core.config;

import org.springframework.jdbc.datasource.lookup.AbstractRoutingDataSource;

/**
 * @description:
 * @author:QianHuaSheng
 * @since:2018/1/17
 */
public class DynamicDataSource extends AbstractRoutingDataSource {

    @Override
    protected Object determineCurrentLookupKey() {
        return DynamicDataSourceContextHolder.getDataSourceType();
    }

}
