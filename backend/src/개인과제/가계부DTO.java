package 개인과제;

public class 가계부DTO {

	// 1. 필드
	private int cnum ;
	private String cdate; 
	private int cprice;
	private String ccontent;
	
	// 2. 생성자
    public 가계부DTO(int cnum, String cdate, int cprice, String ccontent) {
    	super();
    	this.cnum = cnum;
    	this.cdate = cdate;
    	this.cprice = cprice;
    	this.ccontent = ccontent;
    }
    
    // 3. 메소드

	public int getCnum() {
		return cnum;
	}

	public void setCnum(int cnum) {
		this.cnum = cnum;
	}

	public String getCdate() {
		return cdate;
	}

	public void setCdate(String cdate) {
		this.cdate = cdate;
	}

	public int getCprice() {
		return cprice;
	}

	public void setCprice(int cprice) {
		this.cprice = cprice;
	}

	public String getCcontent() {
		return ccontent;
	}

	public void setCcontent(String ccontent) {
		this.ccontent = ccontent;
	} 
	
	
    
    
}
