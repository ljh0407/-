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
	<table>
		<tr>
			<td class="col1" > 아이디 * </td>	<!-- name:form에서 사용 , id:js에서 사용  -->
			<td class="col2"> <input type="text" 		name="mid" 				id="mid" 				onkeyup="mevent1()"> </td>
			<td class="col3"></td>
		</tr>
		<tr>
			<td class="col1" > 비밀번호 * </td>	<!-- name:form에서 사용 , id:js에서 사용  -->
			<td class="col2"> <input type="password" 		name="mpw" 				id="mpw" 			onkeyup="mevent2()"> </td>
			<td class="col3"></td>
		</tr>
		<tr>
			<td class="col1" > 이름  </td>	<!-- name:form에서 사용 , id:js에서 사용  -->
			<td class="col2"> <input type="text" 		name="mid" 				id="mid" 				onkeyup="mevent3()"> </td>
			<td class="col3"></td>
		</tr>
		<tr>
			<td class="col1" > 전화번호  </td>	<!-- name:form에서 사용 , id:js에서 사용  -->
			<td class="col2"> <input type="text" 		name="mid" 				id="mid" 				onkeyup="mevent4()"> </td>
			<td class="col3"></td>
		</tr>
		<tr>
			<td class="col1" > 이메일 </td>	<!-- name:form에서 사용 , id:js에서 사용  -->
			<td class="col2"> <input type="text" 		name="mid" 				id="mid" 				onkeyup="mevent5()"> </td>
			<td class="col3"></td>
		</tr>
	</table>
		<button type="button" onclick="signup()"> 회원가입 </button>	
	
		<!-- jQUERY 라이브러리 -->
		<script src="http://code.jquery.com/jquery-latest.min.js"></script>	
	
		<script type="text/javascript" src="../Js/signup.js"></script>	
</body>
</html>