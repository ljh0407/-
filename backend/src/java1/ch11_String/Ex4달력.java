package java1.ch11_String;

import java.util.Calendar;
import java.util.Scanner;

public class Ex4달력 {
	// 1. 필드
	Scanner scanner = new Scanner(System.in); // 입력객체
	Calendar cal = Calendar.getInstance();
	int year = cal.get(Calendar.YEAR);
	int month = cal.get(Calendar.MONTH)+1 ;
	int day = cal.get(Calendar.DAY_OF_MONTH);;

	// 2. 생성자
	
	// 3. 메소드
	
	void run() {
		while(true) {
		// ** 1일의 요일[]
		cal.set(year, month-1, 1); // 현재 월의 1일 날짜
		int sweek = cal.get( Calendar.DAY_OF_WEEK); // 현재 월의 1일의 요일
		/////////////////////////////////////////////////
		// ** 현재날짜의 마지막 일 수 찾기
		int eday = cal.getActualMaximum(Calendar.DAY_OF_MONTH);
		
			/// 출력코드 ///
		
		System.out.printf("====== %d 년 %d 월 의 달력 ======= \n" ,
								year , month);
		System.out.println("일\t월\t화\t수\t목\t금\t토");
		// 1. 1일의 전까지 공백 반복문
		for( int i = 1 ; i< sweek ; i++) {System.out.print("\t");}
		
		// 2. 1일부터 ~ 마지막 일수 까지 일수를 출력하는 반복문
		for( int i = 1 ; i<=eday ; i++) {System.out.printf( "%2d \t", i);}
				// 토요일 이후[ sweek 7의 배수이면 ] 에 줄바꿈처리
			if(sweek % 7 == 0) {System.out.println();}
			sweek++; // 일수를 출력할때마다 요일도 증가처리
			// 출력코드//
			
			
			System.out.println("\n=====================================");
			/////////////////////////////////////////////
			System.out.println("◀이전달[1] ▶다음달[2] 검색[3] 일정추가[4] : ");
			int btn = scanner.nextInt();
				// 이전달 : 월에서 차감 [ 만일 월이 0 이면 월=12 설정 연도 1 차감
			if(btn ==1) { month--; if(month == 0) {month=12; year--;} }
				// 다음달 : 월에서 1증가
			else if(btn == 2) {month++; if(month == 13 ) {month = 1; year++;} }
			else if(btn == 3) {}
			else if(btn == 4) {}
			else {}
			// 출력코드 //
			
		}// while end	
			
		}
	}
	

