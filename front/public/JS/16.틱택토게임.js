/*
	틱택토 ( 삼목 )
		1. 게임판 구현
		2. 버튼 눌림 기능
		3. 사용자(선택) vs 컴퓨터(랜덤)
		4. 승리자 판단
		
	함수 
		function 함수명 ( 매개변수 , 매개변수2) {코드}
*/
게임판그리기()
// 1. 게임판 출력하는 함수
function 게임판그리기(){ //함수실행
	// function 함수 만들기 키워드
	let 게임판 = ''  // 여러개 버튼(태그)을 저장하는 변수
	for( let i = 0 ; i<9 ; i++){ // i는 0 부터 8까지 1씩 증가반복
		게임판 += `<button id=${i} onclick=버튼선택(${i})>${i}</button>`
		// 게임판 변수에 버튼(tag) 누적 더하기
		if( i % 3 == 2 ){ 게임판 += '<br>'}
		// 2 5 8 일때 줄바꿈
	}
	// 문서(html)의 id가 gameboard 의
	document.getElementById('gameboard').innerHTML = 게임판
}
// 2. 위치 선택 함수
function 버튼선택( i ){ 
	alert('버튼눌림')
	// 사용자 선택한 버튼의 id의 html -> o 변경
	document.getElementById(i).innerHTML = 'O'
	// [컴퓨터]난수 발생
		// math 		// math : 수학 관련 메소드 제공하는 클래스
		// random( ) 	// math.random() : 0~1 사이의 난수 발생
	math.random() * 9   // math.random() * 끝번호 -1
						// (math.random() * 9) + 1 : 1~10사이의 난수발생
	let rand = math.floor( math.random() ) * 9
		//  math.floor()  // 내림 math.round() 반올림  math.ceil()올림
	alert('난수 :' + rend ) 
	document.getElementById( rand ).innerHTML = 'x'
	}
// 3. 게임 상태(상황) 함수
function 상황출력(){}
// 4. 게임 결과 함수
function 게임결과(){}