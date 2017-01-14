<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>


<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Tours</title>
</head>
<body>
<%
		//allow access only if session exists
		String user = (String) session.getAttribute("user");
		String userName = null;
		String sessionID = null;
		 Cookie[] cookies = request.getCookies();
		if (cookies != null) {
			for (Cookie cookie : cookies) {
				if (cookie.getName().equals("user"))
					userName = cookie.getValue();
				if (cookie.getName().equals("JSESSIONID"))
					sessionID = cookie.getValue();
			}
		} 
	%>

<form action="AddTourServlet" method="post">
	<table border="1">
		<tr>
			<th>tour_id</th>
			<th>cost</th>
			<th>country</th>
			<th>fire_tour</th>
			<th>type_id</th>
			<th>make an order</th>
		</tr>
		<c:forEach var="tourList" items="${tourList}">
			<tr>
				<td>${tourList.tour_id}</td>
				<td>${tourList.cost}</td>
				<td>${tourList.country}</td>
				<td>${tourList.fire_tour}</td>
				<td>${tourList.type_id}</td>
				<td>
				<input type="hidden" name="tourOrder" value="${tourList.tour_id}">
				<input type="submit" value="Order${tourList.tour_id}">
				</td>
			</tr>
		</c:forEach>
	</table>
</form>
</body>
</html>