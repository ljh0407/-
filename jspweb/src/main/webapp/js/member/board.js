
blist() // 무조건 1번 실행
/*------------------게시글 출력 -------------------------- */
let boardlist = null;
function board(){
	let info = {
		btitle : document.querySelector("#btitle").value,
		bcontent : document.querySelector("#bcontent").value,
		bwriter : document.querySelector("#bwriter").value,
		bpassword : document.querySelector("#bpassword").value
	}
		
		console.log(info)
		
		$.ajax({
			url : "http://localhost:8080/jspweb/member/board",
			data : info ,
			success : function(re){
				if( re ==
				 'true'){alert('글등록완료'); location.reload();} // 글등록완료후 현재페이지 새로고침
				else{alert('글등록실패')}
			}
		});
		
}



/*------------------- 게시글 호출------------------- */
function blist(){
	
	$.ajax({
		url : "http://localhost:8080/jspweb/member/blist",
		success : function(re){
			boardlist = JSON.parse(re) // 변환	
	let html =  '<tr>'+
			'<th>번호</th> <th>제목</th> <th>작성자</th> <th>작성일</th> <th>조회수</th>'+
				'</tr>';
		
		for(let i = 0 ; i<boardlist.length ; i++){
			let b = boardlist[i]
	html += '<tr>'+
			'<th>'+b.bno+'</th><th onclick="bview('+b.bno+')">'+b.btitle+'</th>'+
			'<th>'+b.bwriter+'</th><th>'+b.bdate+'</th><th>'+b.bview+'</th>'+
			'</tr>';
		}		
			console.log(html)
			document.querySelector("#boardtable").innerHTML = html			
					
		}
	});
}
// 상세페이지
function bview(bno){
	alert('조회수')
	document.querySelector("#row1").innerHTML = boardlist[bno-1].bno;
	document.querySelector("#row2").innerHTML = boardlist[bno-1].btitle;
	document.querySelector("#row3").innerHTML = boardlist[bno-1].bcontent;
	document.querySelector("#row4").innerHTML = boardlist[bno-1].bwriter;
	document.querySelector("#row5").innerHTML = boardlist[bno-1].bdate;
	document.querySelector("#row6").innerHTML = boardlist[bno-1].bview;
	
	// 조회수 증가
	$.ajax({
		url : "http://localhost:8080/jspweb/bview",
		data : {"bno" : bno },
		success : function(re){
			if( re == 'true'){blist() }
		}
		
	});
	
	
}

