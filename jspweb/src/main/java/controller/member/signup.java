package controller.member;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.dao.MemberDao;
import model.dto.MemberDto;
//@WebServlet("URL정의") : 해당 클래스를 호출하는 URL 정의


@WebServlet("/member/signup") // 해당 클래스로 매핑(연결) URL 설정 [패키지 경로x] 상관없음
public class signup extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	// 1. jsp(html) form 입력받은 데이터 요청	
	String mid = request.getParameter("mid");
	String mpassword = request.getParameter("mpassword");
	String mpasswordfirm = request.getParameter("mpasswordfirm");
	String mname = request.getParameter("mname");
	String mphone = request.getParameter("mphone");
	String memail = request.getParameter("memail");
	
	// 주소4개 요청
	String maadress1 = request.getParameter("maadress1");
	String maadress2 = request.getParameter("maadress2");
	String maadress3 = request.getParameter("maadress3");
	String maadress4 = request.getParameter("maadress4");
	
	// 주소4개 --> 하나의 변수
	String maddress = maadress1+","+maadress2+","+maadress3+","+maadress4 ;
	// 2. 변수6개 ----> dto 객체화
	MemberDto dto = new MemberDto(
			0, mid, 
			mpassword,	mname, 
			mphone,memail, 
			maddress,null, 0);
	// 3. 통신확인 [html ---> java]
	System.out.println(dto.toString() );
	// 4. dao 메소드 호출용 객체 선언
		// 1. 싱글톤객체가 아닐경우
		// MemberDao dao = new MemberDao();
		// boolean result = dao.signup(dto)
		// 2. 싱글톤객체가 있을경우 [ 클래스명.get ]
	MemberDao dao = new MemberDao();
	boolean result = MemberDao.getInstance().signup(dto);
	// 5. 결과제어
	if(result) {response.sendRedirect("/jspweb/member/login.jsp");}
	else {System.out.println("오류");}
	}
	/*if(result) {System.out.println("회원가입 성공");}
	else {System.out.println("회원가입 실패");}
	
	doGet(request, response);
			
	}*/

	public signup() {
		super();
	}
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}
}
