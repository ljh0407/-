package jsptest.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import jsptest.model.Dao.BoardDao;
import jsptest.model.Dto.BoardDto;

/**
 * Servlet implementation class write
 */
@WebServlet("/write")
public class write extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String btitle =  request.getParameter("btitle");
		String bcontent =  request.getParameter("bcontent");
		String bwrite =  request.getParameter("bwrite");
		String bpassword =  request.getParameter("bpassword");
	
		BoardDto dto = new BoardDto(0, btitle, bcontent, 
					bwrite, bpassword, null, 0);
		
		BoardDao dao = new BoardDao();
		
		boolean result = dao.bwrite(dto);
		
		response.getWriter().print(result);
		
	}

    /**
     * Default constructor. 
     */
    public write() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */

}
