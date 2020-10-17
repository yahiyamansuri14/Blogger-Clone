<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login</title>
</head>
<body>
	<form action="/home/login" method="post">
		Enter Email::<input type="email" name="usermail"/>
		Enter Pwd::<input type="password" name="userpwd"/>
			<input type="submit" value="login"/>
	</form>
	<p>Don't have an a/c<b><a href="/user/showsignup">Signup</a></b>here.....</p>
</body>
</html>