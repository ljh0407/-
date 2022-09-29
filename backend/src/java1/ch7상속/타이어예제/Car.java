package java1.ch7상속.타이어예제;



public class Car {

	// 1. 필드 [ 변수 , 객체 , 상수 , 배열 , 리스트 = 메모리 ] = 저장소
	Tire frontLetfTire = new Tire(6 ,"앞왼쪽");
	Tire frontRightTire = new Tire(2 , "앞오른쪽");
	Tire backLeftTire = new Tire(3 , "뒤왼쪽");
	Tire backRightTire = new Tire(4 , "뒤오른쪽");
	
	
	
	// 3. 메소드
	boolean[] run() {
		System.out.println("[자동차가 달립니다.]");
		boolean[] tirestate = new boolean[4];
		tirestate[0] = frontLetfTire.roll();
		tirestate[1] = frontRightTire.roll();
		tirestate[2] = backLeftTire.roll();
		tirestate[3] = backRightTire.roll();
		for(boolean b : tirestate) {
			if( b == false) {stop(); break;}
		}
		return tirestate;
	}
	void stop() {System.out.println("[자동차가 멈춥니다.]");}
}
