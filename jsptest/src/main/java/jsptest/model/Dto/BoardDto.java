package jsptest.model.Dto;

public class BoardDto {

	private int bno; 
    private String btitle; 
    private String bcontent; 
    private String bwrite; 
    private String bpassword; 
    private String bdate; 
    private int bview;
    
	public BoardDto(int bno, String btitle, String bcontent, String bwrite, String bpassword, String bdate, int bview) {
		super();
		this.bno = bno;
		this.btitle = btitle;
		this.bcontent = bcontent;
		this.bwrite = bwrite;
		this.bpassword = bpassword;
		this.bdate = bdate;
		this.bview = bview;
	}

	public int getBno() {return bno;}

	public void setBno(int bno) {this.bno = bno;}

	public String getBtitle() {return btitle;}

	public void setBtitle(String btitle) {this.btitle = btitle;}

	public String getBcontent() {return bcontent;}

	public void setBcontent(String bcontent) {this.bcontent = bcontent;}

	public String getBwrite() {return bwrite;}

	public void setBwrite(String bwrite) {this.bwrite = bwrite;}

	public String getBpassword() {return bpassword;}

	public void setBpassword(String bpassword) {
		this.bpassword = bpassword;
	}

	public String getBdate() {return bdate;}

	public void setBdate(String bdate) {this.bdate = bdate;}

	public int getBview() {return bview;}

	public void setBview(int bview) {this.bview = bview;}

	@Override
	public String toString() {
		return "BoardDto [bno=" + bno + ", btitle=" + btitle + ", bcontent=" + bcontent + ", bwrite=" + bwrite
				+ ", bpassword=" + bpassword + ", bdate=" + bdate + ", bview=" + bview + ", getBno()=" + getBno()
				+ ", getBtitle()=" + getBtitle() + ", getBcontent()=" + getBcontent() + ", getBwrite()=" + getBwrite()
				+ ", getBpassword()=" + getBpassword() + ", getBdate()=" + getBdate() + ", getBview()=" + getBview()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	} 
    
	
	
}
