package java1d배열;

import java.util.Scanner;

public class Ex7_비회원게시판 { // class s

	public static void main(String[] args) { // main s
		
		String[][] list = new String[100][4];
		Scanner scanner = new Scanner(System.in);
		
		// 첫페이지
		 // 무한루프
		while(true){
		System.out.println("----------커뮤니티----------");
		System.out.println("번호\t작성자\t제목");
		for( int i = 0; i<list.length; i++) {
			if(list[i][0] != null) {
				System.out.println(i+"\t"+list[i][2]+"\t"+list[i][0]);
				
			}else if(list[i][0] == null) {
				break;
			}
			
		
		}
		
		
		System.out.println("1.글쓰기\t2.글보기\t선택 :");
		int 번호 = scanner.nextInt();
		System.out.println("게시물번호 선택 :");
		
		// 1번 글쓰기
		if(번호 == 1) {
			
			System.out.println("----------글 쓰기 페이지------------");
			System.out.println("제목 :");
			String 제목 = scanner.next();  
			System.out.println("내용 : ");
			String 내용 = scanner.next();
			System.out.println("작성자 :");
			String 작성자 = scanner.next();
			System.out.println("비밀번호 :");
			String 비밀번호 = scanner.next();
			//게시판 배열에 저장
			for( int i = 0 ; i<list.length; i++ ) {
				if(list[i][0] == null) {
					list[i][0] = 제목;
					list[i][1] = 내용;
					list[i][2] = 작성자;
					list[i][3] = 비밀번호;
					break;
				}
			}
		}
		// 2번 글보기
		else if(번호 == 2) {
			System.out.println("-----------게시물 상세페이지-------------");
			String 게시물번호 = scanner.next();
			for( int j = 0 ; j<list.length; j++ ) {
				
				if(list[j][게시물번호]) {
				}
			}
				
				
			}
			
		}
		// 그외 번호일때
		else {
			System.out.println("그런번호는 없습니다.");
		}
		
		}
		
			
			
		// 글쓰기 페이지
			/*
			if( i == 0 ; i<=99 ; i++) {
				
			}else if() {
				
			}
			else if(){
				
			}else if () {
				
			}else {}
			*/
		
		
	} // main e
	}	// class e



/*
	비회원제 게시판
	[조건] 2차원 배열, main 메소드만 사용
	title 제목
	password 비밀번호
	content 내용
	writer 작성자
	


*/