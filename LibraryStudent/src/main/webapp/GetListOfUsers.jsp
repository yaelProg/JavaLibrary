<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"
import = "java.util.*" import= "registration.model.User"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Users</title>
</head>
<body>
<table style="width:70%;background-color: skyblue;margin-top:200px;margin-left:100px;margin-right:200px;">

<tr>
<td width = "119"  ><b>Name</b></td>
<td width = "119"  ><b>Address</b></td>
<td width = "119"  ><b>Phone</b></td>
</tr>

<% Iterator itr;%>
<% List data = (List)request.getAttribute("UserData"); 
   for(itr=data.iterator();itr.hasNext();)   
   {	

	   User user = (User)(itr.next()); %>
<tr>
<td width = "119"><%= user.getUserName() %></td>
<td width = "119"><%= user.getAddress() %></td>
<td width = "119" ><%= user.getPhoneNum() %></td>
<% if (user.isLoaned()) { %>
	<td>The user has loaned books</td>
<%} else{ %>
<td><form method="post" action="DeleteUserServlet">
	<input type = "hidden" name = "id" value = "<%= user.getId() %>">
		<input type="submit" name="delete" value="delete">
	</form>
</td>
<% } %>
</tr>
<%} %>

<td><form action="/LibraryStudent/Registration.jsp">
	<input type="submit" name="Add new user" value="regist">
</form></td>
</table>
</body>
</html>
</html>