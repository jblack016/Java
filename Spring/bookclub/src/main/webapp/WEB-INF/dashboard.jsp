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
		<div class="d-flex justify-content-around">
			<div>
				<h1>Welcome, ${userName }!</h1>
				<h4>Books from everyone's shelves:</h4>
			</div>
			<div>
				<p><a href="/logout" class="btn btn-secondary">Logout</a>
				<a href="/books/new" class="btn btn-secondary">+ Add to my shelf</a></p>
			</div>
		</div>

		<div>
			<table class="table table-secondary table-striped">
				<thead>
					<tr>
						<td>ID</td>
						<td>Title</td>
						<td>Author Name</td>
						<td>Posted By</td>
					</tr>
				</thead>
				<tbody>
				<c:forEach var="eachBook" items="${bookList }">
					<tr>
						<td>${eachBook.id }</td>
						<td><a href="/books/${eachBook.id}">${eachBook.title }</a></td>
						<td>${eachBook.author }</td>
						<td><c:out value="${eachBook.user.userName }" /></td>
					</tr>
					</c:forEach>
				</tbody>
			</table>

		</div>

	</div>
</body>
</html>