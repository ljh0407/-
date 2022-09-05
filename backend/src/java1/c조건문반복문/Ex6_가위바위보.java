package java1.c조건문반복문;

import java.util.Random;
import java.util.Scanner;

/*
  	가위바위보 게임
  		[ 조건 ] 
  		1. 플레이어 에게 가위[0] , 바위[1] , 보[2] 중에 입력받기
  		2. 컴퓨너 에게 난수[ 0~2 ] 생성 ( random.nextInt(3) )
  			* Random 클래스
  			* Random 변수명 = new Random()
  				* 변수명.nextint(수) : 0~수-1 까지의 난수 발생
  		3. 승리자 판단 [ 경우의 수 ]
  		4. 게임종료시 (3) 입력
  			1. 게임판수 출력
  			2. 최종 승리자가 출력
  		[ 메뉴 ] 
  			가위(0) 바위(1) 보(2) 종료(3)
  			
  	 *자바 클래스
  	 1. System : 입출력클래스
  	 			System out : 출력
  	 			Systen in : 입력
  	 
  	 2. Scanner : 입력 클래스
  	 			scanner.next()
  	 			scanner.nextint()
  	 3. String : 문자열 클래스
  
  	 4. Random : 난수 클래스
  	 
 */



public class Ex6_가위바위보 {	// class s

	public static void main(String[] args) {	// main s
		
		// 0. 모든 코드에서 사용될 변수[메모리] 선언
		Scanner scanner = new Scanner(System.in);
		int 플레이어; int 컴퓨터; int 게임판수 = 0; int 승리수 = 0;	// 0 이면 무승부 // 양수:플레이어 // 음수 : 컴퓨터
		// 4.
		while( true ) { // 무한루프 [ 종료조건 : 3 입력을했을때 ]
			
			// 1. 플레이어에게 입력받는다.
			System.out.println(" 가위(0) 바위(1) 보(2) : "); 플레이어 = scanner.nextInt();
			
				// 6. 입력 경우의수 [ 1. 0~2 : 정상입력  / 2. 3 : 종료 / 3. 그외 : 비정상입력 ]
				if( 플레이어 >= 0 && 플레이어 <= 2) {
				//////////////////////////////// 게임 진행 ///////////////////////////////
			
			// 2. 컴퓨터가 난수를 생성한다.
			Random random = new Random();	// 1. 랜덤 객체를 생성한다.
			컴퓨터 = random.nextInt( 3 );	// 2. 랜덤객체를 이용한 int형 난수 생성 : 객체명.nextInt(수) 0~(수-1)
			// 3. 승리자 판단 [ 경우의수 3개 = 1.승리 2.무승부 3. 패배 ]
				// 1. ( 0 && 2 ) or ( 1 && 0 ) or ( 2 && 1 )
			if( (플레이어==0 && 컴퓨터==2) || (플레이어==1 && 컴퓨터==0) || (플레이어==2 && 컴퓨터==1) )	 
				{System.out.println("결과) 플레이어 승리"); 승리수++; }
			// 2. ( 0 && 0 ) or ( 1 && 1 ) or ( 2 && 2 )
			else if( (플레이어==0 && 컴퓨터==0) || (플레이어==1 && 컴퓨터==1) || (플레이어==2 && 컴퓨터==2) )
			{System.out.println("결과) 무승부"); }
			else  // 3. 그외
				{ {System.out.println("결과) 컴퓨터 승리 "); 승리수--; } }
			// 5. 게임횟수 증가
			게임판수 ++;
		}	////////////////////////////////////////////////////////////////////////
		else if ( 플레이어 == 3 ) {
			// 7. 게임종료 했을때
			System.out.println("게임종료) 게임횟수 : " + 게임판수 );
			if( 승리수 == 0 ) {System.out.println("(최종결과) 무승무");}
			else if( 승리수 >=1 ) {System.out.println("최종결과) 플레이어승리");}
			else {System.out.println("최종결과) 컴퓨터승리");}
			break; // 무한루프 탈출 [반복문 종료]
		}
			else {System.out.println("안내) 알수없는 번호입니다.[다시입력]");}
		} // while e
	}	// main e
	
}	// class e
