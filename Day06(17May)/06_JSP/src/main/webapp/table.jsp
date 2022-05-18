<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%! int number; %>

<% number = Integer.parseInt(request.getParameter("txtNumber")); %>
<h2>Multiplication table of
  <% out.println(number); %>
</h2>
<table border="1">
	
	<% for(int i =1;i<=number;i++){
	%>
	<tr>
		<td><%= number %><br></td>
		<td><%= i %><br></td>
		<td><%= i*number %><br></td>
	</tr>
	<%
	}
	%>	
	
</table>
</body>
</html>