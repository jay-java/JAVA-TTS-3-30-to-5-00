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
String email = null;
if(session.getAttribute("email")!=null){
	email  = (String)session.getAttribute("email");
}
else{
	response.sendRedirect("a-login.jsp");
}
%>
<div class="wrapper">
	<nav class="navbar navbar-default navbar-cls-top " role="navigation"
			style="margin-bottom: 0">
			<div class="navbar-header">
				<button type="button" class="navbar-toggle" data-toggle="collapse"
					data-target=".sidebar-collapse">
					<span class="sr-only">Toggle navigation</span> <span
						class="icon-bar"></span> <span class="icon-bar"></span> <span
						class="icon-bar"></span>
				</button>
				<a class="navbar-brand" href="index.html"><%=email %></a>
			</div>
			<div
				style="color: white; padding: 15px 50px 5px 50px; float: right; font-size: 16px;">
				 <a href="#"
					class="btn btn-danger square-btn-adjust">Logout</a>
			</div>
		</nav>
		<!-- /. NAV TOP  -->
		<nav class="navbar-default navbar-side" role="navigation">
			<div class="sidebar-collapse">
				<ul class="nav" id="main-menu">
					<li class="text-center"><img src="assets/img/find_user.png"
						class="user-image img-responsive" /></li>


					<li><a class="active-menu" href="index.html"><i
							class="fa fa-dashboard fa-3x"></i> Dashboard</a></li>
					<li><a href="ui.html"><i class="fa fa-desktop fa-3x"></i>
							Doctors</a></li>
					<li><a href="tab-panel.html"><i class="fa fa-qrcode fa-3x"></i>
							Patients</a></li>
					<li><a href="chart.html"><i
							class="fa fa-bar-chart-o fa-3x"></i>Packages</a></li>
					<li><a href="table.html"><i class="fa fa-table fa-3x"></i>
							Appointments</a></li>
					<li><a href="form.html"><i class="fa fa-edit fa-3x"></i>
							Forms </a></li>


					<li><a href="#"><i class="fa fa-sitemap fa-3x"></i>
							Multi-Level Dropdown<span class="fa arrow"></span></a>
						<ul class="nav nav-second-level">
							<li><a href="#">Second Level Link</a></li>
							<li><a href="#">Second Level Link</a></li>
							<li><a href="#">Second Level Link<span class="fa arrow"></span></a>
								<ul class="nav nav-third-level">
									<li><a href="#">Third Level Link</a></li>
									<li><a href="#">Third Level Link</a></li>
									<li><a href="#">Third Level Link</a></li>

								</ul></li>
						</ul></li>
					<li><a href="blank.html"><i class="fa fa-square-o fa-3x"></i>
							Blank Page</a></li>
				</ul>

			</div>

		</nav>
		<!-- /. NAV SIDE  -->
</div>

<!-- /. WRAPPER  -->
	<!-- SCRIPTS -AT THE BOTOM TO REDUCE THE LOAD TIME-->
	<!-- JQUERY SCRIPTS -->
	<script src="assets/js/jquery-1.10.2.js"></script>
	<!-- BOOTSTRAP SCRIPTS -->
	<script src="assets/js/bootstrap.min.js"></script>
	<!-- METISMENU SCRIPTS -->
	<script src="assets/js/jquery.metisMenu.js"></script>
	<!-- MORRIS CHART SCRIPTS -->
	<script src="assets/js/morris/raphael-2.1.0.min.js"></script>
	<script src="assets/js/morris/morris.js"></script>
	<!-- CUSTOM SCRIPTS -->
	<script src="assets/js/custom.js"></script>
</body>
</html>