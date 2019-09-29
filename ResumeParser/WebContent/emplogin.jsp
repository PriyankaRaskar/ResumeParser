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
	
	<!-- Navigation -->
	<nav
		class="navbar fixed-top navbar-expand-lg navbar-dark bg-dark fixed-top">
		<div class="container">
			<a class="navbar-brand" href="index.jsp">Resume Parser</a>
			<button class="navbar-toggler navbar-toggler-right" type="button"
				data-toggle="collapse" data-target="#navbarResponsive"
				aria-controls="navbarResponsive" aria-expanded="false"
				aria-label="Toggle navigation">
				<span class="navbar-toggler-icon"></span>
			</button>
			<ul class="navbar-nav">
				<li><a href="index.jsp">Home Page</a></li>
			</ul>
		</div>
	</nav>


	<!-- Page Content -->
	<div class="container">

		<h1 class="my-4">Welcome Employer</h1>

		<!-- Marketing Icons Section -->
		<div class="row">
			<div class="col-lg-6 mb-6">
				<div class="card h-100">
					<h4 class="card-header">Employer Login</h4>
					<form class="form-horizontal" action='EmployerLogin' method="POST">
						<div class="card-body">

							<fieldset>

								<div class="control-group">
									<!-- Username -->
									<label class="control-label" for="username">Email-Id</label>
									<div class="controls">
										<input type="text" id="username" name="email" placeholder=""
											class="input-xlarge">
									</div>
								</div>
								<div class="control-group">
									<!-- Password-->
									<label class="control-label" for="password">Password</label>
									<div class="controls">
										<input type="password" id="password" name="password"
											placeholder="" class="input-xlarge">
									</div>
								</div>

							</fieldset>

						</div>
						<div class="card-footer">
							<input type="submit" class="btn btn-primary" value="Login" />
						</div>
						<%
							String msg = (String) request.getAttribute("errMsg");
							if (msg != null)
								out.print(msg);
						%>
					</form>
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
