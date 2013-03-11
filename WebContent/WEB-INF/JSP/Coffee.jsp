<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" type="text/css" href="styles/default.css">
<title>Coffee</title>
</head>
<body>
<table border = "1">
<c:forEach var= "coffee" items = "${list}" varStatus="status">


<c:choose>
<c:when test="${status.first}">
<tr class = "green">
</c:when>
<c:when test="${status.last}">
<tr class = "blue">
</c:when>
<c:when test="${status.count%3 eq 0}">
<tr class = "orange">
</c:when>

<c:otherwise>
<tr>
</c:otherwise>
</c:choose>

<td>${coffee.coffeeType}</td>
<td>${coffee.coffeeBrand}</td>
</tr>

</c:forEach>
</table>
</body>
</html>