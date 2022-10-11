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
    	<h1>Add a Book to Your Shelf</h1>
    	<a href="/books">Back to the shelves</a>
    	
	<form:form action="/books/process" method="POST"
		modelAttribute="newBook">
		<p>
			<form:label path="title">Book Title:</form:label>
			<form:input path="title" />
			<form:errors style="color:red" path="title" />
		</p>
		<p>
			<form:label path="author">Book Author:</form:label>
			<form:input path="author" />
			<form:errors style="color:red" path="author" />
		</p>
		 <p>
			<form:label path="myThoughts">My Thoughts:</form:label>
			<form:textarea path="myThoughts" />
			<form:errors style="color:red" path="myThoughts" />
		</p>
		<p>
			<form:hidden path="user" value="${userId }" />

		</p>
		<button type="submit" class="btn btn-primary">Add</button>
	</form:form>
    	
    	
    </div>
</body>
</html>