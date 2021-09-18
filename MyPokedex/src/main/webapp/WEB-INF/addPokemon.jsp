<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Add Pokemon</title>
</head>
<body>

<form action="createPokemon.do" method="POST">
	Pokemon Name: <input type="text" name="name" /> 
	Add the Pokemon? <input type="submit" value="Add Pokemon"/>
		</form>
<a href="/">Return to Home</a><br/>
</body>
</html>