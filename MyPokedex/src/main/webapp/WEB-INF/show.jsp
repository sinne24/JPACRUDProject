<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>Pokemon Details</title>
	<jsp:include page="bootstrapHead.jsp"></jsp:include>
</head>
<body>
	<div>
		<h5>${pokemon.name}(${pokemon.type})</h5>
		<p>${pokemon.type2}</p>
	</div>
<jsp:include page="bootstrapHead.jsp"></jsp:include>
</body>
</html>