package 타자연습게임.선생님꺼;

import java.util.Scanner;

public class 타자연습 {
	private  Scanner scan = new Scanner(System.in);
	
	private boolean stop = true;
	public static 타자연습 싱글톤 = new 타자연습();
	private 타자연습() {}
	public void setstop( boolean stop) {
		this.stop = stop;
	}
	
	public void 타자_start( ) {
		
		System.out.println("========== 타자게임 ==========");
		System.out.print("1.로그인\t2.회원가입\t3.랭킹순위");
	 
		타이머스레드.싱글톤.start();
		
		while( stop ) {
			
			System.out.println("-5초안에 입력하시오-");
			
			System.out.println("문제 : 안녕하세요");
			String 입력 = scan.next();
			
			if( 입력.equals("안녕하세요") ) {
				타이머스레드.싱글톤.count = 0;
				if( 타이머스레드.싱글톤.count <=5  ) {
					System.out.println("성공");
				}
			}
		}
		System.out.println(" 사망 ");
	}
	
}
