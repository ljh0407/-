<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
	<link href="/jspweb/css/productview.css" rel="stylesheet">
<title>Insert title here</title>
</head>
<body>

	<%@include file="../header.jsp" %>
	
	<% 
		// 자바를 작성할수 있는 태그[서블릿] 
		// 1. 경로에 있는 pno request 요청
		// 2. 만약에 요청변수가 없을경우
	//	if(request.getParameter("pno") == null){response.sendRedirect("/jspweb/index.jsp");}
	//	int pno = Integer.parseInt(request.getParameter("pno"));
	%>
	
	
	<div class="container"> <!-- B: container -->
		<div class="row">
			<!-- 대표 이미지 -->	
			<div class="col-md-6">
				<img alt="" src="/jspweb/img/img1.gif">
			</div> <!-- b : col-md-6 -->
			<!-- 상품 정보 -->
			<div class="col-md-6">
				<div class="infobox"><!-- 상품명 -->
					<h4 class="pname"> 미라클 라이트 경량 퀄팅 점퍼 </h4>
				<!-- 제품 설명 -->
				<div class="pcomment">
					일반적인 긴팔 티셔츠와는 달리 튼튼함이 느껴지는
					소재들을 사용하고 있어, 높은 내구성을 자랑하고 있는 제품입니다.
				</div>
				<!-- 가격 -->
				<div class="pricebox"> 		<!-- 할인율이 있을경우 -->
					<span class="pdiscount">30%</span>		<!-- 할인율 -->
					<span class="pprice">20,000원</span>	<!-- 원가 -->
					<span class="psale">16,000원</span>	<!-- 할인이 적용된 가격 -->
				</div>
				<!-- <div class="pricebox"> 		할인율이 없을경우
					<span>30,000원</span>	원가
				</div> -->
				<!-- 사이즈 종류 -->
				<div class="sizebox"> 
					<span> [FREE , XL , L , M , S ]</span>
				</div>
				<!-- 제품 옵션 -->
				<table class="table into_t" > 		<!-- b : table -->
					<tr><td>배송구분</td> <td>2,500원 (10만원이상 구매시 무료)</td> </tr>
					<tr><td>카드혜택</td> <td>무이자할부</td> </tr>
					<tr><td>적립혜택</td> <td>3000(1%)</td> </tr>
					<tr>
						<td>색상</td>  
						<td>
							<select>
								<option>-[필수] 색상 선택 </option>
								<option> 블랙 </option>
								<option> 화이트 </option>
								<option> 그레이 </option>
							</select>
						
						</td> 
					</tr>
					<!-- 사이즈 선택 행 -->
					<tr>
						<td>사이즈</td> 
						<td>
							<select class="form-select"> <!-- b: -->
								<option>-[필수] 사이즈 선택</option>
								<option> FREE </option>
								<option> XL </option>
								<option> L </option>
							</select>
						</td>
					</tr>
				</table>
				
				<!-- 선택된 제품 목록 -->
				<table class="table select_t">
					<tr> 
						<th width="60%">상품명/옵션</th> 
						<th width="25%">수량</th> 
						<th width="15%">가격</th> 
					</tr>
					<tr>  <!-- 아이템구역 -->
						<td> <!-- 선택된 옵션 정보 -->
							<span>미라클 라이트 경량 퀄팅 점퍼</span>
							<br>
							<span> -블랙 / FREE </span>
						</td>
						<td> <!-- 옵션 수량 구역 -->
								<div class="row g-0"> <!-- B : g-0 하위태그내 모든 여백 제거 -->
									<div class="col-md-6"> <!-- 수량구역 -->
										<input class="form-control" value="1">
									</div>
									<div class="col-md-4"><!-- 수량 버튼 구역 -->
										<button class="amount_btn">▲</button>
										<button class="amount_btn">▼</button>
									</div>
									<div class="col-md-1">
										<button class="cancel_btn">X</button>
									</div>
								</div>
						</td>
						<td>
							<span>20,000원</span>
							<span class="pointbox">(포인트)2000</span>
						</td>
					</tr>
				</table>
				
				<!-- 선택된 제품들의 총 가격 -->
				<div class="row">
					<div class="col-md-6">총 상품금액</div>
					<div class="col-md-6 totalprice"> 40,000원 </div>
				</div>
				<!-- 버튼목록 -->
				<div class="btnbox">
					<button id="btn1">바로구매</button>
					<button id="btn2">장바구니 담기</button>
					<button id="btn3">찜하기 ♡</button> <!-- 로그인 회원이 찜하기를 안한 제품 -->
				</div>
			</div>
		</div> <!-- b : col-md-6 -->
	</div>
</div>
					
				
				

</body>
</html>
			
		