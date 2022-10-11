
/* ---------------- 회원정보 호출 -------------- */
	//alert("확인")
getmember();
function getmember(){
$.ajax({
	
	url : "http://localhost:8080/jspweb/info" , 
 	success : function( result ) {
	//alert("확인")
		// HTTP 스트림( 바이트단위 ) json형식의 문자열 타입을 JSON 타입으로 형변환 
		let member = JSON.parse( result )
		document.querySelector("#mno").innerHTML = member.mno
		document.querySelector("#mid").innerHTML = member.mid
		document.querySelector("#mname").innerHTML = member.mname
		document.querySelector("#mphone").innerHTML = member.mphone
		document.querySelector("#memail").innerHTML = member.memail
		document.querySelector("#maddress").innerHTML = member.maddress
		document.querySelector("#mdate").innerHTML = member.mdate
		document.querySelector("#mpoint").innerHTML = member.mpoint
		getmemberlist(); // 모든 회원 함수 호출
	}
});
}
/* ---------------- 모든 회원 호출 -------------- */
function getmemberlist(){
$.ajax({
	url : "http://localhost:8080/jspweb/member/infolist",
	success : function( result ){
		let memberlist = JSON.parse( result )
		console.log( memberlist  )
		
		// 1. tag 가져오기
		let table = document.querySelector("#memberlisttable")
		alert(table)
		// 2. table 에 넣을 html 문자열
		let tag = '<tr>'+
				'<td>번호</td>'+
				'<td>아이디</td>'+
				'<td>이름</td>'+
				'<td>전화번호</td>'+
				'<td>이메일</td>'+
				'<td>주소</td>'+
				'<td>가입일</td>'+
				'<td>포인트</td>'+
				'</tr>';
		// 3. tag 값 넣기
		for(let i = 0 ; i< memberlist.length ; i++){
			// 4. 해당 인덱스의 객체호출
			let m = memberlist[i]
			// 5. 해당 객체의 정보를 tag변수 누적 더하기 [html 출력]
			tag += '<tr>'+
				'<td>'+m.mno+'</td>'+
				'<td>'+m.mid+'</td>'+
				'<td>'+m.mname+'</td>'+
				'<td>'+m.mphone+'</td>'+
				'<td>'+m.memail+'</td>'+
				'<td>'+m.maddress+'</td>'+
				'<td>'+m.mdate+'</td>'+
				'<td>'+m.mpoint+'</td>'+
				'</tr>';  
		}
		// 6. html 문자열을 table에 넣어주기
		table.innerHTML = tag
	}
	
})
}

/*-----------------------회원탈퇴-------------------- */
alert(1);
function viewdelete(){
	// 1. tag 가져온다
	alert(2);
	let deletebox = document.querySelector("#deletebox")
	// 2. tag에 넣을 html 구성
	let tag = 
			'<span> ! 정말 탈퇴 하시겠습니까? </span>'+
			'<input type="password" id="mpassword">'+
			'<button onclick="mdelete()">확인</button>';
			alert(3);
	// 3. tag에 html 넣기
	deletebox.innerHTML = tag
	alert(4);
}

function mdelete(){
	// 1. tag 입력된 비밀번호 가져온다.
	let mpassword = document.querySelector("#mpassword").value
	alert(5);
	// 2. ajax를 이용한 회원탈퇴 처리
	$.ajax({
		url : "http://localhost:8080/jspweb/delete",
		data : { "mpassword" : mpassword },
		success : function(result){
			alert(result)
			if(result === 'true'){
				alert('탈퇴성공');
				location.href = '/jspweb/member/logout.jsp'
			}else{ alert('동일하지 않는 비밀번호 입니다.') }
			}
	})
	
}
/*
	선언 : let 객체명 = { 속성명 : 값 , 속성명 : 값 , 속성명 : 값 }
	호출 : 객체명.속성명
	안되면 alert 써서 어디가 오류났는지 꼭 확인하기!!
*/