<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>Pokedex</title>
	<jsp:include page="bootstrapHead.jsp"></jsp:include>
</head>
<body>

	<div class="container-fluid">
		<form action="getPokemon.do" method="GET">
			Pokemon ID: <input type="text" name="pid" /> <input type="submit"
				value="Show Pokemon" />
		</form>

		${p.name }

		<table>
			<thead>
				<tr>
					<th>Id</th>
					<th>Name</th>
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