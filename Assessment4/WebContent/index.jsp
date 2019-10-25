<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Choose Categories</title>
</head>
<body>
<h1>Choose category you want to post your ad in</h1>
<form action="initServlet" method="get">
<input type="radio" name="category" value="Job offered"/><Label>Job Offered</Label>
<br>
<input type="radio" name="category" value="Gig offered"/><Label>Gig Offered</Label>
<br>
<input type="radio" name="category" value="Resume/job wanted"/><Label>Resume/job wanted</Label>
<br>
<input type="radio" name="category" value="Housing offered"/><Label>Housing Offered</Label>
<br>
<input type="radio" name="category" value="Housing wanted"/><Label>Housing Wanted</Label>
<br>
<input type="radio" name="category" value="For sale by owner"/><Label>For sale by owner</Label>
<br>
<input type="radio" name="category" value="For sale by dealer"/><Label>For sale by dealer</Label>
<br>
<input type="submit" value="Choose Category">
</form>
</body>
</html>