<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ page isErrorPage="true"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css" />
<link rel="stylesheet" href="/css/main.css" />
<script src="/webjars/jquery/jquery.min.js"></script>
<script src="/webjars/bootstrap/js/bootstrap.min.js"></script>
</head>
<body>
	<div class="container-fluid">
		<div class="container mt-4 mx-auto">
			<h2 class="text-center">Expense Details:</h2>
			<div class="col-10 mx-auto">

				<table class="table table-dark table-striped table-bordered text-center">
					<tbody>
						<tr>
							<th>Expense Name:</th>
							<td><c:out value="${expense.name}" /></td>
						</tr>
						<tr>
							<th>Vendor:</th>
							<td><c:out value="${expense.vendor}" /></td>
						</tr>
						<tr>
							<th>Amount:</th>
							<td>$<c:out value="${expense.amount}" />
							</td>
						</tr>
						<tr>
							<th>Description:</th>
							<td><c:out value="${expense.description}" /></td>
						</tr>
					</tbody>
				</table>
			</div>
			<div class="my-3 d-flex justify-content-end">
				<a href="/expenses" class="text-decoration-none btn btn-danger ">Go
					Back</a>
			</div>
		</div>
	</div>

</body>
</html>