<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<h3>게시판</h3>
	<form action="/jspweb/member/board" method="get">
	제목 : <input type="text" name="btitle"><br>
	내용 : <input type="text" name="bcontent"><br>
	작성자 : <input type="text" name="bwriter"><br>
	비밀번호 : <input type="text" name="bpassword"><br>
	<input type="submit" value="게시물등록">
	</form>

</body>
</html>