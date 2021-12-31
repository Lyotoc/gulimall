package com.lyoto.gulimall.product;

import org.mybatis.spring.annotation.MapperScan;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 @author Lyoto
 @Date 2021-11-21 15:03
 @apiNote
 整合MP
 1.导入依赖
 2.导入mysql-connector（整合至common）
 3.配置application.yaml文件
 	3.1配置数据源
 	3.2配置MP相关配置
 **/
@EnableDiscoveryClient
@SpringBootApplication
@MapperScan( "com.lyoto.gulimall.product.dao")
public class GulimallProductApplication {
	public static void main(String[] args) {
		SpringApplication.run(GulimallProductApplication.class,args);
	}
}
