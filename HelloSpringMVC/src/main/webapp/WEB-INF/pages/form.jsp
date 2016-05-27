<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<h1 style="font-family: Times; color: red">Address Book</h1>
<body style="background-color: lightgrey">
<form action="http://localhost:8081/HelloSpringMVC/action" method="get">
	Full Name:<br>
	<input type="text" name="fullname"><br>
	Address:<br>
	<input type="text" name="address"><br>
	City:<br>
	<input type="text" name="city"><br>
	Phone:<br>
	<input type="text" name="phone"><br>
	Email:<br>
	<input type="text" name="email"><br>
	<br>
	<input type="submit" value="Submit">
</form>
</body>
</html>	