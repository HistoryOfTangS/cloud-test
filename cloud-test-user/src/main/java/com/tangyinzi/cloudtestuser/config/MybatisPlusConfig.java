package com.tangyinzi.cloudtestuser.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@MapperScan("com.tangyinzi.cloudtestuser.mapper")
public class MybatisPlusConfig {
}
