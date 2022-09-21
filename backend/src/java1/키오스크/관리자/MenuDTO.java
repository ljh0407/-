package java1.키오스크.관리자;

public class MenuDTO {
	
	// 1. 필드
	private int mno;
	private String mname;
	
	// 2. 생성자
	public MenuDTO() {}
	public MenuDTO(int mno, String mname) {
		super();
		this.mno = mno;
		this.mname = mname;
	}
	
	// 3. 메소드
	public int getMno() {
		return mno;
	}
	public void setMno(int mno) {
		this.mno = mno;
	}
	public String getMname() {
		return mname;
	}
	public void setMname(String mname) {
		this.mname = mname;
	}
	
	
	
	
	
}
