package co.edureka.web;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class WelcomeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		out.println("<body style=\"background-color:lightgreen; text-align:center\">");
		out.println("<h1>edureka limited</h1>");
		out.println("<img src=images/edureka.png width=300px>");
		out.println("<hr/>");
		out.println("<p style=text-align:left;font-size:18px>Hello " + request.getParameter("txt_uid")+"</p>");
		out.println("</body>");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
