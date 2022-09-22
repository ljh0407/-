package 개인과제;

import java.util.ArrayList;
import java.util.Scanner;

public class 가계부View {

	
	Scanner scanner = new Scanner(System.in);
	가계부control control = new 가계부control();
	
	
	public static void main(String[] args) { 
		가계부View view = new 가계부View();
		view.menu();
	}
		
		void menu() {
			read();
			
			while (true) {
				System.out.println("1.추가 2.수정 3.삭제 4.검색 5.통계");
				int ch = scanner.nextInt();
				if( ch == 1 ) { create();}
				else if ( ch == 2 ) {update();}
				else if ( ch == 3 ) {delete();}
				
				
			}
		}
		
				
				
		// 1. 내용 추가 화면 메소드
		void create() {
			System.out.println("날짜 : "); String cdate = scanner.next();
			System.out.println("금액 : "); int cprice = scanner.nextInt();
			System.out.println("내용 : "); scanner.nextLine(); String ccontent = scanner.nextLine();
			boolean result = control.create(cdate,cprice,ccontent);
			if(result) {System.out.println("등록성공");}
			else {System.out.println("등록실패");}
		}
		// 2. 내용 출력 화면 메소드
		
		void read() {
			ArrayList<가계부DTO> list = control.read();
			System.out.println("번호\t날짜\t\t금액\t내용");
			for( 가계부DTO dto : list) { // list에서 dto 하나씩 꺼내오기
					// for ( 타입파라미터 임시변수 : 리스트/배열 ) {}
					System.out.print(dto.getCnum()+"\t");
					System.out.print(dto.getCdate()+"\t");
					System.out.print(dto.getCprice()+"\t");
					System.out.print(dto.getCcontent()+"\n");
			}
		}
		// 3. 내용 수정 화면 메소드
		void update() {
			System.out.println("수정할 번호 : ");  int cnum = scanner.nextInt();
			System.out.println("수정할 날짜 : ");	String cdate = scanner.next();
			System.out.println("수정할 금액 : ");	int cprice = scanner.nextInt();
			System.out.println("수정할 내용 : ");	scanner.nextLine(); String ccontent = scanner.nextLine();
			control.update(cnum,cdate,cprice,ccontent);
			boolean result 
				= control.update(cnum, cdate, cprice, ccontent);
			if(result) {System.out.println("수정성공");}
			else {System.out.println("수정실패");}
		}
		// 4. 내용 삭제 화면 메소드
		void delete() {
			System.out.println("삭제할 번호 : "); 
			int cnum = scanner.nextInt();
			boolean result = control.delete( cnum );
			if( result ) {System.out.println("삭제성공");}
			else {System.out.println("삭제실패[ 삭제할 번호 없다 or DB오류 ] ");}
		}
		
		}
		
					
					
	

