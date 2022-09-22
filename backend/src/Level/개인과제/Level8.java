package Level.개인과제;


import java.lang.invoke.WrongMethodTypeException;
import java.time.LocalDateTime;
import java.util.Scanner;


public class Level8 {

	public static void main(String[] args) {
		System.out.println(" >> Level1_8 answer >> ");
		System.out.println(" >> answer time : " + LocalDateTime.now() +" >> \n" );
		Scanner scanner = new Scanner(System.in);
		
		String header = "\n============방문록===============\n번호\t 작성자 \t 방문록\n";
		String boardlist = "";
		String footer = "================================\n";
		String output = "";
		
		/* 문제풀이 위치 */
		
		
		System.out.print("[1] 작성자 : "); String writer = scanner.next();
		System.out.print("[1] 방문록 : "); String log = scanner.next();
		System.out.println(header);  
		System.out.println(boardlist+"1\t"+writer+"\t"+log);
		System.out.println(output);
		System.out.println(footer);
		
		
		System.out.print("[2] 작성자 : "); String writer2 = scanner.next();
		System.out.print("[2] 방문록 : "); String log2 = scanner.next();
		System.out.println(header);  
		System.out.println(output+boardlist+"1\t"+writer+"\t"+log);
		System.out.println(boardlist+"2\t"+writer2+"\t"+log2);
		System.out.println(footer);
		
		System.out.print("[3] 작성자 : "); String writer3 = scanner.next();
		System.out.print("[3] 방문록 : "); String log3 = scanner.next();
		System.out.println(header);  
		System.out.println(output+boardlist+"1\t"+writer+"\t"+log+"\n"+"2\t"+writer2+"\t"+log2);
		System.out.println(boardlist+"3\t"+writer3+"\t"+log3);
		System.out.println(footer);
		
		
		  System.out.print("[4] 작성자 : "); String writer4 = scanner.next();
		  System.out.print("[4] 방문록 : "); String log4 = scanner.next();
		  System.out.println(header);
		  System.out.println(output+boardlist+"1\t"+writer+"\t"+log
				  						+"\n"+"2\t"+writer2+"\t"+log2+"\n"
				  						+"3\t"+writer3+"\t"+log3);
		  System.out.println(boardlist+"4\t"+writer4+"\t"+log4);
		  System.out.println(footer);
		  
		  System.out.print("[5] 작성자 : "); String writer5 = scanner.next();
		  System.out.print("[5] 방문록 : "); String log5 = scanner.next();
		  System.out.println(header);
		  System.out.println(boardlist+"1\t"+writer+"\t"+log
					+"\n"+"2\t"+writer2+"\t"+log2+"\n"
					+"3\t"+writer3+"\t"+log3+"\n"
					+"4\t"+writer4+"\t"+log4);

		  System.out.println(boardlist+"5\t"+writer5+"\t"+log5);
		  System.out.println(footer);
		 
		
		
		
		/* ----------- */
		
	}
	
}


/* 
[문제] 그림과 같이 기본자료형을 이용하여 변수 8개를 출력하시오.
[조건] 
	1. 문제풀이 위치 외 코드는 수정 불가 합니다.
	2. 문자열클래스를 이용하여 그림과 같이 제목과 내용을 입력받습니다. [ 내용만 띄어쓰기가 가능하도록 입력받습니다 ]
	3. *반복문을 사용하지 않고 총 5개의 방문록이 작성 되도록 작성하시오.
	4. 방문록 1번 작성할때마다 방문록을 목록을 보여줍니다.
	5. 기존에 미리 작성된 변수를 최대한 활용합니다.
*/