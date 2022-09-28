package 타자연습게임;



public class geme_control {

	
	
	private static geme_control gcontrol = new geme_control();
	private geme_control() {}
	public static geme_control getInstance(){return gcontrol;}

	
	// 회원가입 입력
	public boolean signup(String mid , String pw , String mname , String mnn ) {
		회원가입DTO dto = new 회원가입DTO(0, mid, pw, mname, mnn);
		
		return 타자게임DAO.getInstance().sginup(dto);
	}
	
	
	// 회원가입 출력
	
	
	
	
	
	
	
	
}
