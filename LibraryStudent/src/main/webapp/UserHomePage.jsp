<%@ page language="java" contentType="text/html; charset=windows-1255"
    pageEncoding="windows-1255" import = "registration.model.User"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="windows-1255">
<title>Home page</title>
</head>
<body>
<h1>hello</h1>
<form method="post" action="registration/controller/GetBookServlet">
		<input type="hidden" name="status" value="<%((User)(request.getAttribute("userDetails"))).getStatus(); %>">
		<input type="submit" name="books" value="books">
	</form>
</body>
</html>