package Level2.개인과제;

import java.time.LocalDateTime;
import java.util.Random;
import java.util.Scanner;


public class Ex3 {

	public static void main(String[] args) {
		System.out.println(" >> Level2_3 answer >> ");
		System.out.println(" >> answer time : " + LocalDateTime.now() +" >> \n" );
		Scanner scanner = new Scanner(System.in);
		
		int kor = 89;
		int eng = 49;
		int mat = 72;
		System.out.println("--------------------------------------------------------------------");
		System.out.println("국어\t영어\t수학\t합계\t평균\t3배수\t8배수\t홀짝\t결과");
		
		/* 문제풀이 위치 */
		
		// 조건 ? 참 : 거짓 
		
		int 총점 = 210;
		boolean 배수3 =  (kor+eng+mat) % 3 == 0 ? true : false;
		boolean 배수8 = 	(kor+eng+mat) % 8 == 0 ? true : false;
		int avg = 70;
		
		
		System.out.print(kor+"\t"+eng+"\t"+mat+"\t"+(kor+eng+mat)+"\t"+((kor+eng+mat)/3)+"\t"+(배수3)+"\t"+배수8+"\t");
		if(총점 % 2 == 1 ) {System.out.print("홀수");}
		else {System.out.print("짝수");}
		if(avg >= 65 ) {System.out.print("\t합격");}
		else {System.out.print("불합격");}
		/* ----------- */
	}
}
/* 
	[문제] 국어,영어,수학 3개의 점수가 선언되어 있습니다. 그림과 같이 출력하시오.
	[조건] 
		1. 문제풀이 위치 외 코드는 수정 불가 합니다.
		2. 
			합계 : 3개의 점수를 모두 더한 값
			평균 : 합계 / 과목수 		[소수 첫째자리 까지 출력 ]
			3배수 : 합계 값이 3의 배수이면 true 아니면 false
			7배수 : 합계 값이 7의 배수이면 true 아니면 false
			홀짝 : 합계 값이 홀수이면 홀수출력 아니면 짝수 출력 
			결과 : 합계가 65점이상이면 합계 아니면 탈락 출력 
		3. *(중요) 풀이코드에서 printf는 한번만 사용합니다.
		
*/
	
	

