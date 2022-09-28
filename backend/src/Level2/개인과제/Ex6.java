package Level2.개인과제;

import java.time.LocalDateTime;
import java.util.Scanner;


public class Ex6 {

	public static void main(String[] args) {
		System.out.println(" >> Level2_6 answer >> ");
		System.out.println(" >> answer time : " + LocalDateTime.now() +" >> \n" );
		Scanner scanner = new Scanner(System.in);
		
		
		/* 문제풀이 위치 */
		String 종료버튼 = scanner.next();
		while (true) { System.out.println("프로그램종료");
			if(종료버튼.equals("end")) {System.out.println("종료");break;}
		}
		//System.out.println("종료");
		
		/* ----------- */

	}
	
}
/* 
[문제] 그림과 같이 무한 입력 받다가 end 입력시 종료되는 반복문을 구현하시오.
[조건] 
	1. 문제풀이 위치 외 코드는 수정 불가 합니다.

	
*/