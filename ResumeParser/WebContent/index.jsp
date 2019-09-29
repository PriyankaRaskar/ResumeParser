<!DOCTYPE html>
<html lang="en">

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

</head>

<body>

	<nav class="navbar navbar-expand-md navbar-dark bg-dark"></nav>
	<!-- Navigation -->
	<nav
		class="navbar fixed-top navbar-expand-lg navbar-dark bg-dark fixed-top">
		<div class="container">
			<a class="navbar-brand" href="index.html">Resume Parser</a>

			<ul class="navbar-nav">

				<li><a href="emplogin.jsp">Employer Login</a></li>
				<li><a href="Empregistration.jsp">Employer Registration</a></li>



				<li><a href="jobseekerlogin.jsp">JobSeeker Login</a></li>
				<li><a href="JobseekerRegistration.jsp">JobSeeker
						Registration</a></li>

			</ul>
		</div>
	</nav>

	<header>
		<div id="carouselExampleIndicators" class="carousel slide"
			data-ride="carousel">
			<ol class="carousel-indicators">
				<li data-target="#carouselExampleIndicators" data-slide-to="0"
					class="active"></li>
				<li data-target="#carouselExampleIndicators" data-slide-to="1"></li>

			</ol>
			<div class="carousel-inner" role="listbox">
				<!-- Slide One - Set the background image for this slide in the line below -->
				<div class="carousel-item active"
					style="background-image: url('images/resumeparser2.jpg')">
					<div class="carousel-caption d-none d-md-block"></div>
				</div>
				<!-- Slide Two - Set the background image for this slide in the line below -->
				<div class="carousel-item"
					style="background-image: url('images/resumeparser1.png')">
					<div class="carousel-caption d-none d-md-block"></div>
				</div>

			</div>
			<a class="carousel-control-prev" href="#carouselExampleIndicators"
				role="button" data-slide="prev"> <span
				class="carousel-control-prev-icon" aria-hidden="true"></span> <span
				class="sr-only">Previous</span>
			</a> <a class="carousel-control-next" href="#carouselExampleIndicators"
				role="button" data-slide="next"> <span
				class="carousel-control-next-icon" aria-hidden="true"></span> <span
				class="sr-only">Next</span>
			</a>
		</div>
	</header>

	<!-- Page Content -->
	<div class="container">

		<h1 class="my-4">Welcome to Resume Parser</h1>

		<!-- Marketing Icons Section -->
		<div class="row">
			<div class="col-lg-6 mb-6">
				<div class="card h-100">
					<h4 class="card-header">Employer</h4>
					<div class="card-body">
						<p class="card-text">Who will select the candidate according
							to his requirement</p>
					</div>
					<div class="card-footer">
						<a href="emptestpage.jsp" class="btn btn-primary">I am
							Employer</a>
					</div>
				</div>
			</div>
			<div class="col-lg-6 mb-6">
				<div class="card h-100">
					<h4 class="card-header">Jobseeker</h4>
					<div class="card-body">
						<p class="card-text">Who will upload his resume</p>
					</div>
					<div class="card-footer">
						<a href="jobseekertestpage.jsp" class="btn btn-primary">I am
							Jobseeker</a>
					</div>
				</div>
			</div>

		</div>
		<!-- /.row -->


		<hr>



	</div>

	<!-- Bootstrap core JavaScript -->
	<script src="vendor/jquery/jquery.min.js"></script>
	<script src="vendor/bootstrap/js/bootstrap.bundle.min.js"></script>

</body>

</html>
