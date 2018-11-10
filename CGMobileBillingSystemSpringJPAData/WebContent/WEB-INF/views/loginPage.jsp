<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<div align="center">
	<table>
		<form name ="depositAmount" action="depositAmount" method="post">
	
			<tr>
			<td>Account Number</td>
			<td><input type="text" name="accountNo" size="30"/></td>
			</tr>
		
			<tr>
			<td>Amount to be deposited</td>
			<td><input type="text" name="amount" size="30"/></td>
			</tr>
		
			<tr>
			<td><input type="submit" value="Submit"/></td>
			</tr>
		</form>
	</table>
	</div>
</body>
</html>