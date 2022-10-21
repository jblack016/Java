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
				<h1>${event.title }!</h1>
				<p>${ event.location}</p>
				<p>${ event.eventDate}</p>
				<p>${event.details }</p>
			</div>
			<div>
					<a href="/events" class="btn btn-secondary">Home</a> 
					<a href="/events/guest" class="btn btn-secondary">Add Guest</a> 
					<a href="/events/edit/${event.id}" class="btn btn-secondary">Edit Event</a>
					<form action="/events/delete/${event.id }" method="POST">
							<input type="hidden" name="_method" value="delete" />
							<button type="submit" class="btn btn-danger">Delete</button>
					</form>
			</div>
		</div>


		<div>
			<table class="table table-secondary table-striped">
				<thead>
					<tr>
						<td>Guests</td>
						<td>Contributions</td>
					</tr>
				</thead>
				<tbody>
					<c:forEach var="eachEvent" items="${eventList }">
						<tr>
							<td>${eachEvent.id }</td>
							<td><c:out value="${eachEvent.user.userName }" /></td>
						</tr>
					</c:forEach>
				</tbody>
			</table>

		</div>

	</div>
</body>
</html>