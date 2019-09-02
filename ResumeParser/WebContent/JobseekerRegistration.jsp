<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>JobSeeker Registration page</title>
<head>
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

		return true;
	}
</script>

<style>
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

