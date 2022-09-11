<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="sec"
	uri="http://www.springframework.org/security/tags"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
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

<link rel="stylesheet" href="URL/style.css" />
</head>
<body>
	<div class="container-fluid">
		<div class="container">
			<h1 class="text-center text-dark">SpringFramework Platform</h1>
			<hr />
			<h2>Hi ${username},</h2>
			<h4>Roles assigned are : ${roles}</h4>

			<div class="row">
				<div class="col-md-4">

					<div class="card" style="width: 18rem;">

						<div class="card-body">
							<h5 class="card-title">
								<svg xmlns="http://www.w3.org/2000/svg" width="46" height="46"
									fill="currentColor" class="bi bi-file-earmark-code-fill"
									viewBox="0 0 16 16">
  <path
										d="M9.293 0H4a2 2 0 0 0-2 2v12a2 2 0 0 0 2 2h8a2 2 0 0 0 2-2V4.707A1 1 0 0 0 13.707 4L10 .293A1 1 0 0 0 9.293 0zM9.5 3.5v-2l3 3h-2a1 1 0 0 1-1-1zM6.646 7.646a.5.5 0 1 1 .708.708L5.707 10l1.647 1.646a.5.5 0 0 1-.708.708l-2-2a.5.5 0 0 1 0-.708l2-2zm2.708 0 2 2a.5.5 0 0 1 0 .708l-2 2a.5.5 0 0 1-.708-.708L10.293 10 8.646 8.354a.5.5 0 1 1 .708-.708z" />
</svg>
								Trainers
							</h5>
							<p class="card-text">Check here Trainer's dash board.</p>
							<sec:authorize access='hasAuthority("trainer")'>
								<a href="trainer" class="btn btn-outline-primary">Show
									Trainers Dash Board</a>
							</sec:authorize>
						</div>
					</div>

				</div>


				<div class="col-md-4 coders offset-md-1">

					<div class="card" style="width: 18rem;">

						<div class="card-body">
							<h5 class="card-title">
								<svg xmlns="http://www.w3.org/2000/svg" width="46" height="46"
									fill="currentColor" class="bi bi-person-rolodex"
									viewBox="0 0 16 16">
  <path d="M8 9.05a2.5 2.5 0 1 0 0-5 2.5 2.5 0 0 0 0 5Z" />
  <path
										d="M1 1a1 1 0 0 0-1 1v11a1 1 0 0 0 1 1h.5a.5.5 0 0 0 .5-.5.5.5 0 0 1 1 0 .5.5 0 0 0 .5.5h9a.5.5 0 0 0 .5-.5.5.5 0 0 1 1 0 .5.5 0 0 0 .5.5h.5a1 1 0 0 0 1-1V3a1 1 0 0 0-1-1H6.707L6 1.293A1 1 0 0 0 5.293 1H1Zm0 1h4.293L6 2.707A1 1 0 0 0 6.707 3H15v10h-.085a1.5 1.5 0 0 0-2.4-.63C11.885 11.223 10.554 10 8 10c-2.555 0-3.886 1.224-4.514 2.37a1.5 1.5 0 0 0-2.4.63H1V2Z" />
</svg>
								Coders
							</h5>
							<p class="card-text">Check here for Coder's dash board.</p>

							<sec:authorize access='hasAuthority("coder")'>
								<a href="coder" class="btn btn-outline-primary">Show Coders
									Dash Board</a>
							</sec:authorize>
						</div>
					</div>
				</div>
				<form:form action="logout" method="post">
					<button class="btn btn-outline-danger">logout</button>
				</form:form>

			</div>
		</div>
	</div>
</body>
</html>