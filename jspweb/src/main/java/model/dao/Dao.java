package model.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Dao {

	Connection con;  		// DB연동 
	PreparedStatement ps; 	// sql 조작
	ResultSet rs;			// 쿼리조작
	
	public Dao() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/jspweb",
					"root",
					"1234");
			System.out.println("DB연동성공");
		} catch (Exception e) {System.out.println(e);}
		
	}
	
	
}
