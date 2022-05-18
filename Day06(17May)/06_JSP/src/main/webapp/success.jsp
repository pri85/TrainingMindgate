<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<% String userId = request.getParameter("txtUserId"); %>


<h1>Hello <% out.print(userId); %>
</h1>
</body>
</html>