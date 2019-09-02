<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<head> 
<script> 
function  RegistrationDetail()                                    
{ 
    var name = document.forms["RegForm"]["name"]; 
    var number = document.forms["RegForm"]["number"];
    var email = document.forms["RegForm"]["email"];    
    var address = document.forms["RegForm"]["address"];  
    var uname =  document.forms["RegForm"]["uname"];  
    var pwd = document.forms["RegForm"]["pwd"];  
    var rpwd = document.forms["RegForm"]["rpwd"];  
    var contact = document.forms["RegForm"]["contact"];
    var area = document.forms["RegForm"]["area"];
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
    if (uname.value == "")                               
    { 
        window.alert("Please enter Username"); 
        uname.focus(); 
        return false; 
    } 
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
   
   
   
    return true; 
}</script> 
  
<style> 
RegistrationDetail {                                         
    margin-left: 70px; 
    font-weight: bold ; 
    float: left; 
    clear: left; 
    width: 100px; 
    text-align: left; 
    margin-right: 10px; 
    font-family:sans-serif,bold, Arial, Helvetica; 
    font-size:14px; 
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
}</style></head> 
   
<body> 
<h1 style="text-align: center"> REGISTRATION FORM </h1>           
<form name="RegForm" action="login.jsp" onsubmit="return RegistrationDetail()" method="post">  
      
    <p>Name of company: <input type="text" size=65 name="name"> </p><br>
    <p>Registration no of company: <input type="text" size=65 name="number"> </p><br>        
    <p>E-mail Address: <input type="text" size=65 name="email">  </p><br> 
    <p> Address: <input type="text" size=65 name="address">  </p><br> 
    <p>User name: <input type="text" size=65 name="uname"> </p><br>
     <p>Password: <input type="password" size=65 name="pwd"> </p><br> 
     <p>Re-enter password: <input type="password" size=65 name="rpwd"> </p><br>
    <p>Contact detail: <input type="text" size=65 name="contact"> </p><br>
    <p>Functional Area: <input type="text" size=65 name="area"> </p><br>   
           
    
    
    <p><input type="submit" value="submit" name="Submit">      
        <input type="reset" value="Reset" name="Reset">   

</form> 
</body> 
</html>

