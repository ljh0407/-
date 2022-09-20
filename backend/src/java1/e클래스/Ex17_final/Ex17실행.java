package java1.e클래스.Ex17_final;

public class Ex17실행 {

	public static void main(String[] args) {
		
		// 1. 객체 선언
			// 클래스명 객체명 = new 생성자();
		Person p2 = new Person("123456-1234567" , "홍길동");
		
		// p2.nation = "USA";	// 오류 : final 필드는 수정 불가
		// p2.ssn = "654321-987654";
		p2.name = "홍삼원";
		
		
	}
	
}
		
		
