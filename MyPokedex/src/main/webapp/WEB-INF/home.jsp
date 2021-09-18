<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>MyPokedex</title>
<jsp:include page="bootstrapHead.jsp"></jsp:include>
</head>
<body>
	<div class="container-fluid">
		<h1>Welcome to MyPokedex!</h1>

		<h3>DEBUG:</h3>
		${allPokemon} 

	<jsp:include page="bootstrapHead.jsp"></jsp:include>
</body>
</html>