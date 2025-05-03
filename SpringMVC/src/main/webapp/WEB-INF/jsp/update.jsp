<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="${pageContext.request.contextPath }/save" method="post">
		<table>
			<tr>
				<input type="text" name="id" value="${u.id }">
			</tr>
			<tr>
				<input type="text" name="name" value="${u.name }">
			</tr>
			<tr>
				<input type="text" name="contact" value="${u.contact }">
			</tr>
			<tr>
				<input type="text" name="address" value="${u.address }">
			</tr>
			<tr>
				<input type="submit" name="action" value="update">
			</tr>
		</table>
	</form>
</body>
</html>