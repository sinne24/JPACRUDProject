<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Update Pokemon</title>
<jsp:include page="bootstrapHead.jsp"></jsp:include>
</head>
<body>		
<form action="updatePokemon.do" method="POST">
	<h2>Update Pokedex DB Location Id: ${pokemon.id}</h2>
		<h5> ${pokemon.name}</h5>
		<p> Official pokedex id number: ${pokemon.pokedexId}</p>
		<p> Type: ${pokemon.type} ${pokemon.type2}</p>
		<p> Evolutionary stage: ${pokemon.evolution}</p>
		<p> Region found: ${pokemon.region}</p>
		
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
	Update the Pokemon? <input type="submit" value="Update Pokemon"/>
		</form>
<a href="/">Return to Home</a><br/>
<jsp:include page="bootstrapHead.jsp"></jsp:include>
</body>
</html>