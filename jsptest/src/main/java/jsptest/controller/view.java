package jsptest.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.json.simple.JSONObject;

import jsptest.model.Dao.BoardDao;
import jsptest.model.Dto.BoardDto;

@WebServlet("/view")
public class view extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String type = request.getParameter("type");
		if( type.equals("load") ) {
		int bno = Integer.parseInt( request.getParameter("bno" ) );
		request.getSession().setAttribute("bno" , bno );
		return;
		}else if( type.equals("get") ) {
		int bno = (Integer)request.getSession().getAttribute("bno");
		BoardDao Dao = new BoardDao();
		BoardDto dto =  Dao.getboard( bno );
		if( dto == null ) {  return; }
		JSONObject object = new JSONObject();
		object.put( "bno" , dto.getBno() ); 			
		object.put( "btitle", dto.getBtitle() );
		object.put( "bcontent", dto.getBcontent() ); 	
		object.put( "bwrite", dto.getBwrite() );
		object.put( "bpassword", dto.getBpassword() );
		object.put( "bdate", dto.getBdate() );
		object.put( "bview", dto.getBview() );
		response.getWriter().print( object );
		}
		
	}
       
    public view() {
        super();
    }


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
