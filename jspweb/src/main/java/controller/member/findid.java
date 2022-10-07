package controller.member;

import java.io.IOException;
import java.sql.ResultSet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.dao.MemberDao;

@WebServlet("/member/findid")
public class findid extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public findid() {
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		// 1. 변수 요청
		request.setCharacterEncoding("UTF-8");
		String mname = request.getParameter("mname");
		String memail = request.getParameter("memail");
		
		// 2. DB처리
		String result = MemberDao.getInstance().findid(mname,memail);
		// 3. 응답
		response.getWriter().print( result );
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
