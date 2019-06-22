package com.cssl.test;

import java.util.Properties;

import javax.sql.DataSource;

import org.apache.ibatis.plugin.Interceptor;
import org.apache.ibatis.plugin.Plugin;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import com.github.pagehelper.PageInterceptor;

//@ComponentScan("com.cssl")
//@MapperScan("com.cssl.dao")
//@Configuration
//@PropertySource(value = "database.properties")
public class BaseDao {

	//@Autowired
	private Environment env;
	
	//@Bean
	public DataSource getDateSource() {
		DriverManagerDataSource ds=new DriverManagerDataSource();
		ds.setDriverClassName(env.getProperty("jdbc.driver"));
		ds.setUrl(env.getProperty("jdbc.url"));
		ds.setUsername(env.getProperty("jdbc.username"));
		ds.setPassword(env.getProperty("jdbc.password"));
		return ds;
	}
	
	//@Bean
	public SqlSessionFactoryBean getSqlSesionFactory(DataSource dataSource) {
		SqlSessionFactoryBean factory=new SqlSessionFactoryBean();
		factory.setDataSource(dataSource);
		factory.setTypeAliasesPackage("com.cssl.pojo");
		
		Properties p=new Properties();
		//p.setProperty("dialect", "mysql");
		p.setProperty("reasonable", "true");
		p.setProperty("pageSizeZero", "true");
		PageInterceptor pi=new PageInterceptor();
		pi.setProperties(p);
		//添加插件
		factory.setPlugins(new Interceptor[] {pi});
		return factory;
	}
	
	//@Bean
	public PageInterceptor getPlugin(SqlSessionFactoryBean factory) {
		Properties p=new Properties();
		//p.setProperty("dialect", "mysql");
		p.setProperty("reasonable", "true");
		p.setProperty("pageSizeZero", "true");
		PageInterceptor pi=new PageInterceptor();
		pi.setProperties(p);
		//添加插件
		factory.setPlugins(new Interceptor[] {pi});
		return pi;
	}
	
	
	
}
