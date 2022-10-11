<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
	<!-- 폰트어썸 아이콘 -->
	<link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.14.0/css/all.css">
	<!-- 뷰포트 -->
	<meta name="viewport" content="width=device-width , inial-scale=1.0">
	<!-- 사용자 정의 css 호출 -->
	<link rel="stylesheet" href="/jspweb/css/header.css">
</head>
<body>

	<div class="webbox"> <!-- 웹페이지 박스권 -->
		<div class="hd_top"><!-- 상단 헤더 -->
			<div><!-- 로고 -->
				<span class="hd_title"> 
					<a href="/jspweb/index.jsp">로고</a> 
				</span>
			</div>
			
			<!-- 세션 호출 [ JSP방식 = 템플릿마다 다름 ( JSP vs 리액트 ) -->
			<%
				// JSP 스크립트 태그 ( 태그안에 JAVA 문법 작성 가능 )
				String loginid = (String)session.getAttribute("mid"); 	
							// 형변환 : 세션자료형 = object// jsp 기본 객체로 세션 제공
			%>
			<ul class="hd_sub">	<!--  상단 메뉴 -->
			
			<!-- 비로그인 메뉴 // 세션이 없다     로그인 안했네...    -->
			<% if( loginid == null ){ %>
				<li> <a href="/jspweb/member/login.jsp">로그인</a> </li>
				<li> <a href="/jspweb/member/signup.jsp">회원가입</a></li>
				
			<!-- 로그인 메뉴  // 세션이 존재한다.    로그인 했다..  -->
			<%	}else{  %>
				<li> <%=loginid %>님 안녕하세요 </li>
				<li> <a href="/jspweb/member/logout.jsp"> 로그아웃 </a> </li>
			<%  }	 %>
				<!-- 공통메뉴 -->
				<li><a href="/jspweb/member/info.jsp">마이쇼핑</a> </li>		
				<li><a href="#">고객센터</a> </li>		
			</ul> <!-- 상단 메뉴 end -->
		</div>	
		<ul class="hd_menu"> <!-- 하단헤더 -->
			<li><a href="#"> 맨투맨 </a></li>
			<li><a href="#"> 니트 </a></li>
			<li><a href="#"> 가디건 </a></li>
			<li><a href="#"> 아우터 </a></li>
			<li><a href="#"> 바지 </a></li>
			<li><a href="#"> 신발 </a></li>
			<li><a href="#"> 반팔 </a></li>
			<li><a href="#"> 긴팔 </a></li>
			<li><a href="#"> 트레이닝복 </a></li>
			<li><a href="#"> 악세사리 </a></li>
			<li><a href="#"> 할인품목 </a></li>
			<li class="searchbox">
				<span>
				<input>
				<i class="fas fa-search"></i>
				</span>
				<i class="fas fa-cart-arrow-down"></i>
			</li>
		</ul>
	</div>
				
		<!-- jQUERY 라이브러리 -->
		<script src="http://code.jquery.com/jquery-latest.min.js"></script>	
			
</body>
</html>
	
		
<!--  
	<div> : 레이아웃 , 박스권 , 구역
		vs
	<span> : inline :	
-->    
