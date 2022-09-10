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

	<div class="container">
		<h1 class="text-center">My Custom login page</h1>
		<div class="text-center">
			<form:form action="process-login" method="post" class="form">
				<div class="row mt-5">
					<div class="col-md-4  input-group">

						<input type="text" name="username" class="form-control"
							placeholder="user name" /> <input type="password"
							name="password" class="form-control" placeholder="password" />

						<button class="btn btn-danger">Submit</button>
					</div>

					<div class="col-md-4 ">
						<!-- Write some code to handle the invalid login scinario-->
						<c:if test="${param.error != null}">
							<i class="text-danger">invalid login or password</i>
						</c:if>
						<c:if test="${param.logout != null}">
							<i class="text-danger">You are successfully loged out. ! sign
								in again</i>
						</c:if>
					</div>
				</div>
			</form:form>
		</div>
	</div>
</body>
</html>