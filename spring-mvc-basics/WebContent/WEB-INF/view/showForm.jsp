<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
     <!DOCTYPE html>
<html>
<head>
<style type="text/css">
	.errorClass {
		color: red;
	}
</style>
<meta charset="ISO-8859-1">
<title>Customer Form</title>
</head>
<body>
Say jai shree ram and fill below form:
<br>

<form:form action="submitform" modelAttribute="customer">

	FirstName: <form:input path="firstName"/>
	<br>
	LastName: <form:input path="lastName"/>
	<form:errors path="lastName" cssClass="errorClass"></form:errors>
	
	<br>
	Age : <form:input path="age"/> 
	<form:errors path="age" cssClass="errorClass"></form:errors>
	
	<input type="submit" value="Please click to submit">
</form:form>

</body>
</html>
