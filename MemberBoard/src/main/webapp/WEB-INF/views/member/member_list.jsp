<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>회원 목록을 조회합니다.</h1>
<table border="1", width = "1000px">
	<tr>
		<th>ID</th>
		<th>NAME</th>
		<th>EMAIL</th>
		<th>ADDRESS</th>
		<th>DATE</th>
	</tr>
	<c:forEach var = "member" items="${members }">
	<tr>
		<th>${member.id }</th>
		<th>${member.name }</th>
		<th>${member.email }</th>
		<th>${member.address }</th>
		<th>${member.rdate }</th>
	</tr>
	</c:forEach>
</table>
</body>
</html>