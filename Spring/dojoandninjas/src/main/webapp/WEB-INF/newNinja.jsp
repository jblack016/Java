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
    	<h1>New Ninja</h1>
    </div>
    
       	   <form:form action="/ninjas/process" method="POST" modelAttribute="newNinja">
       	   <p>
   			<form:label path="dojo">Pick a Dojo</form:label>
   			<form:select path="dojo">
   			<c:forEach var="eachDojo" items= "${dojoList }">
   			<form:option value="${eachDojo.id }">${eachDojo.name }</form:option>
   			</c:forEach>
   			</form:select>
   			   <form:errors style="color:red" path="dojo" />
   			</p>
   		<p>
   			<form:label path="firstName">First Name:</form:label>
   			<form:input path="firstName"/>
   			<form:errors style="color:red" path="firstName" />
   		</p>
   		 <p>
   			<form:label path="lastName">Last Name:</form:label>
   			<form:input path="lastName"/>
   			<form:errors style="color:red" path="lastName" />
   		</p>
   		<p>
   			<form:label path="age">Age:</form:label>
   			<form:input type="number" path="age"/>
   			<form:errors style="color:red" path="age" />
   		</p>
   		
   		<button type="submit" class="btn btn-primary">Create</button>
   		<a href="/" class="btn btn-secondary">Home</a>
   </form:form>
    
    
    
    
    
</body>
</html>