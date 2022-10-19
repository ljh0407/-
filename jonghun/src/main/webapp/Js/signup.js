


function signup(){
   alert('버튼확인')
   
   let info = {
      mid : document.querySelector('#mid').value,
      mpw : document.querySelector('#mpw').value,
      mname : document.querySelector('#mname').value,
      mphone : document.querySelector('#mphone').value,
      memail : document.querySelector('#memail').value
   }

	
   console.log( info )
   
   $.ajax({
      url : "/jonghun/signup" ,
      type : "POST",   // 기본값 GET 
      data : info , 
      success : function(re){
		if( re === 'true'){alert('가입완료')}
		else{alert('가입실패')}
	
}
   })
   
}

function event1(){
	let mid = document.querySelector('#mid').value
	let midcheck = document.querySelector('.midcheck')
	let midt = /^[a-zA-Z]{2,20}$/ // 영대소문자 최소2글자 최대 20글자
	
	if( midt.test(mid)){
		midcheck.innerHTML = "사용가능"
	}
	else{'아이디양식이 맞지않습니다'}
}
function event2(){
	let mpw = document.querySelector('#mpw').value
	let mpwcheck = document.querySelector('.mpwcheck')
	let mpwt = /^[a-zA-Z0-9]{4,20}$/ // 영대소문자/숫자 0~9까지 최소4 최대20 글자
	if(mpwt.test(mpw)){
		mpwcheck.innerHTML = '사용가능'
	}else{'사용불가한 비밀번호입니다.'}
	
}

function event3(){
	let mphone = document.querySelector('#mphone').value
	let mphonecheck = document.querySelector('.mphonecheck')
	let mphonet = /^([0-9]{2,3})-([0-9]{3,4})-([0-9]{3,4})$/
	if(mphonet.test(mphone)){
		mphonecheck.innerHTML = '사용가능'
	}else{"양식이 맞지않습니다"}
	
}
  
function event4(){
	let memail = document.querySelector('#memail').value
	let memailcheck = document.querySelector('.memailcheck')
	let memailt = /^[a-zA-Z0-9+-_.]+@[a-zA-Z0-9-]+\.[a-zA-Z0-9-]+$/ 
	
	if(memailt.test(memail) ){
		memailcheck.innerHTML = '사용가능'
	}else{"이메일 양식이 맞지않습니다."}
	
} 
   

		
	
