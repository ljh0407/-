package java1.e클래스.Ex13비회원게시판_DB버전;

import java.util.ResourceBundle.Control;

public class BoardControl {

	
	BoardDao boardDao = new BoardDao();	// 현재 클래스에 존재하는 메소드 들이 dao객체의 메소드 호출용 
	// 1.
	boolean regist(String b_title , String b_content ,
			String b_writer , String b_password ) {
		// 1. 4개의 매개변수를 받는다.
		// 2. 변수가 많을때 이동하면 매개변수 코드가 많으니까 객체화 하자
		BoardDto boardDto = new BoardDto(0 ,b_title , b_content , b_writer , b_password , 0 );
		// 3. 유효성 검사 [ 추후에 할 예정 ] 
		// 4. DB처리 
		boolean result = boardDao.regist(boardDto); // dao.regist 메소드 호출후 결과값을 result 에 저장
		// 5. DB 결과 반환
		return result;
	}
	// 2. 
	BoardDto[] getBoardlist() {
		BoardDto[] boardlist = null; // 선언
		boardlist = boardDao.getBoardlist(); // 결과
		return boardlist; // 반환
		
	}
	// 3.
	BoardDto getBoard( int b_no ) {
		BoardDto board = null;
		// 로직 or Dao 호출작성 예정
		return board;
	}
	// 4. 
	boolean update( int b_no , String b_password , 
		String new_title , String new_contnet) {
		// 로직 or Dao 호출작성 예정
		return false;
	}
	// 5. 
	boolean dalete ( int b_no , String b_password ) {
		// 로직 or Dao 호출작성 예정
		return false;
	}
}
