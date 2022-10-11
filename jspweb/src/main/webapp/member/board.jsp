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


	<div id="viewbox">
		<h3>글목록</h3>
		<button onclick="deleteboard()">글삭제</button>
		<div id="deleteboardbox"></div>
		
	<!-- 	<table>
			<tr>
				<td>게시물번호</td><td id="bno"></td>
			</tr>
			<tr>
				<td>제목</td><td id="btitle"></td>
			</tr>
			<tr>
				<td>내용</td><td id="bcontent"></td>
			</tr>
			<tr>
				<td>작성자</td><td id="bwriter"></td>
			</tr>
			<tr>
				<td>날짜</td><td id="bdate"></td>
			</tr>
			<tr>
				<td>조회수</td><td id="bview"></td>
			</tr>
		</table> -->
			
			
		
		<table id="boardlisttable">
			<tr>
				<th>게시물번호 :</th>
				<th>제목 : </th>
				<th>내용 : </th>
				<th>작성자 : </th>
				<th>작성일 : </th>
				<th>조회수 : </th>
			</tr>
			
		</table>
	</div>
		
		
		
		
	<!-- jQUERY 라이브러리 -->
	<script src="http://code.jquery.com/jquery-latest.min.js"></script>			
	<script type="text/javascript" src="../js/member/boardlist.js"></script>		

</body>
</html>