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

<!-- Bootstrap core JavaScript -->
<script src="vendor/jquery/jquery.min.js"></script>
<script src="vendor/bootstrap/js/bootstrap.bundle.min.js"></script>
<script>
function  RegistrationDetail()                                    
{ 
    var name = document.forms["RegForm"]["cname"]; 
    var number = document.forms["RegForm"]["regno"];
    var email = document.forms["RegForm"]["email"];    
    var address = document.forms["RegForm"]["address"];  
    //var uname =  document.forms["RegForm"]["username"];  
    var pwd = document.forms["RegForm"]["pwd"];  
    var rpwd = document.forms["RegForm"]["rpwd"];  
    var contact = document.forms["RegForm"]["contactdetail"];
    var area = document.forms["RegForm"]["farea"];
    
    if (name.value == "")                                  
    { 
        window.alert("Please enter your  company name."); 
        name.focus(); 
        return false; 
    } 
   
    if (number.value == "")                               
    { 
        window.alert("Please enter Reg.no."); 
        number.focus(); 
        return false; 
    } 
       
    if (email.value == "")                                   
    { 
        window.alert("Please enter a valid e-mail address."); 
        email.focus(); 
        return false; 
    } 
   
    if (email.value.indexOf("@", 0) < 0)                 
    { 
        window.alert("Please enter a valid e-mail address."); 
        email.focus(); 
        return false; 
    } 
   
    if (email.value.indexOf(".", 0) < 0)                 
    { 
        window.alert("Please enter a valid e-mail address."); 
        email.focus(); 
        return false; 
    } 
    if (address.value == "")                               
    { 
        window.alert("Please enter Address"); 
        address.focus(); 
        return false; 
    } 
    /* if (uname.value == "")                               
    { 
        window.alert("Please enter Username"); 
        uname.focus(); 
        return false; 
    } */ 
    if (pwd.value == "")                               
    { 
        window.alert("Please enter Password"); 
        pwd.focus(); 
        return false; 
    } 
    if (rpwd.value == "")                               
    { 
        window.alert("Please Re-enter password"); 
        rpwd.focus(); 
        return false; 
    } 
    if (contact.value == "")                               
    { 
        window.alert("Please enter contact Detail"); 
        contact.focus(); 
        return false; 
    } 
   
    if (area.value == "")                           
    { 
        window.alert("Please enter your Functional Area"); 
        area.focus(); 
        return false; 
    } 
    if (pwd.value != rpwd.value ) {
		window.alert("password Don't Match");
		rpwd.focus();
		return false;
	}
	return true;
   
   
   
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
		<div class="row justify-content-center">
			<div class="col-md-8">
				<div class="card">
					<div class="card-header">
						<h3 style="text-align: center">Employer Registration Form</h3>
					</div>
					<div class="card-body">
						<form name="RegForm"
							onsubmit="return RegistrationDetail()" method="post" action="EmployerRegister">
							<div class="form-group row">
								<label for="full_name"
									class="col-md-4 col-form-label text-md-right">Name of
									company:*</label>
								<div class="col-md-6">
									<input type="text" id="full_name" class="form-control"
										name="cname">
								</div>
							</div>

							<div class="form-group row">
								<label for="email_address"
									class="col-md-4 col-form-label text-md-right">Registration
									no of company:* </label>
								<div class="col-md-6">
									<input type="text" id="email_address" class="form-control"
										name="regno">
								</div>
							</div>

							<div class="form-group row">
								<label for="user_name"
									class="col-md-4 col-form-label text-md-right">E-mail
									Address:* </label>
								<div class="col-md-6">
									<input type="text" id="user_name" class="form-control"
										name="email">
								</div>
							</div>

							<div class="form-group row">
								<label for="phone_number"
									class="col-md-4 col-form-label text-md-right">Address:*
								</label>
								<div class="col-md-6">
									<input type="text" id="phone_number" class="form-control"
										name="address">
								</div>
							</div>

							

							<div class="form-group row">
								<label for="permanent_address"
									class="col-md-4 col-form-label text-md-right">Password:*
								</label>
								<div class="col-md-6">
									<input type="password" id="pwd" class="form-control"
										name="pwd">
								</div>
							</div>
							<div class="form-group row">
								<label for="permanent_address"
									class="col-md-4 col-form-label text-md-right">Re-enter
									password:* </label>
								<div class="col-md-6">
									<input type="password" id="rpwd" class="form-control"
										name="rpwd">
								</div>
							</div>
							<div class="form-group row">
								<label for="permanent_address"
									class="col-md-4 col-form-label text-md-right">Contact
									detail:* </label>
								<div class="col-md-6">
									<input type="text" id="contactdetail" class="form-control"
										name="contactdetail">
								</div>
							</div>
							<div class="form-group row">
								<label for="permanent_address"
									class="col-md-4 col-form-label text-md-right">Functional
									Area:* </label>
								<div class="col-md-6">
									<input type="text" id="farea" class="form-control"
										name="farea">
								</div>
							</div>



							<div class="col-md-6 offset-md-4">
								<button type="submit" class="btn btn-primary">Register
								</button>
							</div>

						</form>
					</div>
				</div>
			</div>
		</div>

	</div>


</body>

</html>
