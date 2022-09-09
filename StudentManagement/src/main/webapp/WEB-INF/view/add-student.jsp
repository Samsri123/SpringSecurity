<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Student Management</title>
<!-- CSS only -->
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.1/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-iYQeCzEYFbKjA/T2uDLTpkwGzCiq6soy8tYaI1GyVh/UjpbCx/TYkiZhlZB6+fzT"
	crossorigin="anonymous">
<!-- JavaScript Bundle with Popper -->
<script
	src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.1/dist/js/bootstrap.bundle.min.js"
	integrity="sha384-u1OknCvxWvY5kfmNBILK2hRnQC3Pr17a+RTT6rIHI7NnikvbZlHgTPOOmMi466C8"
	crossorigin="anonymous"></script>
<link rel="stylesheet" href="/StudentManagement/URL/style.css" />
</head>
<body>
	<div class="container-fluid">
		<h1 class="text-center">Student Management System</h1>
		<hr>
		<div class="container">
			<div class="row">
				<h3 class="text-center">${type} Student</h3>
				<div class="col col-md-6 offset-md-3 mt-3 text-center">
					<form:form action="saveStudent" method="post" class="form"
						modelAttribute="student">
						<form:hidden path="id"/>
						<div class="row d-flex">
							<div class="col col-md-3 fw-bold mt-1">
								<label>Name</label>
							</div>
							<div class="col col-md-8">
								<form:input path="name" class="form-control mb-2" />
							</div>
						</div>

						<div class="row d-flex">
							<div class="col col-md-3 fw-bold mt-1">
								<label>Mobile</label>
							</div>
							<div class="col col-md-8">
								<form:input path="mobile" class="form-control mb-2" />
							</div>
						</div>

						<div class="row d-flex">
							<div class="col col-md-3 fw-bold mt-1">
								<label>Country</label>
							</div>
							<div class="col col-md-8">
								<form:input path="country" class="form-control mb-2" />
							</div>
						</div>
						<button class="btn btn-outline-danger w-50 mt-3">Submit</button>
					</form:form>
				</div>
			</div>
		</div>
	</div>
</body>
</html>