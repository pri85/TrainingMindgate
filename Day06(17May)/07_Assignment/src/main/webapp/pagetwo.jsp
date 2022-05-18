<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<% 
	String userName= request.getParameter("txtName"); 
	session.setAttribute("username", userName);
%>
<form action="display.jsp" method="post">
	Address <input type="text" name="txtAddress"><br><br>
	<input type="submit" value="Ok">
	<input type="reset" value="Clear">
</form>	
	
</body>
</html>