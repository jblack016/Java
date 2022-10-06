<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page isErrorPage="true" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css" />
<link rel="stylesheet" href="/css/main.css"/>
<script src="/webjars/jquery/jquery.min.js"></script>
<script src="/webjars/bootstrap/js/bootstrap.min.js"></script>
</head>
<body style="margin: 10vw;">
<h1 class="d-flex justify-content-center">Save Travels</h1>
<table class="table table-dark table-striped table-bordered">
    <thead>
        <tr>
            <th class="text-center">Expense</th>
            <th class="text-center">Vendor</th>
            <th class="text-center">Amount</th>
            <th class="text-center">Actions</th>
        </tr>
    </thead>
    <tbody>
		<c:forEach var="expense" items="${expenses}">
			<tr>
				<td class="text-center"><a href="/expenses/${expense.id}"><c:out value="${expense.name}"></c:out></a></td>
				<td class="text-center"><c:out value="${expense.vendor}"></c:out></td>
				<td class="text-center">$<c:out value="${expense.amount}"></c:out></td>
				
				<td class="text-center">
				<a href="/edit/${expense.id }" class="btn btn-sm btn-primary ms-2">Edit</a>
				<form action="/expenses/${expense.id}" method="post" style="display: inline-block;">
    			<input type="hidden" name="_method" value="delete">
    			<input type="submit" value="Delete" class="btn btn-sm btn-danger ms-2">
				</form>
				</td>
			</tr>	
		</c:forEach>
    </tbody>
</table>
<br>
<h1 class="d-flex justify-content-center">Add an expense:</h1>
<div class="d-flex justify-content-center">
<form:form action="/expenses" method="post" modelAttribute="expense">

	<div>
		<form:label path="name">Expense Name: </form:label><br />
		<form:errors path="name" class="text-danger"/>
		<form:input style="width:250px;" path="name"/>
	</div>

	<div>
		<form:label path="vendor">Vendor: </form:label><br />
		<form:errors path="vendor" class="text-danger"/>
		<form:input style="width:250px;" path="vendor"/>
	</div>
	
	<div>
		<form:label path="amount">Amount: </form:label><br />
		<form:errors path="amount" class="text-danger"/>
		<form:input style="width:250px;" type="double" path="amount"/>
	</div>
	
	<div>
		<form:label path="description">Description: </form:label><br />
		<form:errors path="description" class="text-danger"/>
		<form:textarea style="width:250px;" rows="3" path="description"/>
	</div>
	
	<div>
		<input type="submit" value="Submit"/>
	</div>
	
	

</form:form>
</div>
</body>
</html>