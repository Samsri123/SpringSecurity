<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Love Calculator</title>
<!-- CSS only -->
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
<link rel="stylesheet" href="/LovePredictor/URL/style.css" />
</head>
<body>
	<div class="main">
		<header>
			<h1 class="text-center">𝓛𝓸𝓿𝓮 𝓒𝓪𝓵𝓬𝓾𝓵𝓪𝓽𝓸𝓻</h1>
			<hr>
		</header>
		<div class="container">
			<div class="row">
				<div class="col-md-8 text-center offset-md-2 mt-3">
					<form:form action="process-result"  modelAttribute="userInfo">
						<div class="mb-1">
							<form:input path="yourName" class="form-control"
								placeholder="Your Name" />
							<span class="text-warning mt-1 error"><form:errors path="yourName" /></span>
						</div>
						<div class="mb-1 ">
							<form:input path="crushName" class="form-control"
								placeholder="Crush Name" />
							<span class="text-warning mt-1 error"><form:errors path="crushName" /></span>
						</div>
						<div class="mb-1 form-check">
						<form:checkbox path="termsAndConditions" id="check"  class="form-check-input"/><label for="check" class="form-check-label input-group text-center">I am agreeing that this is for fun</label>
						<span class="text-warning mt-1 error"><form:errors path="termsAndConditions"/></span>
						</div>
						<br />
						<button class="btn btn-info text-center">Proceed</button>
					</form:form>
				</div>
			</div>
		</div>
	</div>
</body>
</html>