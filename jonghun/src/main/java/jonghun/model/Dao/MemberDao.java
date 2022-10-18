package jonghun.model.Dao;

import jonghun.model.Dto.MemberDto;

public class MemberDao extends Dao {

	private static MemberDao mdao = new MemberDao();
	public static MemberDao getInstance() { return mdao; }
	
	// 회원가입
	
	public boolean signup(String mid , String mpw , String mname , String mphone , String memail) {
		String sql = "insert into "
				+ " member(mid, mpw, mname, mphone, memail) "
				+ " values(?,?,?,?,?)";
		
		try {
			ps = con.prepareStatement(sql);
			ps.setString(1, mid);
			ps.setString(2, mpw );
			ps.setString(3, mname);
			ps.setString(4, mphone);
			ps.setString(5, memail);
			ps.executeUpdate(); return true;
		} catch (Exception e) {System.out.println(e);}return false;
	}
	
	
}
