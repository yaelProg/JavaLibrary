<%@ page language="java" contentType="text/html; charset=windows-1255"
    pageEncoding="windows-1255"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="windows-1255">
<title>worker</title>
</head>
<body>
	<form method="post" action="../../registration/controller/MessageServlet">
		<input type="submit" name="messages" value="messages">
	</form>
	<form method="post" action="../../WorkerUsersServlet">
		<input type="submit" name="users" value="users">
	</form>
	<form method="post" action="../../registration/controller/GetBookServlet">
		<input type="hidden" name="status" value="0">
		<input type="submit" name="books" value="books">
	</form>

</body>
</html>