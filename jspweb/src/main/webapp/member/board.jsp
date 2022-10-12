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
	제목 :	<input type="text"  id="btitle"><br>
	내용 :	<input type="text"  id="bcontent"><br>
	작성자 :	<input type="text"  id="bwriter"><br>
	비밀번호 :	<input type="password"  id="bpassword"><br>
		<button type="button" onclick="board()">글쓰기</button>

		<h3>글 출력</h3>
	<table id="boardtable">
	</table>
		
	<h3> 글 상세</h3>
	<table>
		<tr>
			<td>번호</td><td id="row1"></td>
			<td>제목</td><td id="row2"></td>
			<td>내용</td><td id="row3"></td>
			<td>작성자</td><td id="row4"></td>
			<td>작성일</td><td id="row5"></td>
			<td>조회수</td><td id="row6"></td>
		</tr>
	
	</table>		
			
			
		
		
		
	<!-- jQUERY 라이브러리 -->
	<script src="http://code.jquery.com/jquery-latest.min.js"></script>			
	<script type="text/javascript" src="../js/member/board.js"></script>		

</body>
</html>