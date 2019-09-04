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

<!-- Bootstrap core JavaScript -->
<script src="vendor/jquery/jquery.min.js"></script>
<script src="vendor/bootstrap/js/bootstrap.bundle.min.js"></script>
<script>
	function JRegistrationDetail() {
		var name = document.forms["jRegForm"]["name"];
		var email = document.forms["jRegForm"]["email"];
		var pwd = document.forms["jRegForm"]["pwd"];
		var rpwd = document.forms["jRegForm"]["rpwd"];

		if (name.value == "") {
			window.alert("Please enter your name.");
			name.focus();
			return false;
		}

		if (email.value == "") {
			window.alert("Please enter a valid e-mail address.");
			email.focus();
			return false;
		}

		if (email.value.indexOf("@", 0) < 0) {
			window.alert("Please enter a valid e-mail address.");
			email.focus();
			return false;
		}

		if (email.value.indexOf(".", 0) < 0) {
			window.alert("Please enter a valid e-mail address.");
			email.focus();
			return false;
		}

		if (pwd.value == "") {
			window.alert("Please enter Password");
			pwd.focus();
			return false;
		}
		if (rpwd.value == "") {
			window.alert("Please Re-enter password");
			rpwd.focus();
			return false;
		}
		if (pwd.value != rpwd.value ) {
			window.alert("password Don't Match");
			rpwd.focus();
			return false;
		}
		return true;
	}
</script>
</head>
<body>
	<!-- Navigation -->
	<nav
		class="navbar fixed-top navbar-expand-lg navbar-dark bg-dark fixed-top">
		<div class="container">
			<a class="navbar-brand" href="index.html">Resume Parser</a>
			

		</div>
	</nav>
	<!-- Page Content -->
	<div class="container">
		<div class="row justify-content-center">
			<div class="col-md-8">
				<div class="card">
					<div class="card-header">
						<h3 style="text-align: center">Jobseeker Registration Form</h3>
					</div>
					<div class="card-body">
						<form name="jRegForm" 
							method="post" action="JobseekerRegister">
							<div class="form-group row">
								<label for="full_name"
									class="col-md-4 col-form-label text-md-right">Name :</label>
								<div class="col-md-6">
									<input type="text" id="full_name" class="form-control"
										name="name">
								</div>
							</div>



							<div class="form-group row">
								<label for="user_name"
									class="col-md-4 col-form-label text-md-right">E-mail
									Address: </label>
								<div class="col-md-6">
									<input type="text" id="user_name" class="form-control"
										name="email">
								</div>
							</div>



							<div class="form-group row">
								<label for="permanent_address"
									class="col-md-4 col-form-label text-md-right">Password:
								</label>
								<div class="col-md-6">
									<input type="password" id="permanent_address" class="form-control"
										name="pwd">
								</div>
							</div>
							<div class="form-group row">
								<label for="permanent_address"
									class="col-md-4 col-form-label text-md-right">Re-enter
									password: </label>
								<div class="col-md-6">
									<input type="password" id="permanent_address" class="form-control"
										name="rpwd">
								</div>
							</div>





							<div class="col-md-6 offset-md-4">
								<button type="submit" class="btn btn-primary" onclick="return JRegistrationDetail()">Register
								</button>
								<%
									String msg = (String) request.getAttribute("errMsg");
									if (msg != null)
										out.print(msg);
								%>
							</div>

						</form>
					</div>
				</div>
			</div>
		</div>

	</div>
</body>
</html>

<%-- <style>
JRegistrationDetail {
	margin-left: 70px;
	font-weight: bold;
	float: left;
	clear: left;
	width: 100px;
	text-align: left;
	margin-right: 10px;
	font-family: sans-serif, bold, Arial, Helvetica;
	font-size: 14px;
}

div {
	box-sizing: border-box;
	width: 100%;
	border: 100px solid black;
	float: left;
	align-content: center;
	align-items: center;
}

form {
	margin: 0 auto;
	width: 600px;
}
</style>
</head>

<body>
	<h1 style="text-align: center">REGISTRATION FORM</h1>
	<form name="jRegForm" action="JobseekerRegister"
		onsubmit="return JRegistrationDetail()" method="post">


		<p>
			JobSeeker Name : <input type="text" size=65 name="name">
		</p>
		<br>
		<p>
			Email Id: <input type="text" size=65 name="email">
		</p>
		<br>
		<p>
			Password: <input type="password" size=65 name="pwd">
		</p>
		<br>
		<p>
			Re-enter Password: <input type="password" size=65 name="rpwd">
		</p>
		<br>
		<p>
			<input type="submit" value="submit" name="Submit"> <input
				type="reset" value="Reset" name="Reset">
			<%
				String msg = (String) request.getAttribute("errMsg");
				if (msg != null)
					out.print(msg);
			%>
		
	</form>
</body>
</html>
 --%>
