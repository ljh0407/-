package model.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

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
	// 글등록	
	public boolean board( 
			String btitle , String bcontent,
			String bwriter , String bpassword){
		String sql = "insert into board ( btitle , bcontent , bwriter , bpassword)"
				+ " values(?,?,?,?)";
		try {
			ps = con.prepareStatement(sql);
			ps.setString(1, btitle);
			ps.setString(2, bcontent);
			ps.setString(3, bwriter);
			ps.setString(4, bpassword);
			ps.executeUpdate(); return true;
		} catch (Exception e) {System.out.println(e);}return false;
	}
	
	// 글 출력
	
	public JSONArray blist() {
		JSONArray array = new JSONArray();
		String sql = "select * from board";
		try {
			ps = con.prepareStatement(sql);
			rs = ps.executeQuery();
			while(rs.next() ) {
				JSONObject object = new JSONObject();
				object.put("bno", rs.getInt(1) );
				object.put("btitle", rs.getString(2) );
				object.put("bcontent", rs.getString(3) );
				object.put("bwriter", rs.getString(4) );
				object.put("bdate", rs.getString(6) ); 
				object.put("bview", rs.getInt(7) );
				array.add(object);
			}return array;
		} catch (Exception e) {System.out.println(e);}
		return array;
	}
	
	// 조회수
	public boolean bview(int bno) {
		String sql = "update board set bview = bview +1 where bno = "+bno;
		try {
			ps = con.prepareStatement(sql);
			int count = ps.executeUpdate(); return true;
		} catch (Exception e) {System.out.println(e);}return false;
	}
}
