package model.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

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
		
	// 글 등록
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

	
	public boardDto getboard(String bwriter) {
		boardDto dto = null;
		String sql = "select * from board where bwriter = ?";
		try {
			ps = con.prepareStatement(sql);
			ps.setString(1, bwriter);
			rs = ps.executeQuery();
			if(rs.next() ) {
				dto = new boardDto(
						rs.getInt(1),rs.getString(2),
						rs.getString(3),rs.getString(4),null,
						rs.getString(6),rs.getInt(7));
				return dto;
			}
		} catch (Exception e) {System.out.println(e);
		}return dto;
	}
	
	// 모든 게시글 출력
	public ArrayList<boardDto> getboardlist() {
		ArrayList<boardDto> list = new ArrayList<>();
		String sql = "select * from board";
		try {
			ps = con.prepareStatement(sql);
			rs = ps.executeQuery();
			while(rs.next() ) {
				boardDto dto = new boardDto(
						rs.getInt(1) , rs.getString(2),
						rs.getString(3),rs.getString(4),null,
						rs.getString(6),rs.getInt(7)
						);
				list.add(dto);
			}
			return list;
		} catch (Exception e) {System.out.println(e);}
		return list;
	}
	
}
