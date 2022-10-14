
// 썸머노트 실행
$(document).ready(function() {
  $('#summernote').summernote(
	
  
		
		
	
	
);
  
  
});


function bwrite(){

// form 버전
	let form = document.querySelector('form') // 1. from태그 호출
	console.log(form)
	
	let formdata = new FormData( form ) // 2. 객체화된 from 정보
	
	console.log(formdata)
	
	$.ajax({ // ajax 통신 전송타입 : 문자열
		url : 'http://localhost:8080/jspweb/board/write',
		data : formdata , // ajax 기본값으로 form 전송 불가능
		// 첨부파일 전송시 : 아래 코드 추가 [ 1. post방식[get방식불가] 2. ]		
		type : 'POST' , // http 메소드 [ get(첨부파일x) vs post ]
		contentType : false , 
		// application/x-www-form-urlencoded; charset = UTF-8 : 바이트 [첨부파일 지원x]
		// vs
		// false : multipart/form-data
		processData : false , // String : 기본값 :  전송시 사용되는 타입
		// 기본값 : 전송url 데이터 명시  http://example.com?title=tit&content=cont
		// vs
		// false : http://example.com
		success : function (re){
			if( re === 'true'){ alert('글등록'); location.href="list.jsp"}
			else{ alert('글등록실패') }
		}
		
	});

/*	let inputs = document.querySelectorAll('input')
	console.log( inputs ) // inputs[0] : 헤더에 검색 입력창
	let data = {
		btitle : inputs[1].value , 	
		bcontent : inputs[2].value
	}
	console.log( data )
	$.ajax({
		url : "http://localhost:8080/jspweb/board/write" ,
		data : data ,
		success : function ( re ){
			if( re === 'true'){ alert('글등록'); location.href="list.jsp"}
			else{ alert('글등록실패') }
		 }
	}) */
}

/*
	let 객체 = { 속성명 : 데이터 , 속성명 : 데이터 ~~ }
*/