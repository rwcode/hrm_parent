package com.ranwei.hrm;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
@EnableConfigServer //启用配置中心
public class ConfigServer8848Application {
    public static void main(String[] args) {
        SpringApplication.run(ConfigServer8848Application.class,args);
    }
}
