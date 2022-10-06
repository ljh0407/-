package model.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import model.dto.boardDto;

public class boardDao {
	// 싱글톤
	private static boardDao bdao = new boardDao();
	public static boardDao getInstance() {return bdao;}
	
	Connection con;
	PreparedStatement ps;
	ResultSet rs;
	
	public boardDao() {
	try {
		Class.forName("com.mysql.cj.jdbc.Driver");  // mysql 드라이버 이름
		con = DriverManager.getConnection(
				"jdbc:mysql://localhost:3306/noticeboard",
				"root",
				"1234");
		System.out.println("DB 연동 성공");
	} catch (Exception e) {System.out.println(e);}
	}
		
	
	public boolean noticeboard(boardDto dto) {
		String sql = "insert into board (btitle,bcontent,bwriter,bpassword)"
				+ " values(?,?,?,?)";
		try {
			ps = con.prepareStatement(sql);
			ps.setString(1, dto.getBtitle());
			ps.setString(2, dto.getBcontent());
			ps.setString(3, dto.getBwriter());
			ps.setString(4, dto.getBpassword());
			ps.executeUpdate();return true;
		} catch (Exception e) {System.out.println(e);}
		return false;
	
	}
	
}
