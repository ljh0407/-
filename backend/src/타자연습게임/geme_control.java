package 타자연습게임;

import java.util.ArrayList;

public class geme_control {

	
	// 회원가입 입력
	boolean signup(String mid , String pw , String mname , String mnn ) {
		회원가입DTO dto = new 회원가입DTO(0, mid, pw, mname, mnn);
		
		return 타자게임DAO.getInstance().sginup(dto);
	}
	
	
	// 회원가입 출력
	
	
	
	
	
	
	
	
}
