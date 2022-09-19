package java1.e클래스.Ex14_인스턴스멤버;

public class Ex14실행 {

	public static void main(String[] args) {
		// 1. 객체선언
		// 클래스명 객체명 = new 생성자(매개변수)
		Car myCar = new Car("포르쉐");
		Car yourCar = new Car("벤츠");
		
		// 2. 객체의 (인스턴스) 멤버 호출
		myCar.run();
		yourCar.run();
		
	}
	
}
