<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>
<%= "This is from include page" %>
</h1>

<%@ include file="inc.jsp" %>

<%= count %>

<jsp:include page="test.jsp"></jsp:include>

<jsp:forward page="forw.jsp">
 <jsp:param value="this is one" name="one"/>
</jsp:forward>

</body>
</html>