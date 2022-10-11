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
<script src="/webjars/jquery/jquery.min.js"></script>
<script src="/webjars/bootstrap/js/bootstrap.min.js"></script>
</head>
<body>
	<div class="container mt-5">
		<h1>${book.title }</h1>
		<h2>By: ${book.author }</h2>

		<p>${book.myThoughts }</p>

		<a href="/books">Back to the shelves</a> 
		
		<div class="d-flex">
		<p><a href="/books/edit/${book.id }" class="btn btn-success">Edit</a></p>
		<form action="/books/delete/${book.id }" method="POST">
			<input type="hidden" name="_method" value="delete" />
			<button type="submit" class="btn btn-danger">Delete</button>
		</form>
		</div>
	</div>
</body>
</html>