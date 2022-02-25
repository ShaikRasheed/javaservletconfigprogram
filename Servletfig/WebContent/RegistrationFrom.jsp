<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<style type="text/css">
#table1
{ 
	bg-color: rgb(238, 130, 238);
	border-collapse: collapse;
	 text-align: center;
}
	
</style>
</head>
<body>
	<form action="/Validate1">
	<table border="1" id="table1" >
	<th>Registration form</th>
	<tr>
		<td>First Name: <input type ="text" name="firstname"><br/></td>
	</tr>
	<tr>
		<td>Last Name: <input type ="text" name = "lastname"><br/></td>
	</tr>
	<tr>
		<td>Gmail: <input type ="text" name = "gmail"><br/></td>
	</tr>
	<tr>
		<td>Phone No:<input type ="text" name = "phoneno"><br/></td>
	</tr>
	<tr>	
		<td>Submit: <input type ="submit" value = "submit"> 
		Reset:<input type="reset" value="Reset"></td>
	</tr>
	</table>	
	</form>
</body>
</html>