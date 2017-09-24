<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Success Page</title>
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
</head>
<body>

	<%
		String username = (String) request.getAttribute("Username");
		String firstName = (String) request.getAttribute("firstName");
		String lastName = (String) request.getAttribute("lastName");
		String address = (String) request.getAttribute("address");
		String phoneNumber = (String) request.getAttribute("phoneNumber");
		String personalEmail = (String) request.getAttribute("personalEmail");

		if (username != null) {
	%>
	<h1>
		Welcome,
		<%=username%>! <br>
	</h1>
	<%
		}
		if (firstName != null) {
	%>
	<h1>
		Sign up complete. Your account information is displayed below: <br>
		Your first name is
		<%=firstName%>
		<br> Your last name is
		<%=lastName%>
		<br> Your address is
		<%=address%>
		<br> Your phone number is
		<%=phoneNumber%>
		<br> Your personal email is
		<%=personalEmail%>
		<br>
	</h1>
	<%
		}
	%>

	<a href="login.jsp">Return to Login Page</a>
</body>
</html>
