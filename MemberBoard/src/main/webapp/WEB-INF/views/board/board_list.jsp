<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>글목록</h1>
	<table border="1">
		<tr>
			<th>글번호</th>
			<th>글쓴이</th>
			<th>제 목</th>
			<th>게시일</th>
			<th>조회수</th>
		</tr>
		<c:forEach var = "board" items = "${boards }">
		<tr>
			<td>${board.boardnum }</td>
			<td>${board.name }</td>
			<td>${board.title }</td>
			<td>${board.bdate }</td>
			<td>${board.hit }</td>
		</tr>
		</c:forEach>
	</table>
</body>
</html>