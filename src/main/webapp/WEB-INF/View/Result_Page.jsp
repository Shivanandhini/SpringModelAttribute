<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>ResultPage</title>
</head>
<body>
	Name:${userregdto.name}
	<br> UserName:${userregdto.userName}
	<br> Password:${userregdto.password}
	<br> Country: ${userregdto.countryName}
	<br> Hobbies:
	<c:forEach var="temp" items="${userregdto.hobbies}">

           ${temp}
		</c:forEach>
	<br> Gender: ${userregdto.gender}
</body>
</html>