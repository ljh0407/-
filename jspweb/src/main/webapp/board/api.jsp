<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<%@include file="../header.jsp"%>

	<div class="container"> <!-- b:container -->
	
	<!-- 3. 9월 전국 아파트 실거래가 테이블 -->
	<table class="table apitable1">
		<tr>
			<th> 시군구 </th>
			<th> 번지본번부번 </th>
			<th> 단지명 </th>
			<th> 전용면적 </th>
			<th> 계약년월 </th>
			<th> 계약일 </th>
			<th> 계약금액 </th>
			<th> 층 </th>
			<th> 건축년도 </th>
			<th> 도로명 </th>
			<th> 해제사유발생일 </th>
			<th> 거래유형 </th>
			<th> 중개사소재지 </th>
		</tr>
	</table>
	
	
	<!-- 1. 지도를 표시할 div 입니다 -->
	<div id="map" style="width:100%;height:350px;"></div>
	
	<!-- 2. 약국 상세 정보 div 입니다. -->
		<div class="datailbox">
		
		</div>
		<div class="row">
			<div class="col-sm-3">
				<input type="text" class="form-control addrinput">
			</div>
			<div class="col-sm-1">
				<button type="button" class="btn" onclick="addrsearch()">검색</button>
			</div>
		</div>
		<table class="table apitable2"> <!-- b:tabal -->
			<tr><th> 약국명 </th> <th> 전화번호 </th> <th> 주소 </th></tr>
		</table>
	</div>
	
	<!-- 카카오맵 API -->
	<!-- 카카오 좌표로 주소표시 -->
	<script type="text/javascript" src="//dapi.kakao.com/v2/maps/sdk.js?appkey=fe728feb3f77839b34281eac8d94edc0&libraries=services"></script>
	<script type="text/javascript" src="../js/board/api.js"></script>


</body>
</html>