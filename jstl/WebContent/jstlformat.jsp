<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="fmt" 
           uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="fn" 
           uri="http://java.sun.com/jsp/jstl/functions" %>
<c:set var="Amount" value="123.456" />  
  
    <fmt:parseNumber var="num" type="number" value="${Amount}"  parseLocale="en_US"/>  
    <p><i>Amount is:</i>  <c:out value="${num}" /></p>  
  
    <fmt:parseNumber var="num" integerOnly="true" type="number" value="${Amount}"  parseLocale="en_US"/>  
    <p><i>Amount is:</i>  <c:out value="${num}" /></p>  


<c:set var="date" value="12-08-2016" />  
  
<fmt:parseDate value="${date}" var="parsedDate"  pattern="dd-MM-yyyy" parseLocale="en_US"/>  
<p><c:out value="${parsedDate}" /></p>  



<c:set var="theString" value="I am a test String"/>
<h1>
<c:if test="${fn:contains(theString, 'test1')}">
   <p>Found test string<p>
</c:if>

<c:if test="${fn:contains(theString, 'TEST')}">
   <p>Found TEST string<p>
</c:if>

<c:set var="string1" value="This is first String."/>
<c:set var="string2" value="This <h3>is second String.</h3>"/>

<p>With escapeXml() Function:</p>
<p>string (1) : ${fn:escapeXml(string1)}</p>
<p>string (2) : ${fn:escapeXml(string2)}</p>

<p>Without escapeXml() Function:</p>
<p>string (1) : ${string1}</p>
<p>string (2) : ${string2}</p>


<c:set var="string1" value="This is first String."/>
<c:set var="string2" value="${fn:split(string1, ' ')}" />
<c:set var="string3" value="${fn:join(string2, '-')}" />

<p><h1>Final String : ${string3}</h1></p>


</h1>





</body>
</html>