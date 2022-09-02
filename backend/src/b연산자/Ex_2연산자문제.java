package b연산자;

import java.util.Scanner;

public class Ex_2연산자문제 { // class s

	public static void main(String[] args) {	// main s
		/*
		문제1 : 급여 계산 
			[조건] 입력받기 : 기본급 , 수당 
			[출력] 실수령액 = 기본급 + 수당 - 세금[기본급10%]
	 */
		Scanner scanner = new Scanner(System.in);
	/*	System.out.println("기본급: "); int 기본급 = scanner.nextInt();
		System.out.println("수당: "); int 수당 = scanner.nextInt();
		int 실수령액 = 기본급 + 수당 - (int)(기본급*0.1);
								// 강제 형 변환 : double - >
		System.out.println("결과 : "+ 실수령액); */
	/*
	 	문제2 : 지폐 개수 세기 
	 		[조건] 십만원 단위의 금액을 입력받기 
	 		[출력] 입력받은 금액의 지폐수 출력 
	 		[예시]  356789
	 			십만원 : 3장 
				만원 : 5장 
				천원 : 6장
	 */
		
	/*
	 * // 변수 선언하고 자료형 선택 System.out.println("금액 : "); int 금액; 금액 =
	 * scanner.nextInt(); // 입력받은 데이터를 정수형으로 가져와서 변수에 대입 // 1. 십만원 계산
	 * System.out.println("십만원 : " + (금액/100000)+"장"); 금액 -= (금액/100000) * 100000;
	 * // 십만원 단위 제거 System.out.println("만원 : " + (금액/10000)+"장"); 금액 -= (금액/10000) *
	 * 10000; // 만원 단위 제거 System.out.println("천원 : " + (금액/1000)+"장"); 금액 -=
	 * (금액/1000) * 1000;
	 */
	     
		
		
	/*
	 	문제3 : 하나의 정수를 입력받아 7의 배수 이면 '맞다' 아니면 '아니다' [ if x ]
	 */
	 	
	/*
	 * int 문제3 = scanner.nextInt(); // scanner.nextInt(): 입력된 데이터를 int형으로 가져오기
	 * String 결과3 = 문제3 % 7 == 0 ? "7배수" : "7배수 아니다." ; // 삼항연산자 = 조건 ? 참 : 거짓
	 * System.out.println("결과3 : " + 결과3 );
	 */
																	
		
		
		
		/*
		문제4 : 하나의 정수를 입력받아 홀수이면 이면 '홀수' 아니면 '짝수' [ if x ]
		
		
		System.out.println("문제4) 정수 입력: "); int 문제4 = scanner.nextInt();
		String 결과4 = 문제4 % 2 == 1 ? "홀수" : "짝수";
		System.out.println("결과4) : " + 결과4);
													*/
		
	/*
	 	문제5 : 하나의 정수를 입력받아 7의 배수 이면서 짝수 이면 '참' 아니면 '거짓'
	 	
	 	System.out.print("문제5) 정수 입력 : "); int 문제5 = scanner.nextInt();
	 	String 결과5 = (문제5 % 7 == 0 && 문제5 % 2 == 0 ) ? "참" : "거짓";
	 	System.out.println("결과5) " + 결과5);
	 										*/
	 	
	 	
	 	/*
	 	문제6 : 두개의 정수를 입력받아 더 큰수 출력 
	 									
		System.out.print("문제6_1 정수 입력 : "); int 문제6_1 = scanner.nextInt();
		System.out.print("문제6_2 정수 입력 : "); int 문제6_2 = scanner.nextInt();
		System.out.println("결과6) : " + ( 문제6_1 > 문제6_2 ? 문제6_1 : 문제6_2 ) );
		*/
		
		/*
	 	문제7 : 반지름을 입력받아 원 넓이 출력하기 
	 		// 원 넓이 공식 = 반지름 * 반지름 * 원주율[3.14]  
		System.out.println("문제7) : "); double 반지름 = scanner.nextDouble();
		System.out.println("결과7 원넓이 :" + ( 반지름 * 반지름 * 3.14 ) );
		*/
	 	/*	 
	 	문제8 : 두 실수를 입력받아 앞실수의 값이 뒤의 값의 몇 %인지 출력하기 
	 		// 예) 54.5     84.3  입력했으면    64.285714% 출력 
		System.out.println("문제8) 실수1 : "); double 문제8_1 = scanner.nextDouble();
		System.out.println("문제8) 실수2 : "); double 문제8_2 = scanner.nextDouble();
		System.out.printf("결과 : %.2f%% " , ( 문제8_1/문제8_2)*100 );
		*/
		/*
	 	문제9 : 사다리꼴 넓이 구하기 [ 윗변과 밑변 높이를 입력받아 출력하기 ] 
	 		// 사다리꼴 계산식 -> ( 윗변 * 밑변 ) * 높이 / 2 
		
		System.out.println("윗변 : "); double 윗변 = scanner.nextDouble();
		System.out.println("밑변 : "); double 밑변 = scanner.nextDouble();
		System.out.println("높이 : "); double 높이 = scanner.nextDouble();
		System.out.println("결과 : " + ( (윗변*밑변)*높이/2 ));
		*/
		
		/*
	 	문제10: 키를 정수를 입력받아 표준체중 출력하기
			//표준체중 계산식 = > (키 - 100) * 0.9
		System.out.println("문제10) 키 : "); double 키 = scanner.nextDouble();
		System.out.println("결과 : " + ( (키-100)*0.9) ); */
		
		/*	 
		문제11 : 키와 몸무게를 입력받아 BMI 출력하기
			//BMI 계산식 = > 몸무게 / ((키 / 100) * (키 / 100)) 
		System.out.println("문제11) 키 : "); double 키2 = scanner.nextDouble();
		System.out.println("문제11) 몸무게 : "); double 몸무게 = scanner.nextDouble();
		System.out.println("bmi : " + ( 몸무게 / ((키2/100) * (키2/100))  ));
		/*
		
		/*
	 	문제12 : inch 를 입력받아 cm 로 변환하기 [ 1 inch -> 2.54cm ]
		System.out.println("문제)12 inch : "); double inch = scanner.nextDouble();
		System.out.println("결과 : cm " + ( inch*2.54));
		*/
		
		/*
	 	문제13 :  중간고사, 기말고사, 수행평가를 입력받아 반영비율별 계산하기
				//소수 둘째 자리 까지 점수 출력하기
				//중간고사 반영비율 => 30 %
				//기말고사 반영비율 => 30 %
				//수행평가 반영비율 => 40 %   
		System.out.println("문제13 중간고사 : "); double 중간고사 = (int)scanner.nextInt() *0.3 ;
		System.out.println("문제13 기말고사 : "); double 기말고사 = (int)scanner.nextInt() *0.3 ;
		System.out.println("문제13 수행평가 : "); double 수행평가 = (int)scanner.nextInt() *0.4 ;
		System.out.printf("결과 : %.2f" , (중간고사+기말고사+수행평가) ); */
		
		/*
		문제14 :  연산 순서 나열 하고 x와 y값 예측하기 
 				int x = 10;
				int y = x-- + 5 + --x;
				System.out.printf(" x의 값 : %d , y의값 :  %d ", x, y) ;  
		
		1. x변수에 10 대입한다.   	x = 10
		2. y변수에 대입
			1. x--		: 10 [ 나중에 감소 ]
			2. --x 		: 9 [ 먼저 감소 ] 
			3. x-- + 5 + --x : 10 + 5 -> 15 -1 [ 나중에 감소 ]
			4. 14 + 9		: 
			5. y = 23
		3. 출력
			x = 8 
			y = 23
		4. = 24		[ 대입 = 이 마지막 ]	
		*/
		 
			
		
		
		
	}	// main e
	
}	// class e
