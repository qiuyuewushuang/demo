package com.cssl.service;

import java.util.List;

import com.cssl.pojo.Student;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageInfo;

public interface StudentService {

	List<Student> selectAll();
	
	Page<Student> selectPage(int pageNo,int pageSize);
	
	Student login(String stuNo, String name);
}
