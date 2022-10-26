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
		<a href="/events" class="btn btn-secondary">Home</a>
		<a href="/logout" class="btn btn-secondary">Logout</a> 
	</div>

	<div class="center-test">
		<h1 class="center">Add an Event</h1>
		

		<div class="box-event">
			<form:form action="/events/process" method="POST"
				modelAttribute="newEvent">
				<p>
					<form:label path="title">Event Name:</form:label>
					<form:input path="title" class="input"/>
					<form:errors style="color:red" path="title" />
				</p>
				<p>
					<form:label path="location">Location:</form:label>
					<form:input path="location" class="input"/>
					<form:errors style="color:red" path="location" />
				</p>
				<p>
					<form:label path="eventDate">Event Date:</form:label>
					<form:errors path="eventDate" class="text-danger" />
					<form:input path="eventDate"  type="date" />
				</p>
				<p>
					<form:label path="details">Additional Information:</form:label>
					<form:textarea path="details" class="input"/>
					<form:errors style="color:red" path="details" />
				</p>
				<p>
					<form:hidden path="user" value="${userId }" />
				</p>
				<button type="submit" class="btn btn-success">Add</button>
			</form:form>

		</div>
	</div>
</body>
</html>