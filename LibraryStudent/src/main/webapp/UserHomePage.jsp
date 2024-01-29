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
<form method="post" action="../../registration/controller/GetBookServlet">
		<input type="hidden" name="status" value=1>
		<input type="submit" name="books" value="my books">
	</form>
	<form method="post" action="../../GetHistoryServlet">
		<input type="hidden" name="id" value="7">
		<input type="submit" name="History" value="History">
	</form>
</body>
</html>
<!--<%((User)(request.getAttribute("userDetails"))).getStatus(); %>-->
<%((User)(request.getAttribute("userDetails"))).getId(); %>