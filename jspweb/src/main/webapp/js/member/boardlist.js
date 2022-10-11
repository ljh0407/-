

/*------------------게시글 호출 -------------------------- */
alert("확인")
getboard();
function getboard(){
	$.ajax({
		url : "http://localhost:8080/jspweb/member/board.jsp",
		success : function( result ){
			alert("확인")
		let member = JSON.parse(result)
		document.querySelector("#bno").innerHTML = member.bno			
		document.querySelector("#btitle").innerHTML = member.btitle			
		document.querySelector("#bcontent").innerHTML = member.bcontent			
		document.querySelector("#bwriter").innerHTML = member.bwriter			
		document.querySelector("#bdate").innerHTML = member.bdate			
		document.querySelector("#bview").innerHTML = member.bview
		getboardlist(); 			
		}
		
	});
}



/*-------------------모든 게시글 호출------------------- */


alert(1)
function boardlist(){
	$.ajax({
		url:"http://localhost:8080/jspweb/boardlist",
		success : function(result){
			let boardlist = JSON.parse(result)
			console.log(boardlist)
			// tag 가져오기
			let table = document.querySelector("#boardlisttable")
			alert(table)
			// 2. table 에 넣을 html 문자열
			let tag = '<tr>'+
					'<td>게시물번호 :</td>'+
					'<td>제목 : </td>'+
					'<td>내용 : </td>'+
					'<td>작성자 : </td>'+
					'<td>비밀번호 : </td>'+
					'<td>작성일 : </td>'+
					'<td>조회수 : </td>'+
					'</tr>';
			// tag에 값 넣기
			for(let i = 0 ; i < boardlist.length ; i++){
				let b = boardlist[i]
			// 해당 객체의 정보를 tag변수 누적 더하기 html 출력	
			
			tag += '<tr>'+
				'<td>'+b.bno+'</td>'+	
				'<td>'+b.btitle+'</td>'+	
				'<td>'+b.bcontent+'</td>'+	
				'<td>'+b.bwriter+'</td>'+	
				'<td>'+b.bpassword+'</td>'+	
				'<td>'+b.bdate+'</td>'+	
				'<td>'+b.bview+'</td>'+	
				'</tr>';
			}		
			table.innerHTML = tag		
					
		}
		
		
	})
}