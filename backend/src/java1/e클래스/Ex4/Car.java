package java1.e클래스.Ex4;

public class Car {

	// 클래스멤버
	// 1. 필드
	String color;
	int cc;
	// 2. 생성자
		// 1. 생성자 생략시 기본생성자 자동 추가
		// 2. 생성자 정의
			// 클래스명( 매개변수~~ ) { }
			// *클래스명과 동일 / 다르면 메소드 취급
		// 3. 생성자 목적
			// 1. 객체 선언과 동시에 필드에 값 대입
	// 1. 매개변수가 있는 생성자 
	Car( String color , int cc ){
		this.color = color;
		this.cc = cc;
	}
		
	// 2. 매개변수가 없는 생성자 [ 빈생성자 ]	
	Car(){}	
	// 3. 메소드
	
		
}
