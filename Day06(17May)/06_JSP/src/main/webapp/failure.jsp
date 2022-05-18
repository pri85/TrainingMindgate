<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%! String userId; %>

<% userId = request.getParameter("txtUserId"); %>
<h1>Try again </h1><% out.print(userId); %>
</body>
</html>