<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>My Cafe</title>
</head>
<body>

	<h1 align="center">My Home Cafe</h1>

	<form action="processorder" >
		<div align="center">
		<label for="order" >My order is : </label>
			<input type="text" id="order" placeholder="Order here" name="order" />
			<input type="submit" value="Order Now" />
		</div>
	</form>

</body>
</html>