<%
 String uid = request.getParameter("txt_uid");
 String pwd = request.getParameter("txt_pwd");
 
 if(uid.equals("admin") && pwd.equals("12345"))
	 response.sendRedirect("https://www.edureka.co");
 else
	 response.sendError(response.SC_UNAUTHORIZED, "Authentication Failed; Invalid UserName/ Password");
%>