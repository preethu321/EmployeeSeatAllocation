<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Home</title>
</head>
<body>
<form:form method="post" action="employee/addEmployeee" modelAttribute="employee">
<form:label path="employeecode">Code</form:label>
<form:input path="employeecode"/>
<input type="submit" value="Send" />
</form:form>

</body>
</html>

