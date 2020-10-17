<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>SignUp</title>
</head>
<body>
	<form action="/user/signup" method="post">
		ENTER USER-NAME::<input type="text" name="username"/>
		ENTER EMAIL::<input type="email" name="usermail"/>
		ENTER PWD::<input type="password" name="userpwd"/>
		<input type="submit" value="signup"/>
	</form>
</body>
</html>