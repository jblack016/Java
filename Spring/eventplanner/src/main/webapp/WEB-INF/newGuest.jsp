<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
 <!-- c:out ; c:forEach etc. --> 
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
 <!-- Formatting (dates) --> 
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
 <!-- form:form -->
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
 <!-- for rendering errors on PUT routes -->
<%@ page isErrorPage="true" %>

<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Title</title>
    <link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css">
    <link rel="stylesheet" href="/css/style.css"> <!-- change to match your file/naming structure -->
    <script src="/webjars/jquery/jquery.min.js"></script>
    <script src="/webjars/bootstrap/js/bootstrap.min.js"></script>
</head>
<body>
	<div class="container mt-5">
		<h1>Add a Guest</h1>
		<a href="/events">Home</a>

		<form:form action="/events/${eventId}/guests/process" method="POST"
			modelAttribute="newEventUser">
			<p>
				<form:label path="guest">Name:</form:label>
				<form:input path="guest" />
				<form:errors style="color:red" path="guest" />
			</p>
			<p>
				<form:label path="contribution">Contribution:</form:label>
				<form:input path="contribution" />
				<form:errors style="color:red" path="contribution" />
			</p>
			<p>
				<form:hidden path="user" value="${userId }" />
				<form:hidden path="event" value="${eventId }" />
			</p>
			<button type="submit" class="btn btn-primary">Add</button>
		</form:form>


	</div>
</body>
</html>