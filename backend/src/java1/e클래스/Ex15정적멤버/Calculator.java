package java1.e클래스.Ex15정적멤버;

public class Calculator {

	// 1. 필드
	double pi = 3.14159; // 인스턴스필드 		= 객체마다 메모리 할당
	static double pi2 = 3.14159; // 정적 필드 	= 메소드영역 메모리 할당
	
	int plus1(int x , int y) {	// 인스턴스 메소드
		return x + y;
	}
	
	static int plus2(int x , int y) { // 정적 메소드
		return x + y;
	}
	
	int minus1(int x , int y) {	// 인스턴스 메소드
		return x - y;
	}
	
	static int minus2(int x , int y) { // 정적 메소드
		return x - y;
	}
}
