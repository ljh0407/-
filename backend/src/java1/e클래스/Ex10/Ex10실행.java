package java1.e클래스.Ex10;

public class Ex10실행 {

	public static void main(String[] args) {
		
		// 1. 객체 선언
		Car myCar = new Car();
		
		// 2. 객체에 메소드 호출 
		myCar.setGas(5); // 매개변수 5  / 반환 x
		
		// 3. 객체에 메소드 호출
		boolean gasstate = myCar.isLeftGas();
			// 매개변수 x / 반환 boolean
		
			// gasState = true
		
		if( gasstate ) {
			System.out.println("출발합니다.");
			myCar.run(); // 매개변수x  /반환x
		}
				// gas = 0
		
		// 4. 
		if( myCar.isLeftGas() ) {
			System.out.println("gas를 주입할 필요가 있습니다.");
		}else {
			System.out.println("gas를 주입하세요.");
		}
	}
	
}
