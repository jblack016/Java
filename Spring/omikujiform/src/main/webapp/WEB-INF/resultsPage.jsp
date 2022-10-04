<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Results Page</title>
<link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css" />
<link rel="stylesheet" href="/css/style.css"/>
</head>
<body>
	<h1 class="center">Here's Your Omikuji!</h1>
	
	<div class="flex">
		<p class="box fs-4">
			In <c:out value="${ number}"/> years, you will live in <c:out value="${ city}"/> with <c:out value="${ person}"/> 
			as your roommate, <c:out value="${ hobby}"/> for a living. The next time you see a <c:out value="${ thing}"/>, 
			you will have good luck. Also, <c:out value="${ comment}"/>
		</p>
	</div>
	<p class="center"><a href="/omikuji">Go Back</a></p>
</body>
</html>