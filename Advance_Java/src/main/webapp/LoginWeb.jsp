<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>LOGIN PAGE</title>
</head>
<body bgcolor="White">
	<form action="LoginCtl" method="post">
		<table align="center">
			<h1 align="center">Sign Up</h1>
			<%
				String error = (String) request.getAttribute("error");
				if (error != null) {
			%>
			<center>
				<font color="red"><%=error%></font>
			</center>
			<%
				}
			%>
			<tr>
				<th>USERNAME*</th>
				<td><input type="text" name="user"></td>
	<td> <%
					String s1 = (String) request.getAttribute("errorlogin");
				%> 
					<%
 						if (s1 != null) {
 					%>
					
						<font color="red"><%=s1%></font>
					 <%
					 	}
					 %></td>
			</tr>
			<tr>
				<th>PASSWORRD*</th>
				<td><input type="Password" name="pwd"></td>
				<td>
				<%
						String s2 = (String) request.getAttribute("errorpass");
					%> 
					<%
 						if (s2 != null) {
 					%>
					
						<font color="red"><%=s2%></font>
					 <%
					 	}
					 %>
				</td>
			</tr>
			<tr>
				<th></th>
				<td><input type="submit" value="Submit"><input
					type="submit" value="Forget Password"></td>
			</tr>
			<tr>
			<th></th>
			<td><a href="RagistrationForm1.jsp">Create New Account</a></td>
			</tr>

		</table>
	</form>
</body>
</html>