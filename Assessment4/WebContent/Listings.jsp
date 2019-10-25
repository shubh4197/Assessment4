<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%> 
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Lists</title>
</head>
<body>
<h1>Available Listings</h1>
<table>
<tr>
			<td>Posting Title</td>
			<td>City</td>
			<td>Description</td>
			
		</tr>
<c:forEach items="${sessionScope.list}" var="zip">
<tr>
    <td>${zip.postingTitle}</td>
    <td>${zip.postingCity}</td>
    <td>${zip.description}</td>
    <td><a href="InterestServlet?id=${zip.postingTitle}">Interested</a></td>
</tr>

</c:forEach>
</table>
</body>
</html>