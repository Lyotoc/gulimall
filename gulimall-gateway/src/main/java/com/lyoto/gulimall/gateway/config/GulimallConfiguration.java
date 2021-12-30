package com.lyoto.gulimall.gateway.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.reactive.CorsWebFilter;
import org.springframework.web.cors.reactive.UrlBasedCorsConfigurationSource;

/**
 @author Lyoto
 @Description
 @Date 2021-12-28 17:37
 @Version
 **/

@Configuration
public class GulimallConfiguration {
	@Bean
	public CorsWebFilter corsWebFilter(){
		UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();
		//跨域配置信息
		CorsConfiguration corsConfiguration = new CorsConfiguration();
		//1、配置跨域
		corsConfiguration.addAllowedHeader("*");
		corsConfiguration.addAllowedMethod("*");
		corsConfiguration.addAllowedOrigin("*");
		corsConfiguration.setAllowCredentials(true);
		source.registerCorsConfiguration("/**",corsConfiguration);
		return new CorsWebFilter(source);
	}
}
