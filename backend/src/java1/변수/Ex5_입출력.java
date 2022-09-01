package java1.변수;

public class Ex5_입출력 { // class s

	public static void main(String[] args) { // main s
		
		// p. 90 : print format : 출력 형식[서식=모양]
		int 변수 = 123;
		System.out.println( 변수 + "원");
		System.out.printf("%d원\n" , 변수 );
		
		int value = 123;
		System.out.printf("상품의 가격:%d원\n" , value );
		System.out.printf("상품의 가격:%6d원\n" , value );
		System.out.printf("상품의 가격:%-6d원\n" , value);
		System.out.printf("상품의 가격:%06d원\n", value);
		
		double area = 3.14159 * 10 * 10 ; // 실수
		System.out.printf("반지름이 %d인 원의 넓이 : %10.2f\n" , 10 , area);
		
		String name = "홍길동";
		String job = "도적";
		System.out.printf("%6d | %-10s | %10s\n" , 1 , name , job);
		
		
		
	} // main e
	
} // class e

/*
 	형식문자
 		1. %d : 정수
 			%숫자d 	: 오른쪽부터 숫자만큼 자리 차지 [ 만약에 숫자가 없을경우 공백 채움 ]
 			%0숫자d 	: 오른쪽부터 숫자만큼 자리 차지 [ 만약에 숫자가 없을경우 0으로 채움 ]
 			%-숫자d	: 왼쪽부터 ~~~
    
 		2. %f : 실수
    		%자리수.소수자리f
    			%10.2ㄹ : 10자리의 자리 차지, 소수점 2자리 표시
  */
