package com.mujio.mymall.coupon;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

//@MapperScan("com.mujio.mymall.coupon.dao")

/**
 * 使用nacos的配置中心功能
 *  1. 引入依赖
 *  2. 创建bootstra.properties，指定配置中心地址与服务名称
 *          spring.cloud.nacos.config.server-addr=127.0.0.1:8848
 *          spring.application.name=mymall-coupon
 *  3. 在nacos管理页面给配置中心添加默认数据集(Data Id):mymall-coupon.properties  默认名称为：应用名+properties
 *  4. 将配置写入 数据集
 *  5. 添加动态刷新注解 @RefreshScope :动态获取并刷新配置(操作步骤4应当早于配置中心服务的启动)
 *  6. 配置中心和当前应用中都配置了相同的项，优先使用配置中心的
 */
// 注册到nacos
@EnableDiscoveryClient
@SpringBootApplication
public class MymallCouponApplication {

    public static void main(String[] args) {
        SpringApplication.run(MymallCouponApplication.class, args);
    }

}
