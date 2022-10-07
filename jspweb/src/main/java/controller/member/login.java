package controller.member;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.dao.MemberDao;

@WebServlet("/member/login") // URL 정의 : 해당 클래스로 들어올수 있는 경로 선언 [ 매핑 ]
public class login extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public login() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		// 1. js ajax 에게 변수 요청
		String mid = request.getParameter("mid");
		String mpassword = request.getParameter("mpassword");
		// 2. dao db 메소드 호출
		int result = MemberDao.getInstance().login(mid, mpassword);
		// 3. db 메소드 반환 결과를 js ajax에게 응답
		response.getWriter().print(result);
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
		// 1. form내 input 태그로 부터 변수 요청 
		String mid = request.getParameter("mid");
		String mpassword = request.getParameter("mpassword");
		
		// 2. 변수2개 --> dto x
		// 3. dao 메소드 호출 [싱글톤]
		/*
		 * int result = MemberDao.getInstance().login(mid, mpassword); // 4. 결과제어 [
		 * true이면 index.jsp false이면 login.jsp ] if(result) {
		 * response.sendRedirect("/jspweb/index.jsp");} else {
		 * response.sendRedirect("/jspweb/member/login.jsp");}
		 */
		
	}

}
