package com.tangyinzi.cloudtestservice;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @author 高处不胜寒
 */
@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients(basePackages = {"com.tangyinzi.cloudtestservice.client"})
public class CloudTestServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(CloudTestServiceApplication.class, args);
	}

}
