<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add Details</title>
</head>
<body>
<form action="AdServlet" method="get">
Posting Title:<input type="text" name="posttitle"/>
<br>
Posting City:<input type="text" name="city"/>
<br>
Posting Description:<input type="text" name="description"/>
<br>
Name:<input type="text" name="name"/>
<br>
Email:<input type="text" name="email"/>
<br>
Phone:<input type="text" name="phone"/>
<br>
<input type="submit" value="Add the Ad"/>
</form>
</body>
</html>