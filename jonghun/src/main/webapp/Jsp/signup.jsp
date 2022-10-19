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
			아이디 : <input type="text" name="mid" id="mid" onkeyup="event1()" placeholder="영대/소문자/숫자"> <span class="midcheck"></span> <br>
			비밀번호 : <input type="password" name="mpw" id="mpw" onkeyup="event2()"><span class="mpwcheck"></span><br>
			이름 : <input type="text" name="mname" id="mname"><br>
			전화번호 : <input type="text" name="mphone" id="mphone" onkeyup="event3()"><span class="mphonecheck"></span><br>
			이메일 : <input type="text" name="memail" id="memail" onkeyup="event4()"><span class="memailcheck"></span><br>
	
	</form>
		<button type="button" onclick="signup()"> 회원가입 </button>	
	
		<!-- jQUERY 라이브러리 -->
		<script src="http://code.jquery.com/jquery-latest.min.js"></script>	
	
		<script type="text/javascript" src="../Js/signup.js"></script>	
</body>
</html>