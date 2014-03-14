<%@ page language="java" contentType="text/html; charset=UTF-8"	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>입력 화면</title>
</head>
<body>
	<form action="add.jsp" method="post" >
		이름 : <input type="text" name="name" id="name" /> <br />
		비밀번호 : <input type="password" name="password" id="password" /><br />
		<input type="submit" value="로그인" />
		<input type="reset" value="다시입력" />
	</form>
	
	<form action="add" method="post">	
		<input type="text" name="name" id="name" placeholder="이름" /><br />
		<input type="password" name="password" id="password" placeholder="비밀번호" /><br />
		<input type="submit" value="로그인" />
		<input type="reset" value="다시입력" />
	</form>
</body>
</html>