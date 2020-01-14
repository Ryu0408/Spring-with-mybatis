<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>회원가입 페이지 입니다.</h1>
<form action="join" method = "post">
	아이디 : <input type = "text" name ="id" required><br/>
	비밀번호 : <input type = "password" name ="pw" required><br/>
	이름 : <input type = "text" name ="name" required><br/>
	이메일 : <input type = "text" name ="email" required><br/>
	주소 : <input type = "text" name ="address" required><br/>
	<input type = "submit" name ="가입" required><br/>
	<input type = "reset" name ="초기화" required><br/>
</form>
</body>
</html>