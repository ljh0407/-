package java1d배열;

import java.util.Scanner;

public class Ex7_비회원게시판 { // class s

	public static void main(String[] args) { // main s
		
		String[][] list = new String[100][4];
		Scanner scanner = new Scanner(System.in);
		
			
			
			
		while(true) { // 무한루프
		// 처음창
			{
				System.out.println("번호\t 작성자\t 제목");
				System.out.println("1.글쓰기\t 2.글보기"); 
				System.out.println("선택 : "); 
			}
			
		// 1 (글쓰기) 입력했을때 
			
			
			if (btn == 1){
				System.out.println("------------ 글 쓰기 페이지 -------------");
				System.out.println("제목 : "); 	String title = scanner.next();
				System.out.println("내용 : "); 	String content = scanner.next();
				System.out.println("작성자 : "); 	String writer = scanner.next();
				System.out.println("비밀번호 : "); String password = scanner.next();
				System.out.println("1.글쓰기\t 2.글보기 ");
				System.out.println("선택 : ");
			
			}// if e	
			
			
			
			
		
		// 2 (글보기)입력했을때
			
			{
				System.out.println("================커뮤니티================");
				System.out.println("번호\t 작성자\t 제목");
				System.out.println("게시물 번호 선택 : ");
				
			} // if e

		// 3 입력했을때 상세페이지
			
			
				
				
			
		
	}// while e
	} // main e
	
}// class e


/*
	비회원제 게시판
	[조건] 2차원 배열, main 메소드만 사용
	title 제목
	password 비밀번호
	content 내용
	writer 작성자
	


*/