package controller.admin;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.oreilly.servlet.MultipartRequest;
import com.oreilly.servlet.multipart.DefaultFileRenamePolicy;

import model.dto.ProductDto;

/**
 * Servlet implementation class regist
 */
@WebServlet("/admin/regist")
public class regist extends HttpServlet {
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// 요청
		MultipartRequest multi = new MultipartRequest(
				request, 
				request.getSession().getServletContext().getRealPath("/admin/pimg"),
				1024*1024*10 ,
				"UTF-8",
				new DefaultFileRenamePolicy() );
		
		String pname = multi.getParameter("pname"); 		System.out.println(pname);
		String pcoment = multi.getParameter("pcoment");		System.out.println(pcoment);
		int pprice = Integer.parseInt(multi.getParameter("pprice") ) ; 	System.out.println(pprice);
		float pdiscount = Float.parseFloat(multi.getParameter("pdiscount") ) ; System.out.println(pdiscount);
		String pimg = multi.getFilesystemName("pimg");		System.out.println(pimg);
		
		ProductDto dto = new ProductDto(0, pname, pcoment, pprice, pdiscount, (byte)0,  pimg , null, 0);
		System.out.println(dto.toString());
	}
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
	}
    public regist() {
        super();
        // TODO Auto-generated constructor stub
    }


	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */

}
