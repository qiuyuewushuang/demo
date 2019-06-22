<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="login" method="post">
		<h2 style="color:red;">${param.code eq 1?"用户名或密码错误":"" }</h2>
		<p>学号：<input type="text" name="stuNo"></p>
		<p>姓名：<input type="text" name="name"></p>
		<p><input type="image" src="image/login.jpg"></p>
	</form>
</body>
</html>