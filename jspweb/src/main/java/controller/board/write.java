package controller.board;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.dao.BaordDao;
import model.dao.MemberDao;

@WebServlet("/board/write")
public class write extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public write() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String mid = (String)request.getSession().getAttribute("mid");
		int mno = MemberDao.getInstance().getBno(mid);
		
		String btitle = request.getParameter("btitle");
		String bcontent = request.getParameter("bcontent");
		
		
		System.out.println(btitle);
		System.out.println(bcontent);
		
		boolean result =
				BaordDao.getInstance().write(btitle , bcontent , mno);
				System.out.println(result);
			/*
			 * form 전송용 if(result) {response.sendRedirect("list.jsp");} else
			 * {response.sendRedirect("write.jsp");}
			 */
		response.getWriter().print(result);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
