<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>request, pageContext, session Scope</title>
</head>
<body>
	<h2>request, pageContext, session Scope</h2>
	
	<%
		request.setAttribute("request", "request scope");
		pageContext.setAttribute("pageContext", "pageContext scope");
		session.setAttribute("session", "session score");
	%>
	
	request : <%= request.getAttribute("request") %> <br />
	pageContext : <%= pageContext.getAttribute("pageContext") %> <br />
	session : <%= session.getAttribute("session") %> <br />
	
	<a href="request_pageContextGet.jsp">이동</a> <br />
	<a href="request_pageContext_forward.jsp">jsp forward</a>
	
</body>
</html>