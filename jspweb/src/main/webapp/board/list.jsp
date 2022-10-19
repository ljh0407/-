<%@page import="model.dto.BoardDto"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
	<!-- 부트스트랩 css -->
	<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-Zenh87qX5JnK2Jl0vWa8Ck2rdkQ2Bzep5IDxbcnCeuOxjzrPF/et3URy9Bv1WTRi" crossorigin="anonymous">
<title>Insert title here</title>
</head>
<body>
	<%@include file="../header.jsp" %>
	
	<!--  JSP 버전 [ a태그 ] -->
	<%--
	
	 	<%
			//int bno = Integer.parseInt( request.getParameter("bno") );
			//BoardDto dto = BoardDao.getInstance().getboard(bno);
		%>
		
		
		
		<div class="webbox">
			<h3> 글 조회 </h3>
			<table>
				<tr> <td> 번호 <td> <td> <%=dto.getBno() %> </td> </tr>
				<tr> <td> 제목 <td> <td> <%=dto.getBtitle() %> </td> </tr>
				<tr> <td> 내용 <td> <td> <%=dto.getBcontent() %> </td> </tr>
				<tr> <td> 작성자 <td> <td> <%=dto.getMno() %> </td> </tr>
			</table>
		</div>
	
	 --%>
	 
	 
	 <!--  js 버전 [ ajax ] -->

	<div class="webbox">
	<a href="write.jsp"> 글쓰기 </a>
		<!-- 5.게시물 표시 개수 -->
		<div> 게시물 수 : <span class="totalsize"></span> </div>
		<!-- 6.화면에 표시할 게시물 수 -->
		<div>
			<select class="listsize" onchange="blistsize()">
				<option value="5">5</option>
				<option value="10">10</option>
				<option value="15">15</option>
				<option value="20">20</option>
			</select>
		
		</div>
		
		<table class="btable table">
		<tr><!-- 2.제목 클릭시 상세페이지 -->
			<th> 번호  </th><th>  제목  </th> <th> 작성자 </th>
			<th>  작성일  </th>  <th> 조회수 </th> 
		</tr>
				
			
		</table>
		
		<div class="pagebox"> <!-- 3.페이징처리 -->
		
		</div>
		<div> <!-- 4.검색처리 -->
			<select class="key">
				<option value="b.btitle">제목</option>
				<option value="b.content">내용</option>
				<option value="m.mid">작성자</option>
			</select>
			
			<input class="keyword" type="text" placeholder="검색어">
			<button type="button" onclick="bsearch()">검색</button>
			
		</div>
		
	</div>
	
	<!-- 부트스트랩 js -->
	<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-OERcA2EqjJCMA+/3y+gxIOqMEjwtxJY7qPCqsdltbNJuaOe923+mo//f6V8Qbsw3" crossorigin="anonymous"></script>
	<script type="text/javascript" src="../js/board/list.js"></script>

</body>
</html>

