package controller.product;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import model.dao.MemberDao;
import model.dao.ProductDao;

/**
 * Servlet implementation class cart
 */
@WebServlet("/product/cart")
public class cart extends HttpServlet {
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		// 요청 
		request.setCharacterEncoding("UTF-8");
		String data = request.getParameter("data");
		int pno = Integer.parseInt(request.getParameter("pno"));
		
		int mno = MemberDao.getInstance().getMno((String)request.getSession().getAttribute("mid") ) ;
		// 문자열 ---> JSON 형 변환
			// 1. string -> JSON 
		try {
		JSONParser parser = new JSONParser(); 	// 1. JSONparser 객체생성
		JSONArray array = (JSONArray)parser.parse(data);	// 2. parser.parse( 문자열 )
		// 3. 반복문
		for(int i = 0 ; i<array.size() ; i++) {
			JSONObject object = (JSONObject)array.get(i); // 순서대로 객체 꺼내기
			System.out.println(object.toString());
			System.out.println("psize");
			System.out.println("amount");
			System.out.println("pcolor");
			
			// db처리	 // json객체.get("키") => 값 호출	// 재고번호												// json리스트객체.get(인덱스) => 해당
			String psize = (String)object.get("psize"); System.out.println(psize);
			int amount = Integer.parseInt(String.valueOf(object.get("amount") )) ;	System.out.println(amount);
			String pcolor = (String)object.get("pcolor");	System.out.println(pcolor);
		//	boolean result = new ProductDao().setcart(pno , psize , amount , pcolor , mno );		
				// 응답 [ 만약에
		//	if(result == false) {response.getWriter().print(result); return;}
		}
		
		}catch (Exception e) {System.out.println("json으로 변환 실패 :"+e);}
		
		
		// 응답
		response.setCharacterEncoding("UTF-8");
		response.getWriter().print("true"); // 옵션들을 모두 저장했을경우
	}
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public cart() {
        super();
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

/*
 	JSON						강제형변환
  		"문자" : 문자열 string		(String) -----> O 	[ 클래스가 동일하니까 ]
  		숫자 : Long 				(String) -----> X	메소드 이용 [ String.valueOf( ) ] 
  
  
 * */

