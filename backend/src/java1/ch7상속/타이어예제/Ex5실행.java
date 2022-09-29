package java1.ch7상속.타이어예제;

public class Ex5실행 {

	public static void main(String[] args) {
		
	// 1. 자동차 생성
	Car car = new Car(); 
		// tire 객체가 4개
	// 2. 자동차 5번 회전
	for(int i = 1 ; i <= 5; i++) {
	boolean[] result = car.run();
	
	// 3. 만약에 펑크이면 타이어 교체
	if(!result[0]) {// 앞 왼쪽
		car.frontLetfTire = new HankookTire(15 , "앞왼쪽");
	}
	if(!result[1]) {// 앞오른쪽
		car.frontRightTire = new HankookTire(13 , "앞오른쪽");
	}
	if(!result[2]) {// 뒤 왼쪽
		car.backLeftTire = new KumhoTire(14 , "뒤왼쪽");
	}
	if(!result[3]) {// 뒤 오른쪽
		car.backRightTire = new KumhoTire(17 , "뒤오른쪽");
	} 
	}// for end
	
		
		
	}
		
	
	}

