<%@page import="dao.PackageDao"%>
<%@page import="model.Packages"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@include file="p-header.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%int did = Integer.parseInt(request.getParameter("did")); %>
<%List<Packages> list = PackageDao.getPackagesByDid(did); %>
<%out.print(list); %>
</body>
</html>