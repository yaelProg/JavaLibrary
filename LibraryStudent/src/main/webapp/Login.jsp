<%@ page language="java" contentType="text/html; charset=windows-1255"
    pageEncoding="windows-1255"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="windows-1255">
<title>Login</title>
</head>
<body>
<form method="post" action="registration/controller/LoginServlet">
		<table 
			style="width:70%;background-color: skyblue;margin-top:200px;margin-left:100px;margin-right:200px;">

			<tr>
				<td>
					<h3 style="color:brown">Hello User</h3>
				</td>
			</tr>
	        <tr>
				<td>Enter User Name :</td>
				<td><input type="text" name="userName"></td>
			</tr>
			 <tr>
				<td>Enter Password :</td>
				<td><input type="password" name="password"></td>
			</tr>
			<tr>
				<td></td>
				<td><input type="submit" name="Login" value="Login"></td>
			</tr>
			<tr>
				<!--  <td style="color:brown">The user name or the password are wrong</td>-->
			</tr>
		</table>
	</form>
</body>
</html>