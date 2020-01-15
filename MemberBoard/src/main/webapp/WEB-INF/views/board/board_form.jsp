<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h2>글 작성 페이지</h2>
	<hr/>
	<form action = "write" method = "post">
		<input type = "hidden" name="name" value="${name }">
		<table width = "500x" border="1">
			<tr>
				<td>작성자</td>
				<td>${name}(${id}) </td>
			</tr>
			<tr>
				<td>글 제목</td>
				<td>
					<input type = "text" name = "title" size="20">
				</td>
			</tr>
			<tr>
				<td>글 내용</td>
				<td>
					<textarea rows="content" rows="10" cols="50"></textarea>
				</td>
			</tr>
			<tr>
				<td colspan="2">
				<td>
					<input type = "submit" value="완료">
					<a href = "main">게시글 목록으로</a>
				</td>
			</tr>
		</table>
	</form>





</body>
</html>