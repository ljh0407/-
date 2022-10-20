<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

		<form>
		
			제목 : <input type="text" id="btitle">
			내용 : <input type="text" id="bcontetn">
			작성자 : <input type="text" id=bwrite>
			비밀번호 : <input type="password" id="bpassword">
			<button type="button" onclick="write()">글쓰기</button>
		</form>

		
		<!-- jQUERY 라이브러리 -->
		<script src="http://code.jquery.com/jquery-latest.min.js"></script>	
		<script src="signup.js"> type="text/javascript"></script>
</body>
</html>