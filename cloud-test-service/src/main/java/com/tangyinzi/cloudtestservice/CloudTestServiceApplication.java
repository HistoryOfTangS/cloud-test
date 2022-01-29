package com.tangyinzi.cloudtestservice;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author 高处不胜寒
 */
@SpringBootApplication
//@EnableDiscoveryClient
public class CloudTestServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(CloudTestServiceApplication.class, args);
	}

}
