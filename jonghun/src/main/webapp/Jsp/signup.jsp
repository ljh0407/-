<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<h3>회원가입</h3>
	<form>
			아이디 : <input type="text" name="mid" id="mid" onclick="event1()">
			비밀번호 : <input type="password" name="mpw" id="mpw" onclick="event2()">
			이름 : <input type="text" name="mname" id="mname">
			전화번호 : <input type="text" name="mphone" id="mphone">
			이메일 : <input type="text" name="memail" id="memail" onclick="event3()">
	
	</form>
		<button type="button" onclick="signup()"> 회원가입 </button>	
	
		<!-- jQUERY 라이브러리 -->
		<script src="http://code.jquery.com/jquery-latest.min.js"></script>	
	
		<script type="text/javascript" src="../Js/signup.js"></script>	
</body>
</html>