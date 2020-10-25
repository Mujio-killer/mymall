package com.mujio.mymall.member;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * 想要远程调用别的服务
 *  1.引入open-feign
 *  2.编写接口，告诉SpringCloud这个接口需要调用远程服务
 *      声明接口对应的请求和方法
 *  3.开启远程调用功能
 */
@EnableFeignClients(basePackages = "com.mujio.mymall.member.feign")
@EnableDiscoveryClient
@SpringBootApplication
public class MymallMemberApplication {

    public static void main(String[] args) {
        SpringApplication.run(MymallMemberApplication.class, args);
    }

}
