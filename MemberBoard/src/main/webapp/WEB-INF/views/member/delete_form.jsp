<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>아이디를 삭제합니다. 본인확인을 위해 비밀번호를 한 번 더 입력해주세요.</h1>

	<form action="./delete" method = "post">
	<input type = "hidden" name = "id" value="${id }">
	비밀번호 : <input type ="password" name = "pw" ><br/>
	<input type = "submit" value = "제출">
	<input type = "reset" value = "다시입력">
	</form>
</body>
</html>