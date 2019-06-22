package com.cssl.web;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

/**
 * 监听application
 * @author 11692
 *
 */
@WebListener
public class MyListener implements ServletContextListener{

	@Override
	public void contextInitialized(ServletContextEvent sce) {
		System.out.println("application监听器初始化。。。");
	}

	@Override
	public void contextDestroyed(ServletContextEvent sce) {
		System.out.println("application监听器销毁。。。");
	}
	
	

}
