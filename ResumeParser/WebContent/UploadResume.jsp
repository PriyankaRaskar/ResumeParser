<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form action="UploadResume" method="post"
		enctype="multipart/form-data">
		Welcome ,
		<%= request.getAttribute("email") %>
		<input type="hidden" name="email" value="<%= request.getAttribute("email") %>"/>
		<input type="file" name="resumeFile" size="50" /> <br /> 
		<input type="submit" value="Upload File" />
			
	</form>


</body>
</html>