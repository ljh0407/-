package java1.c조건문반복문;

import java.util.Scanner;  // 외부 클래스 호출 [ 가져오기 ]

public class Ex7_별찍기 {

	
		
		public static void main(String[] args) {
			
			// 0. 입력객체 [ 1번 선언 ]
			Scanner scanner = new Scanner(System.in);
			
			// 1. 입력받은 수 만큼 * 출력 
			System.out.print("문제1) 별개수 : "); int s1 = scanner.nextInt();
			for( int i = 1 ; i <= s1 ; i++ ) { // i는 1부터 입력받은 수까지 1씩 증가반복
				System.out.print("*");
			} // for end 
	System.out.println("\n---------------------------------------------------");

			// 2. 입력받은 수 만큼 * 출력 [ 3줄마다(3배수) 줄바꿈 처리 ]
			System.out.print("문제2) 별개수 : "); int s2 = scanner.nextInt();
			for( int i = 1 ; i<= s2 ; i++ ) {
				System.out.print("*"); if( i % 3 == 0 ) { System.out.println(); }
			} // for end 
	System.out.println("\n---------------------------------------------------");

			// 3.
			System.out.print("문제3) 줄수 : "); int line3 = scanner.nextInt();
			for( int i = 1 ; i<=line3 ; i++ ) {
				// 2. 별찍기
				for( int s = 1 ; s<= i ; s++ ) { System.out.print("*"); }
				// 1. 줄바꿈
				System.out.println();
			} // for end 
	System.out.println("\n---------------------------------------------------");
		
			// 4.
			System.out.print("문제4) 줄수 : "); int line4 = scanner.nextInt();
			for( int i = 1 ; i<= line4 ; i++ ) {
				// 2. 별찍기 
				for( int s = 1 ; s <= line4-i+1 ; s++ ) { System.out.print("*");}
				// 1. 줄바꿈
				System.out.println();
			} // for end 
	System.out.println("\n---------------------------------------------------");
			// 5.
			System.out.print("문제5) 줄수 : "); int line5 = scanner.nextInt();
			for( int i = 1 ; i<=line5 ; i++ ) {
				// 2. 공백찍기
				for( int b = 1 ; b<=line5-i ; b++ ) { System.out.print(" "); }
				// 3. 별찍기 
				for( int s = 1 ; s<=i ; s++ ) { System.out.print("*"); }
				// 1. 줄바꿈
				System.out.println();
			}
			System.out.println("\n---------------------------------------------------");
			
			// 6.
			System.out.print("문제6) 줄수 : "); int line6 = scanner.nextInt();
			for( int i = 1 ; i <= line6 ; i++) {
				// 2. 공백찍기
				for( int b = 1 ; b<=i-1 ; b++ ) {System.out.print(" ");}
				// 3. 별찍기 
				for( int s = 1 ; s<=line6-i+1 ; s++) {System.out.print("*");}
				// 1. 줄바꿈
				System.out.println();
				}
			System.out.println("\n---------------------------------------------------");
			
			// 7.
			
			System.out.print("문제7) 줄수 : "); int line7 = scanner.nextInt();
			for (int i = 1 ; i<=line7 ; i++) {
				// 2. 공백찍기
				for( int b = 1 ; b<=line7-i ; b++) {System.out.print(" ");}
				// 3. 별찍기
				for( int s = 1 ; s<=i*2-1; s++) {System.out.print("*");}
				// 1. 줄바꿈
				System.out.println();
			}
				System.out.println("\n---------------------------------------------------");
			
			// 8. 
			
			System.out.print("문제8) 줄수 : "); int line8 = scanner.nextInt();
			for( int i = 1 ; i<=line8 ; i++ ) {
				// 2. 공백찍기
				for(int b = 1 ; b<=line8+i ; b++) {System.out.print(" ");}
				// 3. 별찍기
				for(int s = 1; s<=i*2-1; s++) {System.out.print("*");}
				// 1. 줄바꿈
				System.out.println();
			}
				
		
	}	// main e
	
}	// class e
