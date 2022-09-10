<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>login</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-gH2yIJqKdNHPEq0n4Mqa/HGKIhSkIHeL5AyhkYV8i59U5AR6csBvApHHNl/vI1Bx"
	crossorigin="anonymous">
<link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.9.1/font/bootstrap-icons.css">
<!-- JavaScript Bundle with Popper -->
<script
	src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0/dist/js/bootstrap.bundle.min.js"
	integrity="sha384-A3rJD856KowSb7dwlZdYEkO39Gagi7vIsF0jrRAoQmDKKtQBHUuLZ9AsSv4jD4Xa"
	crossorigin="anonymous"></script>


</head>
<body>
	<div class="container-fluid">
		<div class="container mt-5"></div>
		<div class="row mt-2">
			<div
				class="col-md-4 offset-md-4 text-center border border-primary border-top-0 border-bottom-0 p-3 ">
				<h2 class="text-center text-primary">SignUp here..</h2>
				<hr>
				<form:form action="process-signup" method="POST"
					modelAttribute="signup">
					<form:input path="username" placeholder="Enter user name"
						class="form-control mb-2 rounded-0 rounded-top" />
					<form:password path="password" placeholder="Enter password"
						class="form-control mb-2 rounded-0 rounded-bottom" />
					<input class="btn btn-outline-primary rounded-pill w-100"
						type="submit" value="signup" />
				</form:form>
			</div>
		</div>
	</div>
</body>
</html>