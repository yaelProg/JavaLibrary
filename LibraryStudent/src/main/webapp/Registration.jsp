<%@ page language="java" contentType="text/html; charset=windows-1255"
    pageEncoding="windows-1255"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="windows-1255">
<title>sign in</title>
</head>
<body>
<form method="post" action="registration/controller/StudentServlet">
		<table 
			style="width:70%;background-color: skyblue;margin-top:200px;margin-left:100px;margin-right:200px;">

			<tr>
				<td>
					<h3 style="color:brown">Registration</h3>
				</td>
			</tr>
	        <tr>
				<td> User Name:</td>
				<td><input type="text" name="userName"></td>
			</tr>
			 <tr>
				<td> Password:</td>
				<td><input type="password" name="password"></td>
			</tr>
			<tr>
				<td> Address:</td>
				<td><input type="text" name="address"></td>
			</tr>
			 <tr>
				<td> Phone Number:</td>
				<td><input type="text" name="phone"></td>
			</tr>
				<td> status:</td>
				<td>
				<select name="status">
    				<option value=1>student</option>
    				<option value=2>teacher</option>
    				<option value=0>worker</option>
				</select>	
				</td>		
			<tr>
				<td><input type="submit" name="signIn" value="Sign in"></td>
			</tr>
		</table>
		</form>
<form method="post" action="registration/controller/GetBookServlet">
	<input type="hidden" name="status" value=0>
<input type="submit" name="back" value="back">
</form>
</body>
</html>