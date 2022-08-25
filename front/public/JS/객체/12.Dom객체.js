
/* 
	왼쪽 방향키 = 37
	위쪽 방향키 = 38
	오른쪽 방향키 = 39
	아래쪽 방향키 = 40 */

/* 별의 초기 설정 */
const star = document.querySelector('h1')
star.style.position ='absolute' /* css 조작 = 포지션 : 절대위치 */

/* 별의 이동을 출력 하는 기능 */
let [ x , y ] = [ 0 , 0 ] /* 키보드 이동 값 */
const block = 20	// 이동단위
const print = () => {
	star.style.left = `${x * block}px`
	star.style.top = `${y * block}px`
}

print()

const left = 37
const up = 38
const rigth = 39
const down = 40

/* 
const [ left , up , right , down ] = [ 37 , 38 , 39 , 40 ]
*/
document.body.addEventListener('keydown', (event) => {
	// if : 논리제어 [ 경우의수가 정해져 있지 않은경우 ]
	// switch (break) : 값 제어 [ 정해진 경우의수 ]
	

	switch(event.keyCode){
		case left:
			x -= 1
			break
		case up :
			y -= 1
			break
		case rigth:
			x += 1
			break
		case down:
			y += 1
			break
	} // switch end   
	print() // x와 y변경후 함수 호출
	
})