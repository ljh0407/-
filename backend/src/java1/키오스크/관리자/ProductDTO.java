package java1.키오스크.관리자;

public class ProductDTO {

	// 1.필드 [ table 필드와 동일하게 ]
	private int pno;
	private String pname;
	private int pprice;
	private String pcommnet;
	private short pamount;
	private byte mno;
	// 2. 생성자
	public ProductDTO(int pno, String pname, int pprice, String pcommnet, short pamount, byte mno) {
		super();
		this.pno = pno;
		this.pname = pname;
		this.pprice = pprice;
		this.pcommnet = pcommnet;
		this.pamount = pamount;
		this.mno = mno;
	}
	public int getPno() {
		return pno;
	}
	public void setPno(int pno) {
		this.pno = pno;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public int getPprice() {
		return pprice;
	}
	public void setPprice(int pprice) {
		this.pprice = pprice;
	}
	public String getPcommnet() {
		return pcommnet;
	}
	public void setPcommnet(String pcommnet) {
		this.pcommnet = pcommnet;
	}
	public short getPamount() {
		return pamount;
	}
	public void setPamount(short pamount) {
		this.pamount = pamount;
	}
	public byte getMno() {
		return mno;
	}
	public void setMno(byte mno) {
		this.mno = mno;
	}
	

	
	
	
	
}
