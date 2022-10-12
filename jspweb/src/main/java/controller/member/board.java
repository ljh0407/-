package controller.member;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.json.simple.JSONObject;

import model.dao.Dao;
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
		// 글등록
		// 1. 요청
		request.setCharacterEncoding("UTF-8"); // 한글 인코딩
		String btitle = request.getParameter("btitle");
		String bcontent = request.getParameter("bcontent");
		String bwriter = request.getParameter("bwriter");
		String bpassword = request.getParameter("bpassword");
		// 2. db처리
		boardDao dao = new boardDao();
		// 3. 결과제어
		boolean result = 
				dao.board(btitle, bcontent, bwriter, bpassword);
		response.getWriter().print(result);
		
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
