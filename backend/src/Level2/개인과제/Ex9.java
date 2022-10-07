package Level2.개인과제;

import java.util.Scanner;

public class Ex9 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		while(true) {
		System.out.println("============간단 계좌만들기============");
		System.out.println("1.계좌만들기\t2.입금\t3.출금");
		System.out.println("선택 : ");
		int 총잔고 = scanner.nextInt();
		int 입금액 = scanner.nextInt();
		int 출금액 = scanner.nextInt();
		int ch = scanner.nextInt();
		if(ch == 1) {// 계좌만들기
			System.out.println("이름 : ");String 이름 = scanner.next();
			System.out.println("주민등록번호 : ");String 주민등록번호 = scanner.next();
			System.out.println("전화번호 : ");String 전화번호 = scanner.next();
			System.out.println("초기 입금액 : ");
			System.out.println("========================================");
			System.out.println("입력한 정보를 다시 한번 확인해주세요.");
			System.out.println("이름 : "+이름+"\n"+
							"주민등록번호: "+주민등록번호+"\n"+
							"전화번호 : "+전화번호+"\n"+
							"초기 입금액 : "+입금액);
			System.out.println("계좌생성을 원하시면 [예/아니요] 로 입력해주세요"); String 확인 = scanner.next();
			if( 확인.equals("예")  ) {System.out.println("계좌가 생성되었습니다!"); 
			}else if( 확인.equals("아니요")) {System.out.println("처음화면으로 돌아갑니다.");
			}else {System.out.println("잘못입력하셨습니다.");}
				
		}if(ch == 2) {
			System.out.println("입금 하실금액을 입력해주세요. : ");
			System.out.println(입금액+"원이 입금되었습니다.");
			System.out.println("현재 통장잔고 : "+(총잔고+입금액));
		}else {}
		
		if(ch == 3) {
			System.out.println("출금 하실 금액을 입력해주세요. : ");
			System.out.println(출금액+"원이 출금되었습니다.");
			System.out.println("현재 통잔잔고 : "+(총잔고-출금액));
			if( 총잔고 < 출금액 ) {
				System.out.println("잔액이 부족합니다.");
			}
		}
		
		}// while end
	
	}// main end
	
}
/*
	-*- 자유 주제 미니 프로젝트  -*-
	[조건]
		* 배열 / 클래스[객체/함수] 사용 불가능합니다.
		* 아래 3가지 문법을 통해 자유롭게 프로젝트를 진행합니다.
	1. 변수[기본자료형8개+String]
	2. 반복문[ while , for ]
	3. 제어문[ if ]
	4. 코드 50 줄 이상 으로 작성합니다.
	5. 아래 예시와 같이 수업시간에 작성했던 파일을 참고하나 동일한 주제로는 하지마세요.
	[예시] EX4_자판기 , EX5_예금프로그램  , EX6_가위바위보 등등

*/