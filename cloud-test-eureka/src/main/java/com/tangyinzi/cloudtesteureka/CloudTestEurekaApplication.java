package com.tangyinzi.cloudtesteureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author 高处不胜寒
 */
@SpringBootApplication
@EnableEurekaServer
public class CloudTestEurekaApplication {

	public static void main(String[] args) {
		SpringApplication.run(CloudTestEurekaApplication.class, args);
	}

}
