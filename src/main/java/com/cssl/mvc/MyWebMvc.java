package com.cssl.mvc;


import org.springframework.stereotype.Component;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import com.cssl.intercepor.MyIntercepor;

@Component
public class MyWebMvc implements WebMvcConfigurer{

	/**
	 *注册自定义拦截器
	 */
	@Override
	public void addInterceptors(InterceptorRegistry registry) {
		MyIntercepor mi=new MyIntercepor();
		registry.addInterceptor(mi).addPathPatterns("/**").excludePathPatterns("/image/**");
	}
	
	

	
}
