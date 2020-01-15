<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>${member.id } 회원 정보 수정 페이지 입니다.</h1>
<form action="update" method = "post">
	<input type = "hidden" name ="id" value="${member.id }">
	비밀번호 : <input type = "password" name ="pw" required><br/>
	이름 : <input type = "text" name ="name" value="${member.name }" required><br/>
	이메일 : <input type = "text" name ="email" value="${member.email }"  required><br/>
	주소 : <input type = "text" name ="address" value="${member.address }"  required><br/>
	<input type = "submit" name ="정보수정" required><br/>
	<input type = "reset" name ="초기화" required><br/>
</form>
</body>
</html>