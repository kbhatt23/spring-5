<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Footballer Form</title>
</head>
<body>

Say jai shree ram and fill below form:

<!-- not using normal form but mvc form -->
<!-- modelAttributre should be the name of attributre set to populate for -->
<form:form action="submitFootballForm" method="post" modelAttribute="footballerAttribute">
<!-- using form input instead of normal input -->
First Name : <form:input type="text" path="firstName" /><br>
Jersey No : <form:input type="text" path="jersey" /><br>
Last Name : <form:input type="text" path="lastName" /><br>
Age : <form:input type="text" path="age" /><br>
Salary : <form:input type="text" path="salary" /><br>

<form:select path="country">
	<%-- <form:option value="brazil" label="Brazil"></form:option>
	<form:option value="spain" label="Spain"></form:option>
	<form:option value="uruguay" label="Uruguay"></form:option> --%>
	
	<form:options items="${footballerAttribute.countries}"/>
</form:select>
<br>
Favourite Coach:
<br>
<%-- Guardiola <form:radiobutton path="favouriteCoach" value="Guardiola"/>
Zidane <form:radiobutton path="favouriteCoach" value="Zidane"/>
Quique<form:radiobutton path="favouriteCoach" value="Quique"/>
Arteta<form:radiobutton path="favouriteCoach" value="Arteta"/>
 --%>
 <form:radiobuttons path="favouriteCoach" items="${footballerAttribute.coaches}"/>
 <br>
 Favourite movies:
 
 GodFather<form:checkbox path="favouriteMovies" value="godfather"/><br>
 Shawshank redemption<form:checkbox path="favouriteMovies" value="Shawshank redemption"/><br>
 
  It<form:checkbox path="favouriteMovies" value="It"/><br>
 Ghoul<form:checkbox path="favouriteMovies" value="Ghoul"/>
 
<input type="submit" name="submit">


</form:form>
</body>
</html>