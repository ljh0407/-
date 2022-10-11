package controller.member;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import model.dao.boardDao;
import model.dto.boardDto;

@WebServlet("/boardlist")
public class boardlist extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public boardlist() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		ArrayList<boardDto> list =
				boardDao.getInstance().getboardlist();
		JSONArray array = new JSONArray();
		for(boardDto dto : list) {
			// JSONObjcet 생성
			JSONObject object = new JSONObject();
			object.put("bno", dto.getBno() );
			object.put("btitle", dto.getBtitle() );
			object.put("bcontent", dto.getBcontent() );
			object.put("bwriter", dto.getBwriter() );
			object.put("bdate", dto.getBdate() );
			object.put("bview", dto.getBview() );
			array.add(object); // JSONObject 객체를 리스트에 담기
		}
		
		response.setCharacterEncoding("UTF-8");
		response.getWriter().print(array);
		
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
