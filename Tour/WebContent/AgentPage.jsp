<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>


<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Users and Tours</title>
</head>
<body>
	<form action="OrderServlet" method="post">
	<table border="1">
		<tr>
			<th>user_id</th>
			<th>name</th>
			<th>surname</th>
			<th>discount</th>
		
		</tr>
		<c:forEach var="userListWLP" items="${userListWLP}">
			<tr>
				<td>${userListWLP.user_id}</td>
				<td>${userListWLP.name}</td>
				<td>${userListWLP.surname}</td>
				<td>${userListWLP.discount}</td>
			</tr>
		</c:forEach>
	</table>
</form>
</body>
</html>