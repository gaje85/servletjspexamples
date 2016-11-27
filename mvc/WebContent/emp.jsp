<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import="java.util.*,com.training.mvc.model.*"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Emp List</title>
</head>
<body>
<h1>
<table cellpadding="5" cellspacing="5" border="2">
<%
  List<Employee> list = (List<Employee>)request.getAttribute("emplist");
  for(Employee emp : list){
 %>
 <tr><td><%=emp.getId() %></td><td><%=emp.getName() %></td><td><%=emp.getSal() %></td></tr>

<%} %>
</table>


</h1>
</body>
</html>