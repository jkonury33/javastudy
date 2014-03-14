<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>입력 결과</title>
</head>
<body>
	<% 
		request.setCharacterEncoding("utf-8");
		String name = request.getParameter("name"); 
		String password = request.getParameter("password");
	%>
	이름 : <%= name %> <br />
	비밀번호 : <%= password %>
</body>
</html>