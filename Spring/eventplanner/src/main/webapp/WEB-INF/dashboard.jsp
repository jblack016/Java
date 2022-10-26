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

			</div>
			<div>
				<p>
					<a href="/events/new" class="btn btn-secondary">Add Event</a>
					<a href="/logout" class="btn btn-secondary">Logout</a> 
				</p>
			</div>
		</div>

		<div class="center-test">
		<h1 class="center">Upcoming Events</h1>
			<table class="table table-secondary table-striped">
				<thead>
					<tr>
						<td>Event</td>
						<td>Created By</td>
						<td>Date</td>
					</tr>
				</thead>
				<tbody>
					<c:forEach var="eachEvent" items="${eventList }">
						<tr>
							<td><a href="/events/${eachEvent.id}">${eachEvent.title }</a></td>
							<td><c:out value="${eachEvent.user.userName }" /></td>
							<td>${eachEvent.eventDate }</td>
						</tr>
					</c:forEach>
				</tbody>
			</table>

		</div>

	</div>
</body>
</html>