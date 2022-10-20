package board.model.dao;

public class dao {

	Connection con;	
	PreparedStatement ps;	
	ResultSet rs;
	
	
	public dao() {
		
		Class.forName("com.mysql.cj.jdbc.Driver"); 
		 con = DriverManager.getConnection(
				"jdbc:mysql://localhost:8080/jsptest", 
				"root",
				"1234");
	}catch (Exception e) { System.out.println(e);}
}
public boolean bwrite( dao dao ) {
	String sql = "insert into board( btitle , bcontent , bwrite , bpassword ) "
			+ "values( ? ,? ,? ,?)";
	try {
		ps = con.prepareStatement(sql);
		ps.setString( 1 , dao.getBtitle() );
		ps.setString( 2 , dao.getBcontent() );
		ps.setString( 3 , dao.getBwrite() );
		ps.setString( 4 , dao.getBpassword() );
		ps.executeUpdate(); return true;
	}catch (Exception e) {System.out.println(e);} return false;
}
		
	}
	
}
