package com.tangyinzi.cloudtestconfig;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class CloudTestConfigApplication {

    public static void main(String[] args) {
        SpringApplication.run(CloudTestConfigApplication.class, args);
    }
}
