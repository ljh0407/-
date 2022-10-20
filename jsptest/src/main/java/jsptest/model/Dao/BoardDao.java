package jsptest.model.Dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import jsptest.model.Dto.BoardDto;

public class BoardDao {


	Connection con;	PreparedStatement ps;	ResultSet rs;
	
	
	public BoardDao() {
	try {
	Class.forName("com.mysql.cj.jdbc.Driver");
	con = DriverManager.getConnection(
	"jdbc:mysql://localhost:3306/jsptest",
	"root",
	"1234");
	}catch (Exception e) { System.out.println(e);}
	}
    // 1 글쓰기
	public boolean bwrite(BoardDto dto) {
		String sql = "insert into board(btitle, bcontent, bwrite, bpassword )"
				+ "values(? ,? ,? ,?)";
		try {
			ps = con.prepareStatement(sql);
			ps.setString(1, dto.getBtitle());
			ps.setString(2, dto.getBcontent());
			ps.setString(3, dto.getBwrite());
			ps.setString(4, dto.getBpassword());
			ps.executeUpdate(); return true;
		} catch (Exception e) {System.out.println(e);} return false;
		
	}
	
	// 2 리스트
	public ArrayList<BoardDto>getlist()  {
		ArrayList<BoardDto> list = new ArrayList();
		String sql = "select * from board";
		try {
			ps = con.prepareStatement(sql);
			rs = ps.executeQuery();
			while(rs.next() ) {
				BoardDto dto = new BoardDto( // 번호 , 제목 , 작성자 , 날짜 ,조회수
						rs.getInt(1), rs.getString(2), 
						rs.getString(3), rs.getString(4), 
						rs.getString(5), rs.getString(6), rs.getInt(7));
					list.add(dto);
				
			}
		} catch (Exception e) {System.out.println(e);}return list;
	}
	
	// 3. 글보기
	public BoardDto getboard( int bno ) {
		String sql ="select * from board where bno="+bno;
		try {
			ps = con.prepareStatement(sql);
			rs = ps.executeQuery();
			if( rs.next() ) {
				BoardDto boardDto = new BoardDto(
						rs.getInt(1), rs.getString(2),
						rs.getString(3), rs.getString(4),
						rs.getString(5), rs.getString(6),
						rs.getInt(7));
				return boardDto;
			}
		}catch (Exception e) {System.out.println(e);}
		return null;
	}
	
	
}
