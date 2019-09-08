<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
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
				<form class="form-horizontal" action='EmployerSearch' method="POST">
	<!-- Navigation -->
	<nav
		class="navbar fixed-top navbar-expand-lg navbar-dark bg-dark fixed-top">
		<div class="container">
			<a class="navbar-brand" href="index.html">Resume Parser</a>
		</div>
	</nav>
	<div class="container register-form">

		<div class="form">
			<div class="note">
				<p>Employer's Home Page</p>
				
			</div>

			<div class="form-content">
				<div class="row">
					<div class="col-md-2">
						<div class="form-group">
							<span>Functional Area</span> <input type="text"
								class="form-control" placeholder="" value="" name="functionarea" />
						</div>

					</div>
					<div class="col-md-1">
						<div class="form-group"></div>
						<div class="form-group">
							<select class="browser-default custom-select" name="select1">
								<option selected>select menu</option>
								<option value="AND">AND</option>
								<option value="OR">OR</option>
							</select>
						</div>

					</div>
					<div class="col-md-2">
						<div class="form-group">
							<span>Education</span> <input type="text" class="form-control"
								placeholder="" value="" name="education" />
						</div>
					</div>
					<div class="col-md-1">
						<div class="form-group"></div>
						<div class="form-group">
							<select class="browser-default custom-select" name="select2">
								<option selected>select menu</option>
								<option value="AND">AND</option>
								<option value="OR">OR</option>
							</select>
						</div>

					</div>
					<div class="col-md-2">
						<div class="form-group">
							<span>Skill</span> <input type="text" class="form-control"
								placeholder="" value="" name="skill" />
						</div>
					</div>
					<div class="col-md-1">
						<div class="form-group"></div>
						<div class="form-group">
							<select class="browser-default custom-select" name="select3">
								<option selected>select menu</option>
								<option value="AND">AND</option>
								<option value="OR">OR</option>
							</select>
						</div>

					</div>

					<div class="col-md-2">
						<div class="form-group">
							<span> Experience</span> <input type="text" class="form-control"
								placeholder="" value="" name="experience" />
						</div>
					</div>

				</div>
				<input type="Submit" class="btnSubmit" onclick="" value="Search">
			
			</div>

		</div>

	</div></form>
</body>
</html>