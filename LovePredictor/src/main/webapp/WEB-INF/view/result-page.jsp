<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Love Calculator</title>
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
					<p>
						The Love Calculator predicts : <br /> <span
							class="text-light h5 fw-bold">${userInfo.yourName}</span> and <span
							class="text-light fw-bold h5">${userInfo.crushName}</span> are <br />
						<span class="text-light h3 fw-bold">${userInfo.result}</span>.
					</p>
					<h5>
						<a class="btn btn-outline-warning" href="/LovePredictor">Try with another
							names..!</a>
					</h5>
					<p>
						<a class="btn btn-outline-light" href="send-email">send result
							to your E-mail</a>
					</p>
				</div>
			</div>
		</div>
	</div>
</body>
</html>