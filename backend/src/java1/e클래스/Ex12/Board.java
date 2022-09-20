package java1.e클래스.Ex12;

public class Board {

	// 1. 필드
	String title; // 상자크기[자료형] 상자이름[변수명]
	String content; 
	String writer;
	String password;
	int view;
	
	// 2. 생성자
	Board(){}
	Board( String title, String content, String writer, String password, int view ) {
		this.title = title;
		this.content = content;
		this.writer = writer;
		this.password = password;
		this.view = view;
	}
	// 3. 메소드
	
}
