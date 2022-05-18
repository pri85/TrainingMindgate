<%@page import="org.apache.jasper.tagplugins.jstl.core.ForEach"%>
<%@page import="java.util.Set"%>
<%@page import="com.mindgate.pojo.Employee"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h3>All Employees</h3>
<%
Set<Employee> allEmployees = (Set<Employee>)session.getAttribute("data");
%>
<table border="1">
	<tr>
		<td>EmployeeId </td>
		<td>Name </td>
		<td>Salary </td>
	</tr>
	<%
	 	for(Employee employee : allEmployees){
	%>
	<tr>
		<td><%= employee.getEmployeeId() %> </td>
		<td><%= employee.getName() %></td>
		<td><%= employee.getSalary() %></td>
	</tr>
	<%
	 	}
	%>
</table>
<br>
<a href="addnewemployee.html">New Employee</a>
</body>
</html>