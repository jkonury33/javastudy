<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>request, pageContext, session Scope</title>
</head>
<body>
	<h2>request, pageContext, session getAttribute</h2>
	
	request : <%= request.getAttribute("request") %> <br />
	pageContext : <%= pageContext.getAttribute("pageContext") %> <br />
	session : <%= session.getAttribute("session") %> <br />
</body>
</html>