alert('연동')


let col3 = document.querySelectorAll('.col3')

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

function mevent1(){
	let mid = document.querySelector('#mid').value
	let midt = /^[a-zA-Z]{2,20}$/
	
	if( midt.test(mid)){
		if( re === 'true'){col3[0].innerHTML = '사용중인아이디'}
		else{ col3[0].innerHTML = '사용가능합니다'}
	}
	else{'아이디양식이 맞지않습니다'}
}
function mevent2(){
	let mpw = document.querySelector('#mpw').value
	let mpwt = /^[a-zA-Z0-9]{8,20}$/
}
   
   



		
	
