package DATABAES.java연동;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class JDBC실행2 {

	public static void main(String[] args) {
		
		
		
		try { // 만일 try 괄호 안에서 예외[오류]가 발생하면 catch로 코드흐름이 이동
			  // 예외가 없으면 try 괄호만 정상실행
		Class.forName("com.mysql.cj.jdbc.Driver");  // mysql 드라이버 이름
		// 1. DB 연동
		Connection con = DriverManager.getConnection(
				"jdbc:mysql://localhost:3306/shop_db3",
				"root",
				"1234");
		System.out.println("DB 연동 성공");
		// 2. SQL 작성
		/*
		// 바나나
		String sql = "insert into product values('바나나',1500,'2021-07-01','델몬트',17)";
		// 3. SQL 조작[연결]
		PreparedStatement ps = con.prepareStatement(sql);
		// 4. SQL 실행
		ps.executeUpdate();
		// 삼각김밥
		sql = "insert into product values('삼각김밥',800,'2023-09-01','CJ',22)";
		ps = con.prepareStatement(sql);
		ps.executeUpdate();
		// 카스
		sql = "insert into product values('카스',2500,'2022-03-01','OB',3)";
		ps = con.prepareStatement(sql);
		ps.executeUpdate();
		*/
		// 1. 카스의 재고수량을 10로 수정
		String sql = "updete product set amount = 10 where product_name = '카스'";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.executeUpdate();
		// 2. 삼각김밥제거
		sql = "delete form product where product_name = '삼각김밥'";	
		ps = con.prepareStatement(sql);
		ps.executeUpdate();
		// 3. 모든 제품의 정보를 콘솔출력
		
		String sql1 = "select * from product";
		PreparedStatement ps1 = con.prepareStatement(sql1);
		ResultSet rs = ps1.executeQuery(); // 쿼리 [ SQL 결과 ]
		
		while( rs.next() ) { // while (조건) : 조건이 true 이면 반복문 실행
			// rs.next() : 다음 레코드로 이동
			System.out.print("품목 : " + rs.getString(1) +"\t");
			System.out.print("가격 : " + rs.getString(2) +"\t");
			System.out.print("날짜 : " + rs.getString(3) +"\t");
			System.out.print("제조사 : " + rs.getString(4) +"\t");
			System.out.print("수량 : " + rs.getString(5) +"\n");
		}
		
		
	}catch( Exception e ) {System.out.println("연동 실패 : " + e ); }
	
	}
}