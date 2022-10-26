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
<div class="right">
	<a href="/events" class="btn btn-dark">Home</a>
	<a href="/logout" class="btn btn-dark">Logout</a>
</div>
	<div class="center-test">

		<div class="box ">
			<h1 class="center">${ event.title}!</h1>
			<div>
				<p>Location: ${ event.location}</p>
				<p>Date: ${ event.eventDate}</p>
				<p>Details: ${ event.details}</p>
			</div>

		</div>


		<div class="viewTable mx-auto">
				<div class="box-btn d-flex justify-content-around">
			 <a href="/events/${event.id}/guests/new" class="btn btn-sm btn-dark">Add Guest</a> 
				<a href="/events/edit/${event.id}" class="btn btn-sm btn-dark">Edit Event</a>
			<form action="/events/delete/${event.id }" method="POST">
				<input type="hidden" name="_method" value="delete" />
				<button type="submit" class="btn btn-sm btn-danger">Delete Event</button>
			</form>
		</div>
		<h1 class="center">Guest List</h1>
			<table class="table table-sm table-secondary table-striped">
				<thead>
					<tr>
						<td>Guests</td>
						<td>Contributions</td>
						<td>Remove Guest</td>
					</tr>
				</thead>
				<tbody>
					<c:forEach var="eachEventUser" items="${event.eventUsers }">
						<tr>
							<td>${eachEventUser.guest }</td>
							<td><c:out value="${eachEventUser.contribution }" /></td>
							<td><form
									action="/events/guests/delete/${eachEventUser.id }"
									method="POST">
									<input type="hidden" name="_method" value="delete" />
									<button type="submit" class="btn btn-close" aria-label="Close"></button>
								</form></td>
						</tr>
					</c:forEach>
				</tbody>
			</table>

		</div>
	</div>
</body>
</html>