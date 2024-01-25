<%@ page language="java" contentType="text/html; charset=windows-1255"
    pageEncoding="windows-1255"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="windows-1255">
<title>new book</title>
</head>
<body>
<form method="post" action="registration/controller/AddBookServlet">
		<table 
			style="width:70%;background-color: skyblue;margin-top:200px;margin-left:100px;margin-right:200px;">

			<tr>
				<td>
					<h3 style="color:brown">Add new book</h3>
				</td>
			</tr>
	        <tr>
				<td> Book Name:</td>
				<td><input type="text" name="name"></td>
			</tr>
			 <tr>
				<td> Author:</td>
				<td><input type="text" name="author"></td>
			</tr>
			<tr>
				<td> Description:</td>
				<td><input type="text" name="description"></td>
			</tr>
			<tr>
				<td><input type="submit" name="add" value="Add"></td>
			</tr>
		</table>
	</form>
</body>
</html>