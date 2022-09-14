package java1.e클래스Ex11;

public class Ex11실행 { // 클래스
	
	public static void main(String[] args) { // 코드를 읽어주는[스레드] 포함된 함수
		
		// run메소드 호출 = 동일한 클래스에 존재
		// 1. 메소드 선언시 main함수가 해당 메소드 먼저 읽기 static 사용
		run();
		// 2. 객체 만들기 static 메소드 아닌 메소드를 호출한다.
		Ex11실행 ex11실행 = new Ex11실행();
		ex11실행.run2();
		
		
	} // main end
	
	// 1. 함수 선언 [반환x 매개변수x]
	static void run() {
		while(true) {
			System.out.println("1.회원가입 2.로그인 : ");
		}
	}
	void run2() {
		
		run3();
		
		while(true) {
			System.out.println("1.회원가입 2.로그인 : ");
		}
	}

	void run3() {
		
	}
	
	
}


/*  java파일 ---> 컴파일 ---> java파일 바이트변환
 
 	클래스 로더[클래스 읽어오기]
 	
 	jvm[ p. 166 ]
 	
 
	static : 정적
		[ 메소드영역 ]
		1. 프로그램 시작시 메모리 할당
		2. 프로그램 종료시 메모리 초기화
		* 모든 클래스에서 사용되는 [공통 메모리 ]

*/