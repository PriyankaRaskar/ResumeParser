function  RegistrationDetail()                                    
{ 
    var name = document.forms["RegForm"]["cname"]; 
    var number = document.forms["RegForm"]["regno"];
    var email = document.forms["RegForm"]["email"];    
    var address = document.forms["RegForm"]["address"];  
    var uname =  document.forms["RegForm"]["username"];  
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
}