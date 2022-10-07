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
	<div class="webbox">
		<h3> 회원가입 페이지 </h3>
		<form action="/jspweb/member/signup" method="POST"> 
		<!-- 폼태그 : 전송기능 	action="url경로" method="전송방식" -->
		아이디 : 		<input type="text" name="mid">				<br>
		비밀번호 : 	<input type="text" name="mpassword">		<br>
		비밀번호확인 : 	<input type="text" name="mpasswordfirm">	<br>
		이름 : 		<input type="text" name="mname">			<br>
		전화번호 : 	<input type="text" name="mphone">			<br>
		이메일 : 		<input type="text" name="memail">			<br>
		
		
		<!-- 카카오 우편 API :  -->
		<input type="text" id="sample4_postcode" placeholder="우편번호" name="maddress1">
		<input type="button" onclick="sample4_execDaumPostcode()" value="우편번호 찾기"><br>
		<input type="text" id="sample4_roadAddress" placeholder="도로명주소" name="maddress2">
		<input type="text" id="sample4_jibunAddress" placeholder="지번주소" name="maddress3">
		<span id="guide" style="color:#999;display:none"></span>
		<input type="text" id="sample4_detailAddress" placeholder="상세주소" name="maddress4">
		
		<input type="submit" value="회원가입">
		</form>
	</div>
	<script src="//t1.daumcdn.net/mapjsapi/bundle/postcode/prod/postcode.v2.js"></script>
	<script type="text/javascript" src="../js/member/signup.js"></script>
</body>
</html>

<!-- 
	태그 식별자 : id , class , name			[ request 객체가 name 이름의 요청변수 ] 
	 <h3> : 제목 태그 ( h1~6 : 텍스트굵기 ) 
	<input> : 입력태그
		속성 
			1. type
				1. text : 문자열입력
				2. password : 가려진 텍스트
				3. submit : 폼전송
			2. name : 태그의 식별 이름
			
	<from> : 폼(양식) 	전송기능	
		속성
			1. action="전송을 받을 URL"
			2. method= 전송방식 
						get -> 서블릿(java) doget메소드
						post -> 서블릿(java) dopost메소드
				HTTP 전송 메소드
				
				GET			VS 			POST	
				변수URL표시				변수URL 표시X
				보안 낮음					보안 높음 [ 회원가입 , 로그인 ]
				캐시(기록) 남음				캐시(기록) 없음
				다음접속시 속도빠름			다음접속시 속도 동일
				[ 상세페이지 ]				[ 회원가입 , 로그인 ]
				
-->