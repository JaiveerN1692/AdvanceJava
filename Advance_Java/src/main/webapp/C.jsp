<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>inserted</h1>

<%
request.setAttribute("starter", "paneertikka");
%>

<% 
String m = (String)request.getAttribute("mithai");
String d = (String)request.getAttribute("drink");
String s = (String)request.getAttribute("starter");
%>
<%=m %>
<%=d %>
<%=s %> 
</body>
</html>