
/* 
	자바 메모리 저장하는 방법
	1. 변수 : 메모리 1개 저장할수 있는 공간 [ 수정 가능 ] let
	2. 상수 : 메모리 1개 저장할수 있는 공간 [ 수정 불가능 ] const
	3. 배열 : 메모리 여러개 저장 할 수 있는 공간 [ 저장 순서 = 인덱스 ] 배열 = 객체		반복문 활용
	4. 객체 : 여러개 메모리들을 하나의 메모리에서 관리
		DOM 객체 => 미리 만들어진 객체들
			1. 이벤트
				1. DOMContenetLoaded 이벤트 : html 모두 호출된 후 실행되는 이벤트
					// 미 사용시 [ js파일은 body 가장 하단 배치 ]
				2. click : 해당 문서객체를 클릭했을때 발생하는 이벤트
				3. change : 해당 문서객체를 변경되었을때 발생하는 이벤트		[ 모든 입력후 커서 변경이 있을때 이벤트 발생 ]
				4. keyup : 해당 문서객체에서 키보드를 눌렀을때 발생하는 이벤트 [ 입력하면서 계속적인 이벤트 발생 ]
				5. contextmunu	
			2. 메소드
				1.let 객체명 = document.querySelector('식별자')
				2.let 객체명[배열] = document.querySelectorALL('식별자')
					0.값 조작하기
						1. [호출]객체명.value 		[저장]객체명.value = 값	  	// input , textarea , select
						2. [호출]객체명.checked		[저장]					// checkbox , option 
						3. [호출]객체명.options	  객체명.options.selectedIndex// select
					1.글자 조작하기
						1. [호출]객체명.textContent		[저장]객체명.textContent = 값	// div , p , span
						2. [호출]객체명.innerHTML		[저장]객체명.innerHTML = 값
					2.속성 조작하기
						1. 객체명.setAttribute( 속성이름 , 값 ) --> 객체명.속성명 = 값
						2. 객체명.setAttribute( 속성이름 )	
					3.스타일 조작하기
						1. 객체명.style.css속성명 = 값
					4.문서 객체 생성/제거
						1. [생성] 객체명 = document.createElement('태그명')
						2. [html삽입] 상위태그객체.appendChild( 하위문서객체 )
						3. [삭제] 상위문서객체.removeChild( 하위문서객체 )
						4. [ 상위문서 객체찾기 ] 문서객체.parentNode
					
					* 문서객체에 이벤트 추가
						객체명.addEbentListener( '이벤트' , 함수명 )
						객체명.addEbentListener( '이벤트' , ( )=>{ })
						객체명.removeEbentListener( '이벤트' , 함수명 )
 					
*/				
/* 5명 이름과 나이 저장 */
let 학생1_이름 = '유재석'
let 학생1_나이 = 30
let 학생2_이름 = '강호동'
let 학생2_나이 = 40
let 학생3_이름 = '하하'
let 학생3_나이 = 20
let 학생4_이름 = '서장훈'
let 학생4_나이 = 70
let 학생5_이름 = '김희철'
let 학생5_나이 = 10
/* 5명 이름과 나이 저장 배열 */
let 학생목록 = [ ['유재석,30','안산',010-0000-1111],['강호동,40'],['하하,20'],['서장훈,70'],['김희철,10']]
/* 5명 이름과 나이 저장 객체 */
let 학생 = {
	이름 : '~~~',
	나이 : '~~~',
}
let 학생목록 = [ 학생객체, 학생객체, 학생객체, 학생객체, 학생객체 ]
/* 5명 이름과 나이 저장 객체 */