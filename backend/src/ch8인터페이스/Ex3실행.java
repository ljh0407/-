package ch8인터페이스;

public class Ex3실행 {

	
	public static void main(String[] args) {
		
		Car myCar = new Car();
		
		myCar.run();
		
		// 구현객체 교체
		
		myCar.frontLeftTire = new Kumhotire();
		myCar.frontRightTire = new Kumhotire();
		
		
	}
}
