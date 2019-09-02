<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<script type="text/javascript">
function Redirect()
{
	window.location="browser.jsp";
}
</script>
</head>
<body>
<form action="Login" method="post">
<h1> Jobseeker Login</h1>
User_name<input type="text" name="name" >
<p>Password<input type="password" name="password" >

<input type = "button" value = "Submit" onclick = "Redirect();" />
</p>
</form>





</body>
</html>



