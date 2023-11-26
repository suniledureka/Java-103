package co.edureka.web;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/form3")
public class Form3Servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String s1 = request.getParameter("t4");
		String s2 = request.getParameter("t5");		
		/*
		Cookie cook1 = new Cookie("experience", s1);
		Cookie cook2 = new Cookie("languages", s2);
		
		cook1.setMaxAge(60*60*24*30);
		
		response.addCookie(cook1);
		response.addCookie(cook2);		
		*/
		
		HttpSession session = request.getSession();
		session.setAttribute("experience", s1);
		session.setAttribute("languages", s2);
		
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		out.println("<body bgcolor=cyan>");
		out.println("<form action=form4 method=get>");
		out.println("<h2>");
		out.println("Exp Salary <input type=text name=t6 size=25> <br><br>");
		
		out.println("<input type=hidden name=t1 value=\""+s1+"\">");
		
		out.println("<input type=submit value=Submit>");
		out.println("</form>");
		out.println("</body>");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}