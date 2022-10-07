package model.dao;

import javax.swing.LookAndFeel;

import model.dto.MemberDto;

public class MemberDao extends Dao {

	// 0. 싱글톤 객체 선언 [ 공유 메모리 ]
	private static MemberDao mdao = new MemberDao();
	public static MemberDao getInstance() {return mdao;}
	
	// 기능 메소드 구현
	// 1. 회원가입 메소드
	public boolean signup(MemberDto dto) {
		String sql = "insert into "
				+ "member(mid,mpassword,mname,mphone,memail,maddress)"
				+ "values(?,?,?,?,?,?)";
		try {
			ps = con.prepareStatement(sql);
			ps.setString( 1 , dto.getMid() );
			ps.setString( 2 , dto.getMpassword() );
			ps.setString( 3 , dto.getMname() );
			ps.setString( 4 , dto.getMphone() );
			ps.setString( 5 , dto.getMemail() );
			ps.setString( 6 , dto.getMaddress() );
			ps.executeUpdate(); return true;
		} catch (Exception e) {System.out.println(e);}
		return false;
	}
	
	// 2. 로그인 메소드
	public int login(String id, String passowrd) {
		String sql = " select * from member where mid = ?"; // 아이디 검증
		try {
			ps = con.prepareStatement(sql);
			ps.setString(1, id);
			rs = ps.executeQuery();
			if(rs.next()) {
				sql = " select * from member where"
						+ " mid = ? and mpassword = ?";
				ps = con.prepareStatement(sql);
				ps.setString(1, rs.getString(2)); // 첫번째 select 찾은 데이터를 첫번째 ? 대입
				ps.setString(2, passowrd);
				rs = ps.executeQuery();
				if(rs.next()) {return 1;} //로그인 성공 뜻
				return 2; // 패스워드가 틀렸다는 뜻
			}
		} catch (Exception e) {System.out.println(e); return 3; // 데이터베이스 오류뜻
		}return 0; // 아이디 없다는뜻
	}
		
	// 3. 아이디찾기
	public String findid(String mname , String memail) {
		String sql = "select * from member "
				+ "where mname=? and memail =?";
		try {
			ps = con.prepareStatement(sql);
			ps.setString(1, mname);
			ps.setString(2, memail);
			rs = ps.executeQuery();
			// 만일 동일한 정보가 있으면 찾은 레코드의 아이디 반환
			if(rs.next() )return rs.getString(2);
		} catch (Exception e) {System.out.println(e);
		}return null; // 동일한 정보가 없으면 null
				
	}
	
	// 4. 비밀번호 찾기 [ 임시 비밀번호 발급 여부 판단 ]
	public boolean findpassword(String mid , String mamail) {
		String sql = "select * from member where mid =? and memail = ?";
		try {
			ps = con.prepareStatement(sql);
			ps.setString(1, mid);
			ps.setString(2, mamail);
			rs = ps.executeQuery();
			if(rs.next() )return true;
		} catch (Exception e) {System.out.println(e);
		}return false;
	}
	
	// 5. 임시 비밀번호 업데이트
	public boolean passwordchange(String mid , String randstr) {
		String sql = "update member set mpassword =?"
				+ " where mid =?";
		try {
			ps = con.prepareStatement(sql);
			ps.setString(1, randstr);
			ps.setString(2, mid);
			ps.executeUpdate(); return true;
		} catch (Exception e) {System.out.println(e);
		}return false;
		
	}
	
	
	
}
