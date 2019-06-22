package com.cssl.run;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;

@ServletComponentScan("com.cssl.web")
@MapperScan("com.cssl.dao")
@SpringBootApplication
@ComponentScan("com.cssl")
public class App /* extends SpringBootServletInitializer */{

	/**
	 * 发布到独立tomcat时启动springboot项目
	 */
	/*
	 * @Override protected SpringApplicationBuilder
	 * configure(SpringApplicationBuilder builder) { return
	 * builder.sources(App.class); }
	 */
	
	
	
	
	  public static void main(String[] args) { SpringApplication.run(App.class,
	  args); }
	 
}
