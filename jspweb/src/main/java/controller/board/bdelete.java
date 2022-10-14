package controller.board;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.dao.BoardDao;

@WebServlet("/board/bdelete")
public class bdelete extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public bdelete() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// 1. 사제할 번호 요청
		int bno = Integer.parseInt(request.getParameter("bno") );
		// 2. dao처리
		boolean result =
				BoardDao.getInstance().delete(bno);
		// 3. 결과 응답 
		response.getWriter().print(result);
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
