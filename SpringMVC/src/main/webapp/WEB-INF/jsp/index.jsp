<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page isELIgnored="false"%>
<!DOCTYPE html>
<html>
<body>
	<form action="save" method="post">
		<table>
			<tr>
				<input type="text" name="name" placeholder="name">
			</tr>
			<tr>
				<input type="text" name="contact" placeholder="contact">
			</tr>
			<tr>
				<input type="text" name="address" placeholder="address">
			</tr>
			<tr>
				<input type="submit" name="action" value="register">
			</tr>
		</table>
	</form>







	<%-- <h2>Hello World!</h2>
	<%int num = (Integer)(request.getAttribute("num")); %>
<%out.print(num); %>
	<h1>${num }</h1>
	<h1>${list }</h1>
	<c:forEach items="${list }" var="a">
		<h1>${a }</h1>
	</c:forEach>
	<h1>
		<a href="home">Home</a>
	</h1> --%>
</body>
</html>