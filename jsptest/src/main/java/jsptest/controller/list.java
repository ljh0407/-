package jsptest.controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import jsptest.model.Dao.BoardDao;
import jsptest.model.Dto.BoardDto;

/**
 * Servlet implementation class list
 */
@WebServlet("/list")
public class list extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		BoardDao Dao = new BoardDao();
		ArrayList<BoardDto> list = Dao.getlist();
		JSONArray array = new JSONArray();
		for( int i = 0 ; i<list.size() ; i++ ) { // json 형 변환
		BoardDto d = list.get(i);
		JSONObject object = new JSONObject();
		object.put( "bno" , d.getBno() ); 			object.put( "btitle", d.getBtitle() );
		object.put( "bcontent", d.getBcontent() ); 	object.put( "bwrite", d.getBwrite() );
		object.put( "bpassword", d.getBpassword() );object.put( "bdate", d.getBdate() );
		object.put( "bview", d.getBview() );
		array.add(object);
		}
		response.setCharacterEncoding("UTF-8"); 
		response.getWriter().print( array );
	
	
	
	}
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public list() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
