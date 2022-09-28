package 타자연습게임;

import java.util.Scanner;
import java.util.ResourceBundle.Control;

public class view {

	
	Scanner scanner = new Scanner(System.in);
	private static view view = new view();
	private view() {}
	public static view getInstance() {return view;}
	
	
	// 메인페이지 
	 void mainpage() {
		System.out.println("=============타자게임============");
		System.out.print("1.회원가입\t2.로그인\t3.랭킹순위");
		try {
			int btn = scanner.nextInt();
			if( btn == 1) {sginup();}
			else if (btn == 2) {}
			else if (btn == 3) {}
			else {}
			
		} catch (Exception e) {}
	}
	
	private void sginup() {
		
		System.out.println("아이디를 입력하세요 : " );  String mid = scanner.next();
		System.out.println("비밀번호를 입력하세요 : "); String pw = scanner.next();  
		System.out.println("이름을 입력하세요 : ");   String mname = scanner.next();
		System.out.println("닉네임을 입력하세요 : ");  String mnn = scanner.next();
		geme_control.getInstance().signup(mid, pw, mname, mnn);
		
	} 
	
}
