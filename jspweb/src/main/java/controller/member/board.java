package controller.member;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.json.simple.JSONObject;

import model.dao.boardDao;
import model.dto.boardDto;

@WebServlet("/member/board")
public class board extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public board() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.getWriter().append("Served at: ").append(request.getContextPath());
		
		//1. 요청
		//2. db
		
		
		String btitle = request.getParameter("btitle");
		String bcontent = request.getParameter("bcontent");
		String bwriter = request.getParameter("bwriter");
		String bpassword = request.getParameter("bpassword");
		
		boardDto dto = new boardDto(
				0,btitle,bcontent,
				bwriter,bpassword,
				null,0);
		System.out.println(dto.toString());
		boardDao dao = new boardDao();
		boolean result = boardDao.getInstance().noticeboard(dto);
		
		
		
		if(result) {response.sendRedirect("/jspweb/member/board2.jsp");}
		else {System.out.println("등록실패");}
		response.setCharacterEncoding("UTF-8");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
