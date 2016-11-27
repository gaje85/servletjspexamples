<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import="java.util.*,com.training.customtaglib.*" %>
    <%@ taglib prefix="trg" uri="http://training.org/one-taglib" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>one tag</title>
</head>
<body>

<trg:one>
</trg:one>

<trg:one>
</trg:one>

<%
List<Employee> empList = new ArrayList<Employee>();

for(int i=0;i<5;i++){
	Employee emp = new Employee();
	emp.setId(i+1);
	emp.setName("Name "+i);
	emp.setSal(30.0 * (i+1));
	empList.add(emp);
	
}
request.setAttribute("list", empList);
%>
<trg:trainingtable data='<%=empList %>' border="2" cellspacing="5" cellpadding="5"></trg:trainingtable>
<trg:trainingtable data='<%=empList %>' border="6" cellspacing="1" cellpadding="15"></trg:trainingtable>
</body>
<h1>
<jsp:text>
 This is expression ${trg:len("Sureshyyyy")} 
 ${param["one"]}
 ${requestScope.list[0].name } 
</jsp:text>

</h1>


</html>