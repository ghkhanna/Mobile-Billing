<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<div align="center">
	<table>
		<form name ="deleteCustomer" action="deleteCustomer" method="post">
	
			<tr>
			<td>Do you want to delete your account</td>
			<td><input type="radio" value="male" checked> Yes<br>
			<input type="radio" value="female"> No<br></td>
			</tr>
		
			<tr>
			<td><input type="submit" value="Submit"/></td>
			</tr>
		</form>
	</table>
	</div>
</body>
</html>