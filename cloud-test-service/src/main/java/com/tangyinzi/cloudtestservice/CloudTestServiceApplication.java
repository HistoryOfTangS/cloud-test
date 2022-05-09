package com.tangyinzi.cloudtestservice;

import org.mybatis.spring.annotation.MapperScan;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.ApplicationContext;

/**
 * @author 高处不胜寒
 */
@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients(basePackages = {"com.tangyinzi.cloudtestservice.client"})
public class CloudTestServiceApplication {
	private static final Logger logger = LoggerFactory.getLogger(CloudTestServiceApplication.class);

	public CloudTestServiceApplication(ApplicationContext ctx){

		logger.info("激活的配置(mytest): {}", ctx.getEnvironment().getProperty("mytest"));

	}

	public static void main(String[] args) {
		SpringApplication.run(CloudTestServiceApplication.class, args);
	}

}
