<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<table>
		<tr>
			<th>学号</th>
			<th>姓名</th>
			<th>班级</th>
			<th>生日</th>
		</tr>
		<c:forEach items="${list }" var="s" varStatus="c">
			<tr>
				<td>${s.stuNo}</td>
				<td>${s.name}</td>
				<td>${s.clazz}</td>
				<td><fmt:formatDate value="${s.birthday}" pattern="yyyy年MM月dd日"/></td>
			</tr>
		</c:forEach>
</body>
</html>