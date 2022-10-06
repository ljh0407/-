package controller.member;

import java.io.IOException;
import java.util.Scanner;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.eclipse.jdt.internal.compiler.ast.SuperReference;

import model.dao.MemberDao;
import model.dto.MemberDto;

@WebServlet("/signup")
public class signup extends HttpServlet {
	private static final long serialVersionUID = 1L;

   

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		// 1. 입력
		/*
		 * Scanner scanner = new Scanner(System.in); System.out.println("아이디 : ");
		 * String id = scanner.next(); System.out.println("비밀번호 : "); String pw =
		 * scanner.next(); System.out.println("이름 : "); String name = scanner.next();
		 * System.out.println("연락처 : "); String phone = scanner.next();
		 */
		
		// ** 전송받은 변수를 요청하기
		String id = request.getParameter("id");
		String pw = request.getParameter("pw");
		String name = request.getParameter("name");
		String phone = request.getParameter("phone"); // getParameter 변수 호출??
		
		// 2. 입력받은 변수 4개를 DAO 이동하자 [ 변수4개 vs DTO 1개 vs 컬렉션프레임워크 ]
			// 1.변수 4개 -> dto 객체화 
		MemberDto dto = new MemberDto(id, pw, name, phone);
			// 2. 테스트 [ 객체 필드 정보 확인 ]
		System.out.println(dto.toString() );
			// 3. Dao 싱글톤 객체 호춝 한 다음 메소드 호출
		boolean result = MemberDao.getInstance().signup(dto);
		if( result ) {System.out.println("회원가입 성공");}
		else {System.out.println("회원가입 실패");}
		
		

	
		response.getWriter().append("Served at: ").append(request.getContextPath());}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
