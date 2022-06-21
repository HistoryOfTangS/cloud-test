package com.tangyinzi.cloudtestkubernetesconfig;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class CloudTestKubernetesConfigApplication {
    public static void main(String[] args) {
        SpringApplication.run(CloudTestKubernetesConfigApplication.class, args);
    }
}
