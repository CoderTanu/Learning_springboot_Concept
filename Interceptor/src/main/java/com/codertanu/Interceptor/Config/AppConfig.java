package com.codertanu.Interceptor.Config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import com.codertanu.Interceptor.Interceptor.CustomInterceptor;

public class AppConfig  implements WebMvcConfigurer{
	
	@Autowired
	CustomInterceptor  customInterceptor;
	
	public void addInterceptor(InterceptorRegistry registry) {
		registry.addInterceptor(customInterceptor)
		.addPathPatterns("/api/*")
		.excludePathPatterns("/api/updateUser","/api/deleteUser");
	}

}
