package 개인과제;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class 가계부DAO {
	// 1. 필드
	private Connection con; 
	private PreparedStatement ps;
	private ResultSet rs;
	private static 가계부DAO dao = new 가계부DAO();	
	// 2. 생성자
	public 가계부DAO() {
		try {
		con = DriverManager.getConnection(
				"jdbc:mysql://localhost:3306/memo",
				"root" , "1234");
			
		} catch (Exception e) { System.out.println("DB 오류 : "+e);
			
		}
	}
	
	// 3. 메소드
	public static 가계부DAO getInstance() { return dao; }
	
	// 글쓰기
	boolean create( 가계부DTO dto ) {
		String sql = "insert into content values ( null , ? , ? , ? )";
		try {
			ps = con.prepareStatement(sql);
			ps.setString(1, dto.getCdate() );
			ps.setInt(2, dto.getCprice() );
			ps.setString(3, dto.getCcontent() );
			ps.executeUpdate(); return true;
		} catch (Exception e) {
			System.out.println("DB 오류 : "+e);
		}return false;
	}
	
	// 2. 내용출력 sql 메소드
	ArrayList<가계부DTO> read (){
		ArrayList<가계부DTO> list = new ArrayList<>();
		String sql = "select * from content";
		try {
			ps = con.prepareStatement(sql);
			rs = ps.executeQuery();
			
			while( rs.next() ) { // rs.next() : 다음레코드 
				// 레코드 --> 객체화[포장]
				
				가계부DTO dto = new 가계부DTO(
						rs.getInt(1), rs.getString(2), 
						rs.getInt(3), rs.getString(4));
				// 객체 -> 리스트 담기
				list.add(dto);
			}// while end
			return list;
		} catch (Exception e) {}
		return list;
			
			
	}
	
	
	
	// 4. 내용삭제 sql 메소드
	boolean delete( int cnum) {
		
		String sql = "delete from content where cnum = ?";
		try {
			ps = con.prepareStatement(sql);
			ps.setInt(1, cnum);
			ps.executeUpdate(); return true;
		} catch (Exception e) {System.out.println("DB 오류 : "+e);}
		return false;
	}
	
	// 3. 수정
	boolean update ( 가계부DTO dto ) {
		String sql = "update content set "
				+ " cdate = ? , "
				+ " cprice = ? , "
				+ " ccontent = ? "
				+ " where cnum = ?";
		try {
			ps = con.prepareStatement(sql);
			ps.setString(1, dto.getCdate());
			ps.setInt(2, dto.getCprice());
			ps.setString(3, dto.getCcontent());
			ps.setInt(4, dto.getCnum());
			ps.executeUpdate(); return true;
		} catch (Exception e) {System.out.println("DB 오류 : "+e);}
		return false;
	}
}

	