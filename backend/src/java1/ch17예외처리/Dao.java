package java1.ch17예외처리;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import DATABAES.ch3기본문법.DAO;
import java1.키오스크.관리자.AdminDAO;

public class Dao {

	// 필드
	private Connection con;			// Connection 			: db연동 인터페이스
	private PreparedStatement ps;	// PreparedStatement 	: sql연동/조작 인터페이스
	private ResultSet rs;			// ResultSet			: sql결과[쿼리] 조작 인터페이스
	private static Dao dao = new Dao();  // 싱글톤 DAO 객체 [ 1. 생성자를 private , 2. static 정적객체 ]
	public static Dao getInStance() {return dao;}
	// 생성자
	private Dao() {
		try {
		con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mmth","root","1234");
		}catch (Exception e) {System.out.println(e);}
		}
	
		
	// 메소드
	public void signup() throws SQLException{
		String sql = "insert into menu values( null , ? )";
			ps = con.prepareStatement(sql);// 1. sql 작성
			ps.setString(1, "과자");
			int result = ps.executeUpdate();
	}
			
	public void login() throws SQLException{
		String sql = "";
		ps = con.prepareStatement(sql);
		ps.executeQuery();
		
	}
		
			
		
			
	
	
	
}
