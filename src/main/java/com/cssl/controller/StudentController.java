package com.cssl.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.cssl.pojo.Student;
import com.cssl.service.StudentService;
import com.github.pagehelper.Page;

@Controller
public class StudentController {
	
	@Autowired
	private StudentService ss;
	
	@RequestMapping("/test/{pageNo}/{pageSize}")
	public String test(@PathVariable int pageNo,@PathVariable int pageSize,Model model) {
		Page<Student> list=ss.selectPage(pageNo,pageSize);
		System.out.println(list);
		model.addAttribute("list",list);
		return "/list.jsp";
	}
	
	@PostMapping("/login")
	public String login(String stuNo, String name,Model model) {
		Student stu=ss.login(stuNo,name);
		if(stu==null) {
			return "redirect:/login.jsp?code=1";
		}
		model.addAttribute(stu);
		return "success.jsp";
	}
}
