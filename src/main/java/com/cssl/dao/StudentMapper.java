package com.cssl.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.cssl.pojo.Student;

public interface StudentMapper {

	/**
	 * 查询所有学生
	 * @return
	 */
	List<Student> selectAll();
	
	/**
	 * 
	 * @param stuNo
	 * @param name
	 * @return
	 */
	Student selectStudent(@Param("stuNo")String stuNo,@Param("name") String name);
}
