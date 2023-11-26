<%!
 String uname;
 String pass;
%>
<h2>
<%
 uname = request.getParameter("txt_uid");
 pass = request.getParameter("txt_pwd");
 
 out.println("user name = " + uname + "<br>");
 out.println("password = " + pass);
%>
</h2>
<hr>
<h2>
server name = <%=request.getServerName() %> <br>
server port = <%=request.getServerPort() %> <br>
method = <%=request.getMethod() %> <br>
protocol = <%=request.getProtocol() %><br>
content type = <%=request.getContentType() %><br>
application = <%=request.getContextPath() %>
</h2>