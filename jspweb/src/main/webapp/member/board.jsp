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
	제목 :	<input type="text"  id="btitle"><br>
	내용 :	<input type="text"  id="bcontent"><br>
	작성자 :	<input type="text"  id="bwriter"><br>
	비밀번호 :	<input type="password"  id="bpassword"><br>
		<button type="button" onclick="board()">글쓰기</button>
	</form>

		<h3>글 출력</h3>
	<table id="boardtable">
	</table>
		
		<button onclick="deleteboard()">글삭제</button>
		<div id="deleteboardbox"></div>
		
			
			
		
		
		
	<!-- jQUERY 라이브러리 -->
	<script src="http://code.jquery.com/jquery-latest.min.js"></script>			
	<script type="text/javascript" src="../js/member/boardlist.js"></script>		

</body>
</html>