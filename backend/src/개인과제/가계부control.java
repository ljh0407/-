package 개인과제;

import java.util.ArrayList;

public class 가계부control {

	boolean create( String cdate , int cprice ,
			String ccontent) {
		// 매개변수3개 -- 1개 dto 객체 선언
		가계부DTO dto = new 가계부DTO(0, cdate, cprice, ccontent);
		
		// dto 객체 -> dao 메소드
		return 가계부DAO.getInstance().create(dto);		
	}
	
	// 2. 내용호출 컨트롤러
	ArrayList<가계부DTO> read (){
		return 가계부DAO.getInstance().read();
	}
	
	
	// 4. 내용삭제
	boolean delete( int cnum) {
		return 가계부DAO.getInstance().delete( cnum );
	}
	
	// 3. 수정
	boolean update(int a , String b , int c , String d ) {
		return 가계부DAO.getInstance().update( new 가계부DTO(a , b , c , d ) );
	}
}
