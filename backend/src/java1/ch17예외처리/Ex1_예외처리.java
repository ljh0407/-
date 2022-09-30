package java1.ch17예외처리;

public class Ex1_예외처리 {
	
	// 필드
	// 생성자
	// 메소드
	
		// String[] args : 기본적으로 비어있는 배열
	public static void main(String[] args) {
		
		// 1. NullPointer 
	/*	String data = null;
		System.out.println(data.toString());*/
		
		
		// 2. ArrayIndexOutOfBoundsException 
		/*
		 * System.out.println(args); String data1 = args[0]; String data2 = args[1];
		 * System.out.println("data1 : "+data1); System.out.println("data2 : "+data2);
		 */
		
		
		/*
		 * int[] 정수배열 = new int[3]; for( int i = 0 ; i<정수배열.length ; i++) {
		 * System.out.println(정수배열[i]); }
		 */
		
		// 3. Number Format
			/*
			  	자료형 입력 안했을때 기본적으로 설정되는 자료형
			  	123 <--- int
			  	12.34 <--- double
			  	" " <--- String
			  	' ' <--- char
			  	int 정수 = 123 --< int에 저장되기전 123 무슨 자료형??
			 
			String data1 = "100";
			String data2 = "a100";
		 
		 	int value1 = Integer.parseInt(data1);
		 	int value2 = Integer.parseInt(data2);
		 
		 	int result = value1 + value2;
		 
		 System.out.println(data1+ "+"+data2+"="+result);
			 
			 */
		// 1. 자식 객체 선언
		Dog dog = new Dog();
		changeDog(dog);
		// 2. 자식 객체 선언
		Cat cat = new Cat();
		changeDog(cat);
		
	}	// main end
	
	public static void changeDog( Animal animal ) {
		Dog dog = (Dog) animal;
		}
	
}

/*
	스택				힙
				
	지역변수			객체
	(메소드)안에서

*/