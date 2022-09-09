<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" isELIgnored="false"%>
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
	<h1 class="text-center">Student Management System</h1>
	<hr>
	<div class="text-center">
		<a href="addStudent" class="btn btn-outline-primary">Add Student</a>
	</div>
	<div class="container-fluid">
		<div class="row">
			<div class="col col-md-8 offset-md-2 mt-3">
				<table class="table table-hover table-secondary-striped">
					<thead class="table table-dark">
						<tr>
							<th>ID</th>
							<th>Name</th>
							<th>Mobile</th>
							<th>Country</th>
							<th></th>
							<th></th>
						</tr>
					</thead>
					<tbody class="table">

						<c:forEach var="student" items="${students}">
							<tr>
								<td >${ student.id }</td>
								<td>${ student.name }</td>
								<td>${ student.mobile }</td>
								<td>${ student.country }</td>
								<td><a id="update-delete" href="addStudent"
									class="btn btn-success bg-success">Update</a></td>
								<td><a id="update-delete" href="addStudent"
									class="btn btn-danger bg-danger">Delete</a></td>
							</tr>
						</c:forEach>

					</tbody>
				</table>
			</div>
		</div>
	</div>

</body>
</html>