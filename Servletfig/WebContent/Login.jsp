<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<script>
	function error() 
	{
		alert("hello1");
		var username = document.getElementById("username").value;
		alert("hello2"+username);
		var password = document.getElementById("password").value;
		alert("hello3"+username);
		 if(username.length == 0)
	     {
			 alert("hello14")
			 var msg ="Please enter a User valid data";
			 document.getElementById("demo").innerHTML = msg;
	      } 
		 if(password.length == 0)
		{
			  
			 var msg ="Please enter a valid Password data";
			 document.getElementById("demo1").innerHTML = msg;	 
		}
		 
	}
	</script>
	 
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<style type="text/css">
#table1
{ 
	border-collapse: collapse;
}
	
</style>
<title>This User Login Page</title>
</head>
<body>
	
	
	 
		<form method="post" action="successpage.jsp">
	<table border="20" id = "table1">
	<th>  Login Page </th>
	 <tr>
	 	<td> User Name: <input type ="text" name="username" id="username" required >  </td>
	 	  
	 </tr>
		 	
	<tr>	
		<td>Password: <input type ="text" name = "password" id="password"required></td>
		
	</tr>
	 
		 
	<tr>
		<td>Submit <input type ="submit" value= "Login" onclick="error()"> Register Here  <a href="http://localhost:8080/Servletfig/RegistrationFrom.jsp"> Register </a>  </td>
		
		
	</tr>
	 
		 
	
	</table>
	 
	<h4 id="demo" style="color:red">  </h4>
	<h3 id="demo1" style="color:red">  </h3><br/>
	</form>
	
	</body>
	</html>	
</body>
</html>