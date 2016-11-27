<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body><h1>
<%= 4 + 10 %>
<%
   String s = "Hi John 11111";
   out.println(s);
   String age  = request.getParameter("age");
%>
<%= age %>

<%! int count = 100;

  public int getCount(){
	  return count;
  }
%>
</h1>
</body>
</html>