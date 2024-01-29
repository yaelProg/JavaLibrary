<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"
import = "java.util.*" import= "registration.model.Book"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Books</title>
</head>
<body>
<table style="width:70%;background-color: skyblue;margin-top:200px;margin-left:100px;margin-right:200px;">

<tr>
<td width = "119"  ><b>Name</b></td>
<td width = "119"  ><b>Author</b></td>
<td width = "119"  ><b>Description</b></td>
</tr>

<% Iterator itr;%>
<% List data = (List)request.getAttribute("HistoryData"); 
   for(itr=data.iterator();itr.hasNext();)   
   {	
%>
<tr>
<td width = "119"><%=itr.next() %></td>
<td width = "119" ><%=itr.next() %></td>
<td width = "119"><%=itr.next() %></td>
</tr>
<%} %>
</table>
</body>
</html>
</html>