package com.example.demo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import com.example.demo.web.interceptor.JwtInterceptor;
@Configuration
public class WebConfigurer implements WebMvcConfigurer{
	 @Override
	 public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(JwtInterceptor()).addPathPatterns("/**");
	 }
	 
	 @Bean
	 public JwtInterceptor JwtInterceptor() {
		 return new JwtInterceptor();
	 }

}
