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
		<h2>Pokedex ID: ${pokemon.pokedexId}</h2>
		<h5> ${pokemon.name}</h5>
		<p> Pokedex location: ${pokemon.id}</p>
		<p> Type: ${pokemon.type} ${pokemon.type2}</p>
		<p> Evolutionary stage: ${pokemon.evolution}</p>
		<p> Region found: ${pokemon.region}</p>
		
		<form action="updatePokemon.do" method="GET">
			Update stats? <br> <input type="submit" value="Update Pokemon" />
		</form>
		<form action="deletePokemon.do" method="GET">
			Delete this pokemon? <br> <input type="submit" value="delete Pokemon" />
		</form>
		<a href=home.do>Return to Home</a><br/>
	</div>
<jsp:include page="bootstrapHead.jsp"></jsp:include>
</body>
</html>