<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Add Pokemon</title>
<jsp:include page="bootstrapHead.jsp"></jsp:include>
</head>
<body>

<form action="createPokemon.do" method="POST">
	Pokemon Name: <input type="text" name="name" /> 
	<br>
	Pokedex number: <input type="text" name="pokedexId" />
	<br>
	Type: <input type="text" name="type" />
	<br>
	Type 2: <input type="text" name="type2" />
	<br>
	Evolutionary stage (1,2,3, no stages): <input type="text" name="evolution" />
	<br>
	Region Found: <input type="text" name="region" />
	<br>
	Add the Pokemon? <input type="submit" value="Add Pokemon"/>
		</form>
<a href="/">Return to Home</a><br/>
<jsp:include page="bootstrapHead.jsp"></jsp:include>
</body>
</html>