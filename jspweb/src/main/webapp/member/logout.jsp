<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<%@include file="../header.jsp" %>
	
	<% 
		// jsp 스크립트 태그 [ java 코드 작성공간 ]
		session.setAttribute("mid",null);
		// 페이지 전환
		response.sendRedirect("/jspweb/index.jsp");
	%>
	

</body>
</html>