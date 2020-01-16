<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h2>${detail.boardnum }번 게시물</h2>
	<table width="500px" border="1">
		<tr>
			<td width = "20%">글 번호</td>
			<td width = "30%">${detail.boardnum }</td>
			
			<td width = "20%">조회수</td>
			<td width = "30%">${detail.hit }</td>
		</tr>
	
		<tr>
			<td width = "20%">작성자</td>
			<td width = "30%">${detail.name }</td>
		
			<td width = "20%">작성일</td>
			<td width = "30%">${detail.bdate }</td>
		</tr>
		
		<tr>
			<td width = "20%">글내용</td>
			<td width = "30%" height="100px" colspan="3">${detail.content }</td>	
		</tr>
		
		<tr>
			<td colspan = "4">
				<a href = "../list">[목록으로]</a>
				<a href = "../delete/${detail.boardnum }">[삭제하기]</a>
				<a href = "../update/${detail.boardnum }">[수정하기]</a>
			</td>
		</tr>
	</table>
</body>
</html>