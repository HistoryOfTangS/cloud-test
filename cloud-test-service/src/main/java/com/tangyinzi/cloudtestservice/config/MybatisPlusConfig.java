package com.tangyinzi.cloudtestservice.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@MapperScan("com.tangyinzi.cloudtestservice.mapper")
public class MybatisPlusConfig {
}
