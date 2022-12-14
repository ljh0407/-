package controller.board;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.nio.Buffer;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class api
 */
@WebServlet("/board/api")
public class api extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		// 1. 공공데이터 포털 사용 [ 안산시 약국 ]
			// 자바에서 해당 URL를 객체화 하기 [ URL 클래스 - java.net패키지 ]
		URL url = new URL("https://api.odcloud.kr/api/3035882/v1/uddi:5fae3cf5-bc15-4eba-87d8-8289b74e659b_201912202015?page=1&perPage=292&serviceKey=CGAPP%2FvIJNiFl35srYjO%2BSIId43BbRZlQKcUHX2EJnT%2F0325x784bT5rUR6JkR2Lw3%2FecxA7ccQ7uJHIRYyZJA%3D%3D");
																														// page : 현재페이지 번호 // perpage : 페이지당 데이터 수 
		// 2. 해당 URL 바이트[스트림] 읽어오기
		BufferedReader bf = new BufferedReader( new InputStreamReader(url.openStream() , "UTF-8") );
		
		// 3. 읽어오기
		String result = bf.readLine(); // 모두 읽어오기
		
		// 4. 응답
		response.setCharacterEncoding("UTF-8"); // 한글 인코딩
		response.getWriter().print(result);
		
	}
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public api() {
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
