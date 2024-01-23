<%@ page language="java" contentType="text/html; charset=windows-1255"
    pageEncoding="windows-1255"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="windows-1255">
<title>Insert title here</title>
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
				<td>Enter User Name:</td>
				<td><input type="text" name="userName"></td>
			</tr>
			 <tr>
				<td>Enter Password:</td>
				<td><input type="password" name="password"></td>
			</tr>
			<tr>
				<td>Enter Address:</td>
				<td><input type="text" name="address"></td>
			</tr>
			 <tr>
				<td>Enter Phone Number:</td>
				<td><input type="text" name="phoneNum"></td>
			</tr>
			<tr>
				<td>Choose Status:</td>
				<td><lable for 0 >worker</lable>				
				<input type="checkbox" id=0>
				<lable for 1 >student</lable>				
				<input type="checkbox" id=1>
				<lable for 2 >teacher</lable>				
				<input type="radio" id=2></td>
			</tr>
			<tr>
				<td></td>
				<td><input type="submit" name="signIn" value="Sign in"></td>
			</tr>
		</table>
	</form>
</body>

</html>