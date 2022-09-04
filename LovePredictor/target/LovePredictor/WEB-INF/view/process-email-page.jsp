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
			<h2>Hi ${userInfo.yourName}</h2>
			<h3>

				Result is successfully sent to <span class="text-info display-4">${sendMail.email}
				</span>
			</h3>
		</div>
	</div>
</body>
</html>

