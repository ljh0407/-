package java1.e클래스Ex4;

public class Ex4실행2 {

	public static void main(String[] args) {
		
		// 1. 객체 선언
		Korean k1 = new Korean("박자바", "011212-3215123");
		System.out.println(k1.name);
		System.out.println(k1.ssn);
		System.out.println(k1.nation);
		
		// 2. 빈생성자로 객체 선언
		Korean k2 = new Korean();
		k2.name = "박자바";
		k2.ssn = "011212-3215123";
		
		System.out.println(k2.name);
		System.out.println(k2.ssn);
		System.out.println(k2.nation);
	}
	
}

/*
	매개변수[인수] : 외부로부터 들어오는 변수
*/