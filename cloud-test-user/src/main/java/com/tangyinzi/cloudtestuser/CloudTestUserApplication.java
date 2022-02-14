package com.tangyinzi.cloudtestuser;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class CloudTestUserApplication {

	public static void main(String[] args) {
		SpringApplication.run(CloudTestUserApplication.class, args);
	}

}
