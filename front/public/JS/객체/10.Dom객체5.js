/**
 * 
 */
 
 let counter = 0 // 클릭수를 저장하는 변수
 let isconnect = false // 연결 상태 저장하는 변수
 const h1 = document.querySelector('h1') // 요소 가져오기
 const p = document.querySelector('p') // 요소 가져오기
 const connectBtn = document.querySelector('#connect') // 요소 가져오기
 const disconnectBtn = document.querySelector('#disconnect') // 요소 가져오기
 const upbtn = document.querySelector('#upbtn')
 const dawnbtn = document.querySelector('#dawnbtn')
 //출력하는 함수
 const listener = () => { h1.textContent = `출력횟수 : ${++counter}`}
 
 // 1. 연결 버튼을 클릭했을때
 connectBtn.addEventListener( 'click' , ()=> {
	if( isconnect == false){ // 만약에 연결이 안되어 있으면
		h1.addEventListener('click' , listener )// h1태그에 클릭 이벤트 주기
		p.textContent = '이벤트 연결 상태 : 연결' // p 태그에 내용 넣기
		isconnect = true // 연결 했다는 의미로 연결상태 변수에 true 로 변환
		
	}
})
 
upbtn.addEventListener( 'click' , () => {
	if( isconnect == true ){
		counter++
		h1.textContent = `출력횟수 : ${counter}` 
	}
})	
dawnbtn.addEventListener('click' , ()=> {
	if( isconnect == true ){
		counter--
		h1.textContent = `출력횟수 : ${counter}` 
	}
})
 
 	
 	
// 2. 연결해제 버튼을 클릭했을때
disconnectBtn.addEventListener( 'click', () => {
	if(isconnect == true){ // 만약에 연결이 되어 있으면
	   h1.removeEventListener('click' , listener) // h1태그에 클릭 이벤트 삭제
	   p.textContent = '이벤트 연결 상태 : 해제'
	   isconnect = false // 해제 했다는 의미로 연결상태 변수에 false 로 변환
	}
})


 // 객체명.addEventListener('이벤트명' , 클릭함수 )
 	// 해당 객체의 이벤트 발생했을때 콜백함수 실행 된다~
//// 1.
// h1.addEventListener('click' , (event) => {
//	counter++  // 변수에 1증가
//	h1.textContent =`클릭횟수 : ${counter}`
//}) // 이벤트 함수 end
//	
//// 2. html 에서 클릭이벤트 속성 이용한다.
//function 함수(){
//	counter ++ // 변수에 1증가
//	h1.textContent =`클릭횟수 : ${counter}`
//}