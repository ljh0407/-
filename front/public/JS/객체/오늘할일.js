

document.addEventListener('DOMContentLoaded' , ()=>{
	// html에서 객체 가져오기
	const input = document.querySelector('#todo')	// html에서 input 가져오기
	const todoList = document.querySelector('#todo_list') // html에서 div 가져오기
	const addbutton = document.querySelector('#add_button')	// html에서 button 가져오기
	let keyCount = 0 // keyCount 0 변수선언
	const addTodo = () =>{ // 할 일 더하기 화살표함수
		
		if(input.value.trim()===''){	// input값에 공백일시
			alert('할 일을 입력해주세요.')	// 할 일을 입력해주세요 창이 뜬다
			return						// 입력
		}
		const item = document.createElement('div')// html에서 tiem에 div 요소추가하기
		const checkbox = document.createElement('input')// html에서 checkbox에  input 요소추가
		const text = document.createElement('span')// html에서 text에 span 요소추가
		const button = document.createElement('button')// html에서 button에 button 요소추가
		
		const key = keyCount // keyCount 선언 //오늘 할 일 추가하는 갯수
		keyCount += 1	// 1씩 더하기
		
		item.setAttribute('data-key' , key)
		item.appendChild(checkbox)
		item.appendChild(text)
		item.appendChild(button)
		todoList.appendChild(item) // todoList에 data-key, key, checkbox, text, button가 들어간다
		
		checkbox.type = 'checkbox' // 속성조작 체크박스로 변환
		checkbox.addEventListener('change' , (event)=>{ // 체크박스 에서 체크가 변경이 있을때 이벤트 실행
			item.style.textDecoration // 선으로 텍스트꾸미기 조작
			= event.target.checked ? 'Line-through' : '' // 글자중간에 줄그어짐
		})
		
		text.textContent = input.value // input에 입력된 값을 가져오기
		
		button.textContent = '제거하기'  // 제거하기 버튼 가져오기
		button.addEventListener('click', ()=>{// 버튼을 클릭했을때 이벤트 발생
			removeTodo(key) // 객체제거
		})
		input.value ='' //input에 입력된값 공백 
		
	}
		
	addbutton.addEventListener('click', addTodo)// addbutton 클릭시 해야할일 추가
	
	const removeTodo = (key) =>{ // 해야 할 일  갯수=key제거
	const item = document.querySelector(`[data-key="${key}"]`)// item요소에 `[data-key="${key}"]` 해야할일 목록에 갯수 - 갯수 
	todoList.removeChild(item) // 오늘 할 일에 목록 제거
	}
	

	
	input.addEventListener('keyup', (event)=>{// 키보드를 떼면 이벤트 발생
		const ENTER = 13				// 13의 keyCode 
		if(event.keyCode === ENTER){	// 만약 event.keyCode 입력후 엔터치면 
			addTodo()					// 할 일 목록추가
		}
 	})
})