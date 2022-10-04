<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Form Page</title>
<link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css" />
<link rel="stylesheet" href="/css/style.css" />
</head>
<body class="center">
	<h1>Send an Omikuji!</h1>
	<div class="flex">
		<div class=" box">
			<form action="/process/omikuji" method="POST">
				<div>
					<label>Pick any number from 5 to 25: </label> <input type="number"
						name="number" />
				</div>
				<div>
					<label>Enter the name of any City:</label> <input type="text"
						name="city" />
				</div>
				<div>
					<label>Enter the name of any real person:</label> <input
						type="text" name="person" />
				</div>
				<div>
					<label>Enter professional endeavor or hobby:</label> <input
						type="text" name="hobby" />
				</div>
				<div>
					<label>Enter any type of living thing:</label> <input type="text"
						name="thing" />
				</div>
				<div>
					<label>Say something nice to someone:</label>
					<textarea name="comment"></textarea>
				</div>

				<button type="submit" class="btn btn-primary">Submit</button>
			</form>
		</div>
	</div>
</body>
</html>