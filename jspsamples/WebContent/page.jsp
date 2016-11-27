<%@ page buffer="8kb" session="true" import="java.util.*,java.io.*,java.net.*" 
    language="java" contentType="text/html; charset=ISO-8859-1" errorPage="errinfo.jsp"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
 
  out.println("<h1> this is sample "+new Date());
  Vector v = null;
  v.addElement("one");
%>


</body>
</html>