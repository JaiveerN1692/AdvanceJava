<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>User Ragistration</title>
</head>
<body bgcolor="aquateal">
<h1 align="center">Registration Form</h1>
	
	<form action="RagistrationCtl" method="post">
		<table align="center">
			<tr>
				<td>First Name</td>
				<td><input type="text" name="fname" id=""></td>
			</tr>
			<tr>
				<td>Last Name</td>
				<td><input type="text" name="lname" id=""></td>
			</tr>
			<tr>
				<td>DOB</td>
				<td><input type="date" name="dob" id=""></td>
			</tr>
			<tr>
				<td>Mobile Number</td>
				<td><input type="text" name="mobile" id=""></td>
			</tr>
			
			<tr>
				<td>Username</td>
				<td><input type="text" name="username" id=""></td>
			</tr>
			<tr>
				<td>Password</td>
				<td><input type="password" name="password" id=""></td>
			</tr>
			<tr>
				<td>Confirm Password</td>
				<td><input type="password" name="confirmpassword" id=""></td>
			</tr>
			<tr>
				<td>Email ID</td>
				<td><input type="email" name="emailid" id=""></td>
			</tr>
			<tr>
				<td></td>
				<td><input type="Submit" value="Signup" onclick="display(this.form)"><input
					type="button" value="Cancel"></td>
			</tr>
			

		</table>
	</form>
</body>
</html>