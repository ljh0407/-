package jonghun.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import jonghun.model.Dao.MemberDao;
import jonghun.model.Dto.MemberDto;

/**
 * Servlet implementation class signup
 */
@WebServlet("/signup")
public class signup extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// 요청
		String mid = request.getParameter("mid");
		String mpw = request.getParameter("mpw");
		String mname = request.getParameter("mname");
		String mphone = request.getParameter("mphone");
		String memail = request.getParameter("memail");
		
		System.out.println(mid);
		System.out.println(mpw);
		System.out.println(mname);
		System.out.println(mphone);
		System.out.println(memail);
		// Dao 처리
		
		MemberDto dto = new MemberDto(0, mid, mpw, mname, mphone, memail);
		
		boolean result = MemberDao.getInstance().signup(
				mid, mpw, mname, mphone, memail);
		
		// 응답
		response.getWriter().print(result);
		
		
	}
    public signup() {
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}


}
