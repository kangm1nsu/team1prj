package imp;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import controller.Action;
import dao.AdminDao;

public class AdminActionLogin implements Action {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String admin_id  =  request.getParameter("admin_id");
		String admin_pwd =  request.getParameter("admin_pwd");
		PrintWriter out = response.getWriter();
		
		AdminDao adminDao = new AdminDao();
		int yn = adminDao.getLogin(admin_id, admin_pwd);
		if (yn == 1) {
			HttpSession session = request.getSession();
			session.setAttribute("admin_id", admin_id);
			out.print("<script>alret('로그인성공');location.href='/view/main.jsp';</script>");
		} else if( yn == 0 ){
			out.print("<script>alret('로그인실패');location.href='/view/main.jsp';</script>");
		} else {
			
		}
		String path = "/view/main.jsp";
		
		
	}

}
