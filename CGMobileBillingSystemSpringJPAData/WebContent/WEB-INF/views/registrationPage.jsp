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
	<h2>Enroll as a new customer, today!</h2>
	<table>
	<form:form action ="registerCustomer" method="post" modelAttribute="customer">
	
		<tr>
		<td>First Name</td>
		<td><form:input path="firstName" size="30"/></td>
		<td><form:errors path="firstName" cssClass="error"/></td>
		</tr>
		
		<tr>
		<td>Last Name</td>
		<td><form:input path="lastName" size="30"/></td>
		<td><form:errors path="lastName" cssClass="error"/></td>
		</tr>
		
		<tr>
		<td>Email ID</td>
		<td><form:input path="emailID" size="30"/></td>
		<td><form:errors path="emailID" cssClass="error"/></td>
		</tr>
		
		<tr>
		<td>Date of Birth</td>
		<td><form:input path="dateOfBirth" size="30"/></td>
		<td><form:errors path="dateOfBirth" cssClass="error"/></td>
		</tr>
		
		<tr>
		<td>City</td>
		<td><form:input path="billingAddress.city" size="30"/></td>
		<td><form:errors path="billingAddress.city" cssClass="error"/></td>
		</tr>
		
		<tr>
		<td>State</td>
		<td><form:input path="billingAddress.state" size="30"/></td>
		<td><form:errors path="billingAddress.state" cssClass="error"/></td>
		</tr>
		
		<tr>
		<td>Pincode</td>
		<td><form:input path="billingAddress.pinCode" size="30"/></td>
		<td><form:errors path="billingAddress.pinCode" cssClass="error"/></td>
		</tr>
		
		<tr>
		<td><input type="submit" value="Submit"/></td>
		</tr>
	
	</form:form>
	</table>
	</div>
</body>
</html>