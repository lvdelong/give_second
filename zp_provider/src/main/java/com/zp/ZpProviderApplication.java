package com.zp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class ZpProviderApplication {

    public static void main(String[] args) {
        SpringApplication.run(ZpProviderApplication.class, args);
    }


}
