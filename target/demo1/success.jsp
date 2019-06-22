<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>登录成功</h1>
	<p>学生信息：</p>
	<p>学号：${student.stuNo }</p>
	<p>姓名：${student.name }</p>
	<p>班级：${student.clazz }</p>
	<p>生日：<fmt:formatDate value="${student.birthday }" pattern="yyyy年MM月dd日"/></p>
</body>
</html>