<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!-- c:out ; c:forEach etc. -->
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!-- Formatting (dates) -->
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!-- form:form -->
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!-- for rendering errors on PUT routes -->
<%@ page isErrorPage="true"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Title</title>
<link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css">
<link rel="stylesheet" href="/css/style.css">
<!-- change to match your file/naming structure -->
<script src="/webjars/jquery/jquery.min.js"></script>
<script src="/webjars/bootstrap/js/bootstrap.min.js"></script>
</head>
<body>
	<div class="container mt-5">
	<a href="/">Home</a>
		<h1 class="text-center">${dojo.name }</h1>

		<table class="table table-dark table-striped">
			<thead>
				<tr>
					<td>First Name</td>
					<td>Last Name</td>
					<td>Age</td>
				</tr>
			</thead>
			
			<tbody>
			<c:forEach var="ninja" items="${ dojo.ninjas}">
				<tr>
					<td>${ninja.firstName }</td>
					<td>${ninja.lastName }</td>
					<td>${ninja.age}</td>
				</tr>
			</c:forEach>
			</tbody>

		</table>


	</div>
</body>
</html>