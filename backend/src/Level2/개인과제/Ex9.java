package Level2.개인과제;

import java.util.Scanner;

public class Ex9 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("============간단 계좌만들기============");
		System.out.println("1.계좌만들기\t2.계좌목록\t3.입금\t4.출금");
		System.out.println("선택 : ");
		int ch = scanner.nextInt();
		if(ch == 1) {// 계좌만들기
			String 이름 = scanner.next();
			String 주민등록번호 = scanner.next();
			String 전화번호 = scanner.next();
			int 입금액 = scanner.nextInt();
			System.out.println("이름 : "+이름);
			System.out.println("주민등록번호 : "+주민등록번호);
			System.out.println("전화번호 : "+전화번호);
			System.out.println("초기 입금액 : "+입금액);
		}else if(ch == 2) {}
		else if(ch == 3) {}
		else if(ch == 4) {}
		
		
	
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