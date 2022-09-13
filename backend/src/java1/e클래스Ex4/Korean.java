package java1.e클래스Ex4;

public class Korean {

	// 필드
	String nation = "대한민국";
		// 클래스 내부에 미리 초기화 -> 객체 생성시 대한민국으로 초기화
	String name;
	String ssn;
	
	// 생성자
	Korean( String n , String s ){
		name = n;
		ssn = s;
	// 클래스명( 매개변수1 , 매개변수2 )
	}
	
	// 2. 매개변수가 없는 생성자
	public Korean() { }
	// 메소드
}
