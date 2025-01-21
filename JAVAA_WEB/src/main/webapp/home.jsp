<%@page import="model.User"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
User u =null;
if(session.getAttribute("data")!=null){
	 u = (User)session.getAttribute("data");
}
else
{
	response.sendRedirect("login.jsp");
}
%>
<h2>Welcome, <%out.print(u.getName()); %></h2>
<h4>Contact: <%out.print(u.getContact()); %></h4>
<h4>Address: <%out.print(u.getAddress()); %></h4>
<h4>Email: <%out.print(u.getEmail()); %></h4>
<h4>Password: <%out.print(u.getPassword()); %></h4>
</body>
</html>