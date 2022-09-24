package com.BXuan.yygh.hosp.config;

import com.baomidou.mybatisplus.extension.plugins.PaginationInterceptor;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@MapperScan("com.BXuan.yygh.hosp.mapper")
public class HospConfig {
    /**
     * 分页插件
     */
    public PaginationInterceptor paginationInterceptor(){
        return new PaginationInterceptor();
    }
}
