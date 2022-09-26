package java1.ch12스레드;

import java.security.cert.TrustAnchor;
import java.util.Scanner;

public class Ex4예제1 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		boolean musictate = false;
		Music music = new Music();
		
		
		boolean movietate = false; // 영화 재생여부 판단 변수
		Movie movie = new Movie();// 영화 스레드 선언
		Thread thread = new Thread(movie);
		
		
		while(true) {
			
			
			if(musictate == false) System.out.println("1.음악[재생] : ");
			else System.out.println("1.음악[중지]");
			
			if(movietate == false) System.out.println("2.영화[재생] : ");
			
			int ch = scanner.nextInt();
			
			if(ch == 1 && musictate == false) {// 입력한 값이 1번 이면서 음악이 꺼져있으면
				
				music.start(); 			// 음악 스레드 시작
				musictate = true;		// 현재 스레드가 작업 스레드 재생여부 변경
			}
			else if ( ch == 1 && musictate == true ) {
				musictate = false; 		// 현재 스레드가 작업 스레드 재생여부 변경
				music.setStop(false);	// 음악 스레드 종료 -> while 종료 -> run메소드 종료 -> 멀티스레드 종료
				music = new Music();	// 새로운 메모리 할당
			}
			
			
			
			
			if(ch == 2 && movietate == false) {
				thread.start(); movietate = true;
			} 
			else if(ch == 2 && movietate == true) {
				movie.setStop(false); // 강제종료 [ 비권장 ]
				movietate = false;
			}	
			
		}
		
		
		
		
	}
}


		
		
		
	

/*

	1. Thread 클래스
	2. Runnable 인터페이스


*/