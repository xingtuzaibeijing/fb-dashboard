package com.fengbang.dashboard.core;

import com.fengbang.dashboard.core.config.DynamicDataSourceRegister;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;

/**
 * @description:
 * @author:QianHuaSheng
 * @since:2018/1/12
 */
@Import({DynamicDataSourceRegister.class})
@SpringBootApplication
@MapperScan(basePackages = {"com.fengbang.dashboard.core.dao"})
@EnableAutoConfiguration
public class applicationDashBoard {
    public static void main(String[] args) {
        // TODO Auto-generated method stub4
        SpringApplication.run(applicationDashBoard.class, args);
    }
}
