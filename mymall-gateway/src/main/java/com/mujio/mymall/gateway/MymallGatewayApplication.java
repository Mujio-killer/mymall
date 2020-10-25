package com.mujio.mymall.gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * 使用网关
 *  1. 开启服务注册发现
 *      配置注册地址
 */
@EnableDiscoveryClient
//暂时不需要数据源配置可以在pom排除jdbc相关信息，也可以在这里排除相关类
@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
public class MymallGatewayApplication {

    public static void main(String[] args) {
        SpringApplication.run(MymallGatewayApplication.class, args);
        System.out.println();

    }

}
