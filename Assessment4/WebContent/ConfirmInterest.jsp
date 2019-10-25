<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%> 
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Interest</title>
</head>
<body>
<h1>Your interest has been recorded</h1>
Title:<h5>${sessionScope.last.postingTitle}</h5>
<br>
City<h5>${sessionScope.last.postingCity}</h5>
<br>
Description<h5>${sessionScope.last.description}</h5>
<br>
<h1>Seller Details</h1>
Seller name:<h5>${sessionScope.last.name}</h5>
<br>
Seller phone<h5>${sessionScope.last.phone}</h5>
<br>
</body>
</html>