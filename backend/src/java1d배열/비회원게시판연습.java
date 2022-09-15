package java1d배열;

import java.util.Scanner;

public class 비회원게시판연습 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		String[][] list = new String[100][4];
		
		while(true) {// 무한반복
			
			System.out.println("번호\t작성자\t제목");
			for( int i = 0 ; i<list.length; i++) {
				if(list[i][0] != null ) {
					
					System.out.print(i+"\t"); 
					System.out.print(list[i][2]+"\t");
					System.out.print(list[i][0]+"\n");
				}
			}
			
			System.out.println("--------------비회원 게시판------------");
			System.out.println("1.글쓰기 2.글보기 선택 : "); int btn = scanner.nextInt();
			
			if( btn == 1) {// 1번 눌렀을때 
				System.out.println("제목"); String title = scanner.next();
				System.out.println("내용"); String content = scanner.next();
				System.out.println("작성자"); String name = scanner.next();
				System.out.println("비밀번호"); String password = scanner.next();
				
				for( int i = 0; i<list.length ; i++) {
					if(list[i][0] == null) {
						list[i][0] = title;
						list[i][1] = content;
						list[i][2] = name;
						list[i][3] = password;
						break;
					}
				}
			}   
			else if( btn == 2) {// 2번 눌렀을때
				System.out.println("게시물번호선택 : "); int i = scanner.nextInt();
				System.out.println("제목:"+list[i][0]+"내용:"+list[i][1]+"작성자:"+list[i][2]);
				System.out.println("1.뒤로가기 2.삭제 3.수정하기"); int num = scanner.nextInt();
				
				if( num == 1 ) {}
				else if( num == 2 ){
					System.out.println("비밀번호를 입력해주세요"); String pw = scanner.next();
					if(pw.equals(list[i][3]) ) {
						//삭제
						for( int a = i; a<list.length ; a++) {
							list[a][0] = list[a+1][0];
							list[a][1] = list[a+1][1];
							list[a][2] = list[a+1][2];
							list[a][3] = list[a+1][3];
							if( list[a+1][0] == null) break;
						}
					}else {
						System.out.println("비밀번호가 틀렸습니다.");
					}
				}
				else if( num == 3 ) {// 수정처리
					System.out.println("비밀번호를 입력해주세요"); String pw = scanner.next();
					if(pw.equals(list[i][3]) ) {
						System.out.println("수정할 제목: "); String newtitle = scanner.next();
						System.out.println("수정할 내용"); String newcontent = scanner.next();
						list[i][0] = newtitle;
						list[i][1] = newcontent;
					}
				else { System.out.println("비밀번호가 틀렸습니다. ");}
				}
				
			}
			
			
			
		}// while end
		
	}// main end
	
}// class end
