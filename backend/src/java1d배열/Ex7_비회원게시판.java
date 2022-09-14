package java1d배열;

import java.util.Scanner;

public class Ex7_비회원게시판 { // class s

	public static void main(String[] args) { // main s
		
		String[][] list = new String[100][4];
		Scanner scanner = new Scanner(System.in);
		
		// 첫페이지
		while(true) { // 무한루프
			
		// 모든 게시물 출력 --> 모든 인덱스 호출 -- > 조건 : 해당 인덱스 공백 제외하자
			System.out.println("번호\t작성자\t제목");
		for( int i = 0; i<list.length ; i++) {
			if(list[i][0] != null ) {
			System.out.println(i + "\t");
			System.out.println(list[i][2] + "\t");
			System.out.println(list[i][0] + "\n");
			}
		}
			
		 System.out.println("----------- 비회원 게시판 -------------");
		 System.out.println("1.글쓰기 2.글보기 선택 : "); // 입력을 받기전에 알림[메시지] 
		 int ch = scanner.nextInt();
		 // 입력받은 정수를 int에 저장
		 
		 // 경우의수 : 1 , 2 눌렀을때
		 if( ch == 1 ) {
			 // 1. 출력[print] : 안내(메시지) -> 입력[scanner] -> 저장 [ 변수 ]
			 System.out.print("제목 : "); String title = scanner.next();
			 System.out.print("내용 : "); String content = scanner.next();
			 System.out.print("작성자 : "); String writer = scanner.next();
			 System.out.print("비밀번호 : "); String password = scanner.next();
			 // 게시물 한개당 변수4개를 입력받았다
			 // 근데 게시물100개면 변수400개 관리어렵다 배열쓰자
			 
			 // 4개의 변수를 배열에 저장할껀데 비어 있는 게시물 행을 찾아야 한다.
			 // 배열이 비어있다는 뜻은 null [ 배열을 선언하고 값을 안넣어주면 null이 들어가 있다. ]
			 	// 모든 행의 인덱스 : 0~99 -> 0부터 99까지의 변수를 반복하자
		//	 for( int index = index; index<list.length ; index++; ) {  // .length : 배열의 길이 = 100
				 // 공백찾자 - > 공백을 제어하자 -> == null
			 for( int i = 0; i<100 ; i++) {
				 if( list[i][0] == null ) { // 해당 i번째 행이 공백이면
					 list[i][0] = title; list[i][1] = content;
					 list[i][2] = writer; list[i][3] = password;
					 break; // 저장했으면 for문 끝내기 -> 한개만 저장할려고
				 } // if end
			 }// for end
				 
			 
			 
			 
			 
		 } // 1눌렀을때
		 else if ( ch == 2 ) {} // 2 눌렀을때
		 // 해당 게시물의 모든 정보를 알기 위해 --> 해당 게시물을 선택
		 // 1. 제목[ x = 중복이 있을수 있으니까 ]
		 // 2. 내용[ x = 중복이 있을수 있으니까 ]
		 // 3. 작성자 [ x = 한사람이 여러개 글쓰면 식별 불가능 ]
		 // 4. 비밀번호 [ x = 중복이 있을수 있으니까 ]
		 
		 System.out.println("게시물번호 선택 : "); int bnum = scanner.nextInt();
		 
		 // 선택된 게시물번호의 정보를 출력해주자
		 System.out.println("제목 : "+ list[bnum][0] +"          작성자 : " + list[bnum][2] );
		 System.out.println("내용 : " + list[bnum][1]);
		 System.out.println("1.뒤로가기 2.글삭제 3.글수정  선택 : ");

		 int ch2 = scanner.nextInt();
		 if( ch2 == 1) {}
		 else if( ch2 == 2 ) {}
		 	// 삭제할 게시물번호 = 이미 위에 받았다 = 
		 
		 	System.out.println("비밀번호 : "); String password = scanner.next();
		 
		 	if(list[bnum][3].equals(password) ) { // 만약에 해당 게시물의 비밀번호와 같으면 삭제 진행
		 	
		 	for( int i = bnum ; i<list.length; i++ ) {
		 		list[i][0] = list[i+1][0];	// 제목 = 다음 행의 제
		 		list[i][1] = list[i+1][1];	// 내용 = 다음 행의 내용
		 		list[i][2] = list[i+1][2];	// 작성자 = 다음 행의 작성자 
		 		list[i][3] = list[i+1][3];	
		 		if( list[i+1][0] == null ) break;
		 	} else {
		 		System.out.println(" 안내) 비밀번호가 다릅니다.");
		 	}
		 	}
		 	
		 else if( ch2 == 3 ) {System.out.println("비밀번호 : "); String password = scanner.next();
		 
		 	if(list[bnum][3].equals(password) ) { // 만약에 해당 게시물의 비밀번호와 같으면 삭제 진행
		 		list[bnum][0] = newtitle;
		 		list[bnum][1] = newcontent;
		 	}
		 else { System.out.println("안내 ) 비밀번호가 다릅니다.");}
		 
		} // while end
		 
		
		
		
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