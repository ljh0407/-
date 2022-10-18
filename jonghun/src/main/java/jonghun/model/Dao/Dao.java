package jonghun.model.Dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Dao {

	Connection con;
	PreparedStatement ps;
	ResultSet rs;
	
	public Dao() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");  // mysql 드라이버 이름
			con = DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/escaperoom",
					"root",
					"1234");
			System.out.println("DB 연동 성공");
		} catch (Exception e) {System.out.println(e);}
	}
	
	
}
