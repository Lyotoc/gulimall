package com.lyoto.gulimall.gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * 1.开启服务注册发现
 * (配置注册中心地址)
 *
 * @author MR.L
 */
@SpringBootApplication
@EnableDiscoveryClient
public class GulimallGatewayApplication {

	public static void main(String[] args) {
		SpringApplication.run(GulimallGatewayApplication.class, args);
	}

}
