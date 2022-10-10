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


	<div>
		<a href="dojos/new">Create new Dojo</a> <a href="ninjas/new">Create
			new Ninja</a>

	</div>

	<div class="container mt-5">
		<h1>Dojo Locations</h1>
		<ul>
			<c:forEach var="eachDojo" items="${dojoList }">
				<li><a href="/dojos/${eachDojo.id }"> <c:out
							value="${eachDojo.name }" /></a></li>
			</c:forEach>
		</ul>
	</div>


</body>
</html>