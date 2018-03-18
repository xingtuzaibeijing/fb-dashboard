package com.fengbang.dashboard.core.config;

import tk.mybatis.mapper.common.Mapper;
import tk.mybatis.mapper.common.MySqlMapper;

/**
 * Created by qiaohao on 2017/8/23.
 */
public interface BaseDao<User> extends Mapper<User> , MySqlMapper<User> {

}
