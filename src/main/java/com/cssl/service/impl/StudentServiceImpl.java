package com.cssl.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cssl.dao.StudentMapper;
import com.cssl.pojo.Student;
import com.cssl.service.StudentService;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

@Service
public class StudentServiceImpl implements StudentService {
	
	@Autowired
	private StudentMapper sm;

	@Override
	public List<Student> selectAll() {
		return sm.selectAll();
	}

	@Override
	public Page<Student> selectPage(int pageNo, int pageSize) {
		Page<Student> page=PageHelper.startPage(pageNo, pageSize);
		sm.selectAll();
		return page;
	}

	@Override
	public Student login(String stuNo, String name) {
		return sm.selectStudent(stuNo, name);
	}

}
