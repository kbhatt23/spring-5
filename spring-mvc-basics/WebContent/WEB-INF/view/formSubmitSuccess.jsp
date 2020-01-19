<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Form Submission success</title>
</head>
<body>
<img  src="${pageContext.request.contextPath}/resources/images/instagram.png">


Jai shree ram brother
Your data is saved succesfully
==${inputs}==

<br>
individual attributes are:
==${param.input1}==
<br>
==${param.input2}==

<br>
messi val is
==${messiName}==


<a href="showBasicForm">Please try again</a>
</body>
</html>