<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page import="java.util.*, edu.resume.entity.Jobseeker"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">
<meta name="description" content="">
<meta name="author" content="">

<title>Resume Parser</title>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
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
			<ul class="navbar-nav">
				<li><a href="index.jsp">Home Page</a></li>
			</ul>
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
									class="form-control" placeholder="" value=""
									name="functionarea" />
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

		</div>
	</form>

	<div class="container" id="search-result">
		<table class="table table-bordered">
			<thead>
				<tr>
					<th>Name</th>
					<th>Email</th>
					<th>Mobile Number</th>
					<th>Experience</th>
					<th>Pincode</th>
					<th>Download Resume</th>
				</tr>
			</thead>
			<tbody>
				<%
					List<Jobseeker> jobseekerList = (ArrayList<Jobseeker>) request.getAttribute("jobseekerList");

					if (jobseekerList != null)
						for (Jobseeker jobseeker : jobseekerList) {
				%>


				<tr>

					<!--  <th>${jobseeker.name}</th>-->
					<th><c:out value="<%=jobseeker.getName()%>" /></th>
					<th><c:out value="<%=jobseeker.getEmail()%>" /></th>
					<th><c:out value="<%=jobseeker.getMobileNumber()%>" /></th>
					<th><c:out value="<%=jobseeker.getExperience()%>" /></th>
					<th><c:out value="<%=jobseeker.getPincode()%>" /></th>
					
					<th>
					<form action="DownloadResume" method="post"> 					
					<input type="hidden" name="resumePath" value="<%=jobseeker.getResumePath()%>" />
					<input type="hidden" name="jid" value="<%=jobseeker.getJid()%>" />
					<input type="Submit" class="btn-primary"  value="Download"></form>
					</th>

				</tr>
				<%
					}
				%>

			</tbody>
		</table>

	</div>

</body>
</html>