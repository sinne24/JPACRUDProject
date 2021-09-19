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
		
 <form action="updatePokemon.do" method="POST">
		
	Pokemon Name: <input type="text" value="${pokemon.name}" name="name" /> 
	<br>
	Pokedex number: <input type="text" value ="${pokemon.pokedexId}" name="pokedexId" />
	<br>
	Type: <input type="text" value ="${pokemon.type}" name="type" />
	<br>
	Type 2: <input type="text" value ="${pokemon.type2}" name="type2" />
	<br>
	Evolutionary stage (1,2,3, no stages): <input type="text" value ="${pokemon.evolution}" name="evolution" />
	<br>
	Region Found: <input type="text" value ="${pokemon.region}" name="region" />
	<br>
	Update the Pokemon? 
	Enter Pokedex location: <input type="text" value ="${pokemon.id}" name="pid" /> 
	<input type="submit" value="update Pokemon" />
	</form>
		<a href="home.do">Return to Home</a><br/>
	</div>
<jsp:include page="bootstrapHead.jsp"></jsp:include>
</body>
</html>