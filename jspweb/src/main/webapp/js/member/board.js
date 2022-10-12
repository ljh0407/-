
blist() // 무조건 1번 실행
/*------------------게시글 출력 -------------------------- */
let blist = null;

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
				if( re == 'true'){
					alert('글등록완료'); location.reload(); // 글등록완료후 현재페이지 새로고침
				}else{
					alert('글등록실패')
				}
			}
		});
		
}



/*------------------- 게시글 호출------------------- */
alert('확인')
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
			'<th>'+b.bno+'</th><th onclick="bview('+b.bno+')">'+'<th>'+b.btitle+'</th>'+
			'<th>'+b.bwriter+'</th><th>'+b.bdate+'</th><th>'+b.bview+'</th>'+
			'</tr>';
		}		
			console.log(html)
			document.querySelector("#boardtable").innerHTML = html			
					
		}
	});
}
