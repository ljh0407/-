package model.dto;

import model.dao.Dao;

public class MemberDto  {

	
	private int mno;					
	private String mid;			
	private String mpassword;								
	private String mname;						
	private String mphone;									
	private String memail;		
	private String maddress;
	private String mdete;		
	private int mpoint;
	   
	   
	public MemberDto(int mno, String mid, String mpassword, String mname, String mphone, String memail, String maddress,
			String mdete, int mpoint) {
		super();
		this.mno = mno;
		this.mid = mid;
		this.mpassword = mpassword;
		this.mname = mname;
		this.mphone = mphone;
		this.memail = memail;
		this.maddress = maddress;
		this.mdete = mdete;
		this.mpoint = mpoint;
	}


	public int getMno() {
		return mno;
	}


	public void setMno(int mno) {
		this.mno = mno;
	}


	public String getMid() {
		return mid;
	}


	public void setMid(String mid) {
		this.mid = mid;
	}


	public String getMpassword() {
		return mpassword;
	}


	public void setMpassword(String mpassword) {
		this.mpassword = mpassword;
	}


	public String getMname() {
		return mname;
	}


	public void setMname(String mname) {
		this.mname = mname;
	}


	public String getMphone() {
		return mphone;
	}


	public void setMphone(String mphone) {
		this.mphone = mphone;
	}


	public String getMemail() {
		return memail;
	}


	public void setMemail(String memail) {
		this.memail = memail;
	}


	public String getMaddress() {
		return maddress;
	}


	public void setMaddress(String maddress) {
		this.maddress = maddress;
	}


	public String getMdete() {
		return mdete;
	}


	public void setMdete(String mdete) {
		this.mdete = mdete;
	}


	public int getMpoint() {
		return mpoint;
	}


	public void setMpoint(int mpoint) {
		this.mpoint = mpoint;
	}
   
}