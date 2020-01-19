<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
     <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Footballer Success Page</title>
</head>
<body>

Jai shre Ram brother <br>
Please find detail below:
<br>
${footballerAttribute}
<br>
=${footballerAttribute.country}=
<br>
Favourites moveis are:
<br>
<ul>
	<c:forEach var="movieName" items="${footballerAttribute.favouriteMovies}">
		<li>${movieName}</li>
	</c:forEach>
</ul>
</body>
</html>
