<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" type="text/css" href="styles/default.css">
<title>Bookmarks</title>
</head>
<body>

	<ul>

		<c:forEach var="url" items="${list }">

			<c:choose>
				<c:when test="${url.score>=4}">
					<li><a class="green" href="${url.url}">${url.name}</a></li>

				</c:when>
				<c:when test="${url.score<=2}">
					<li><a class="red" href="${url.url}">${url.name}</a></li>
				</c:when>

				<c:otherwise>
					<li><a href="${url.url}">${url.name}</a></li>
				</c:otherwise>
			</c:choose>




		</c:forEach>

	</ul>

</body>
</html>