<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import="com.training.jsp.*"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>
<jsp:useBean id="emp" class="com.training.jsp.Employee" scope="request"></jsp:useBean>
<jsp:setProperty property="id" name="emp" value="4000"/>
Value ::<jsp:getProperty property="id" name="emp"/>
<%
//Employee empOne = new Employee();
//request.setAttribute("emp", empOne);
//out.println(emp.getId());
  /* Employee emp = new Employee();
  emp.setId(300);
  out.println(emp.getId()); */
%>
</h1>
</body>
</html>