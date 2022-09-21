package Level.개인과제;

import java.time.LocalDateTime;
import java.util.Scanner;

public class Level7 {

	public static void main(String[] args) {
		System.out.println(" >> Level1_7 answer >> ");
		System.out.println(" >> answer time : " + LocalDateTime.now() +" >> \n" );
		Scanner scanner = new Scanner(System.in);
		
		String output = "";
		
		/* 문제풀이 위치 */
		
		System.out.print("회원명 String : "); 	String name = scanner.next();
		
		System.out.print("상태 boolean : ");		Boolean bool = scanner.nextBoolean();
		System.out.print("회원번호 byte : ");		Byte number = scanner.nextByte();
		System.out.print("성별 char : ");			String 성별 = scanner.next();
		System.out.print("포인트 int : ");	    int point = scanner.nextInt();
		System.out.print("예금액 long : ");		Long money = scanner.nextLong();
		System.out.println("키 float : ");	 	Float height = scanner.nextFloat();
		System.out.println("몸무게 double : ");	Double kg = scanner.nextDouble();
		
		
		
		System.out.println("============회원 개인정보============");
		System.out.println("|\t   회원명 : "+name+"\t\t|");
		System.out.println("|\t   상태 : "+bool+"\t\t|");
		System.out.println("|\t   회원번호 : "+number+"\t\t|");
		System.out.println("|\t   성별 : "+성별+"\t\t|");
		System.out.println("|\t   포인트 : "+point+"\t\t|");
		System.out.println("|\t   예금액 : "+money+"\t\t|");
		System.out.println("|\t   키 : "+height+"\t\t|");
		System.out.println("|\t   몸무게 : "+kg+"\t\t|");
		System.out.println("=================================");
		/* ----------- */
	}
	
}
