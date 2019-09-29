<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<head>
<meta charset="utf-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">
<meta name="description" content="">
<meta name="author" content="">

<title>Resume Parser</title>

<!-- Bootstrap core CSS -->
<link href="vendor/bootstrap/css/bootstrap.min.css" rel="stylesheet">

<!-- Custom styles for this template -->
<link href="css/modern-business.css" rel="stylesheet">

<!-- Bootstrap core JavaScript -->
<script src="vendor/jquery/jquery.min.js"></script>
<script src="vendor/bootstrap/js/bootstrap.bundle.min.js"></script>
<body>
	<!-- 
Navigation -->
	<nav
		class="navbar fixed-top navbar-expand-lg navbar-dark bg-dark fixed-top">
		<div class="container">
			<a class="navbar-brand" href="index.html">Resume Parser</a>
			<ul class="navbar-nav">
				<li><a href="index.jsp">Home Page</a></li>
			</ul>
		</div>
	</nav>

	<form action="UploadResume" method="post" enctype="multipart/form-data">

		<div class="container">

			<div class="row justify-content-center">
				<div class="col-md-12">
					Welcome ,
					<%=request.getAttribute("email")%>
				</div>
			</div>
			<div class="row justify-content-center">
				<div class="col-md-3"></div>
				<div class="col-md-3">Select Resume File</div>

				<div class="col-md-3">
					<input type="hidden" name="email"
						value="<%=request.getAttribute("email")%>" /> <input type="file"
						name="resumeFile" size="50" class="btn btn-primary" /> <br />
				</div>
				<div class="col-md-3"></div>
			</div>
		</div>
		<div class="row justify-content-center">
			<div class="col-md-4"></div>
			<div class="col-md-4">
				<input type="submit" value="Upload File" class="btn btn-primary"  />
			</div>
			<div class="col-md-4"></div>
			</div>
			</form>


</body>
</html>