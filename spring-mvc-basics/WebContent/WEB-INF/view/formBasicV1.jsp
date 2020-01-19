<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Sample Form</title>
</head>
<body>
Say jai shree ram from form 1 and fill below form:
<!-- <form action="submitBasicForm" method="post"> -->
<form:form action="submitBasicFormv11" method="post" modelAttribute="profile">
	<form:input name="firstName" type="text" path="firstName"/>
	<form:input name="password" type="text" path="password"/>
	<input type="submit">
</form:form>
</body>
</html>