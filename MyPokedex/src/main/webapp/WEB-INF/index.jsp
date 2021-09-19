<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Pokedex</title>
<h2>Welcome to your Pokedex PC Trainer!</h2>
<jsp:include page="bootstrapHead.jsp"></jsp:include>
</head>
<body>

	<div class="container-fluid">
		Find a pokemon by Pokedex location?
		<form action="getPokemon.do" method="GET">
			Enter pokedex location id:<br> <input type="text" name="pid" />
			<input type="submit" value="Show Pokemon" />
		</form>
		<form action="deletePokemon.do" method="POST">
			Delete A pokemon? To delete a pokemon enter its Pokedex location:<br>
			<input type="text" name="pid" /> <input type="submit"
				value="delete Pokemon" />
		</form>
		<form action="createPokemonForm.do" method="POST">
			Would you like to add a Pokemon? <br><input type="submit"
				value="Add Pokemon" />
		</form>
		<br>
		${p.name }

		<table>
			<thead>
				<tr>
					<th>Pokedex</th>
					<th>Locations</th>
				</tr>
			</thead>

			<tbody>
				<c:forEach var="p" items="${allPokemon }">
					<tr>
						<td>${p.id}</td>
						<td><a href="getPokemon.do?pid=${p.id}">${p.name}</a></td>
					</tr>
				</c:forEach>
			</tbody>

		</table>
	</div>
	<jsp:include page="bootstrapHead.jsp"></jsp:include>
</body>
</html>