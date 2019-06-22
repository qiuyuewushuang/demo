package com.cssl.test;

import java.util.List;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.support.AbstractApplicationContext;

import com.cssl.pojo.Student;
import com.cssl.service.StudentService;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;


public class Spring {

	public static void main(String[] args) {
		AbstractApplicationContext c=new AnnotationConfigApplicationContext(BaseDao.class);
		StudentService ss=c.getBean(StudentService.class);
		Page<Student> list=ss.selectPage(1,3);
		System.out.println("page:"+list);
		for (Student s : list.getResult()) {
			System.out.println(s.getStuNo()+"\t"+s.getName());
		}
		c.close();
	}
}
