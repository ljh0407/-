
function bwrite(){
	let info = {
		
		btitle : document.querySelector("#btitle").value,			
		bcontent : document.querySelector("#bcontent").value,			
		bwrite : document.querySelector("#bwrite").value,			
		bpassword : document.querySelector("#bpassword").value			
}
		$.ajax({
		url : "/jsptest/write" ,
		data : info ,
		type : "POST" ,
		success :  function(re){
		if( re == 'true' ){ location.href="list.html"
		}
		else{ alert('실패');}
		}
	})
}