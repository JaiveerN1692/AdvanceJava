<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>SUBMIT FORM</title>
</head>
<body>
	<%
		String name = request.getParameter("user");
		String pwd = request.getParameter("pwd");
	%>
	<%=name%>
	<%=pwd%>

</body>
</html>