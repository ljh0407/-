/**
 * 
 */
 
 // p. 257 : 배열도 객체이다
 const a = [ ] // 1. 배열 선언
 console.log( a )
 a.sample = 10 // 2. 배열에 속성 추가
 console.log( a.sample )
 
 // 함수도 객체이다.
 function b(){}	// 1. 함수 선언
 b.sample = 10	// 2. 함수에 속성 추가
 console.log( b.sample )
 
 // 기본자료형 [ 숫자형은 객체가 아니다. ]
 const c = 273	// 1. 상수 선언
 c.sample = 10	// 2. 상수에 속성 추가
 console.log( c.sample )
 
 // 기본자료형
 const d = '안녕하세요'  // 1. 상수(문자열) 선언
c.sample = 10 	 	 // 2. 상수에 속성

// p.277 : 수학함수 : math 객체
	// math.random() : 0<= 결과 < 1
	// math.random()*10 : 0<= 결과 < 10
	// math.random()*10 : 0<= 결과 < 50
	// math.random()*10 - 5 : -5<= 결과 < 5
	// math.random()*50 - 25 : 25<= 결과 < 25
	// 결과물 ---> 실수(소수점) ---> 정수 만들기 : Math.floor(실수)
const num = Math.random() 

console.log('0-1 사이의 랜덤한 숫자 : ' , num )
console.log('0~10 사이의 랜덤한 숫자 : ', num*10 )
console.log('0~50 사이의 랜덤한 숫자 : ', num*50 )

console.log('-5 ~ 5 사이의 랜덤한 숫자 : ', num*10-5 )
console.log('-25 ~ 25 사이의 랜덤한 숫자 : ', num*50-25 )
