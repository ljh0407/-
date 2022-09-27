package 타자연습게임;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class 타자게임DAO {
	
	// 필드
	private Connection con; 
	private PreparedStatement ps;
	private ResultSet rs;
	private static 타자게임DAO dao = new 타자게임DAO();
	
	
	
	
	
	// 생성자
	
	
	public 타자게임DAO() {
		try {
		con = DriverManager.getConnection(
				"jdbc:mysql://localhost:3306/typing_game",
				"root" , "1234");
			
		} catch (Exception e) { System.out.println("DB 오류 : "+e);}
	}
	// 메소드
	public static 타자게임DAO getInstance() {return dao;}
	
	// 1. 회원가입
	 boolean sginup(회원가입DTO dto){
		String sql = " insert into member values( null, ? , ? , ? , ? )";
		try {
			ps = con.prepareStatement(sql);
			ps.setString(1, dto.getMid() );
			ps.setString(2, dto.getPw() );
			ps.setString(3, dto.getMname() );
			ps.setString(4, dto.getMnn() );
			ps.executeUpdate(); return true;
		} catch (Exception e) {
			System.out.println("DB 오류 : "+e);
		}return false;
	}
		
	// 회원가입 출력
	 public void 회원가입DTO(){
	 String sql = " select * from member";
	 try {
		ps = con.prepareStatement(sql);
		rs = ps.executeQuery();
		
		while(rs.next() ) {
			회원가입DTO dto = new 회원가입DTO(
					rs.getInt(1), rs.getString(2),
					rs.getString(3), rs.getString(4),
					rs.getString(5));
		}
	} catch (Exception e) {}
	 
	 
	 }
	
		
		
	}
	
	
	
	

