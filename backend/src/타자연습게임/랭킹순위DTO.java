package 타자연습게임;

public class 랭킹순위DTO {
	
	// 1. 필드
	private int mno;
	private int ss;
	
	
	// 2. 생성자
	public 랭킹순위DTO(int mno, int ss) {
		super();
		this.mno = mno;
		this.ss = ss;
	}

	// 3. 메소드

	public int getMno() {
		return mno;
	}


	public void setMno(int mno) {
		this.mno = mno;
	}


	public int getSs() {
		return ss;
	}


	public void setSs(int ss) {
		this.ss = ss;
	} 
	
	
	
	
	
	
	
}
