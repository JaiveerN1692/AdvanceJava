<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>VIEW RAGISTRATION</title>
</head>
<body>
<%
String name = request.getParameter("fname");
String lname = request.getParameter("lname");
String dob = request.getParameter("dob");
String mobile = request.getParameter("mobile");
String username = request.getParameter("username");
String password = request.getParameter("password");
String cpassword = request.getParameter("confirmpassword");
String email = request.getParameter("emailid");
%>
<br>
<%=name%>
<br>
<%=lname%>
<br>
<%=dob%>
<br>
<%=mobile%>
<br>
<%=username%>
<br>
<%=password%>
<br>
<%=cpassword%>
<br>
<%=email%>
<br>
sysout("Registraion Successfully");

</body>
</html>