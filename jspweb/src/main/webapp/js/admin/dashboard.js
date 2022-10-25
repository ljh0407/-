

// 1. 해당 사이드바 태그 호출
let sidebar = document.querySelector('.sidebar')
let mainbox = document.querySelector('#mainbox')

// 2. 해당 사이드바 태그를 클릭했을때 이벤트
sidebar.addEventListener( 'click' , function() {
	sidebar.style.left = 0 ;
})

// 3. 본문 div를 클릭했을때 
mainbox.addEventListener('click' , function(){
	sidebar.style.left = '-170px';
})

//////////// 본문 전환 이벤트 ////////////////
function pagechage( page ){
	// 특정 태그에 해당 파일 로드 [jquery]
	$('#mainbox').load( page )
	
}