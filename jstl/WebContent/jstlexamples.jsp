<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import="java.util.*,com.training.jstl.*" %>
   <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>
 <c:out value="${'1234 , 4567'}"/>
 
   <c:set var="id" scope="request" value="${200}"/>
 Before : <c:out value="${id}"/>
  <c:remove var="id"/>
  After :<c:out value="${id}"/>
  
    <c:set var="id" scope="request" value="${200}"/>
   <c:if test="${id > 1200}">
   <p>My id: <c:out value="${id}"/><p>
  </c:if>
  
  <c:catch var ="e">
       <% int num = 100/0;%>
   </c:catch>

<c:if test = "${e != null}">
   <p>exception : ${e} <br />
   msg : ${e.message}</p>
</c:if>
  
  <c:set var="id" scope="request" value="${3000}"/>
<p>Your id is : <c:out value="${id}"/></p>
<c:choose>
    <c:when test="${id <= 0}">
       id cannot be less than 0.
    </c:when>
    <c:when test="${id > 1000}">
        id cannot be greater than 1000
    </c:when>
    <c:otherwise>
        Valid id
    </c:otherwise>
</c:choose>


<c:import var="content" url="http://www.google.com"/>

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

<c:forEach var="i" begin="1" end="5">
   Item <c:out value="${i}"/><p>
</c:forEach>

<c:forEach var="emp" items="${list}">
 Employee <c:out value="${emp.name}"/><p>
 </c:forEach>

<c:forTokens items="one,two,three" delims="," var="name">
   <c:out value="${name}"/><p>
</c:forTokens>

<c:url value="/index.jsp" var="myURL">
   <c:param name="id" value="1234"/>
   <c:param name="type" value="summary"/>
</c:url>
<c:import url="${myURL}"/>

<a href="<c:url value="/jsp/one.jsp"/>">Click here</a>

<c:redirect url="http://www.ebay.com"/>
 
</h1>



</body>
</html>