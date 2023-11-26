<%@page import="java.util.Date, java.sql.*" info="JSP page Directive Example" language="java" %>
<%!
 Date today;
%>
<h2 style="text-align:center;color:blue">
<%
 today = new Date();
 out.println(today + "<br><br>");
 out.println(getServletInfo());
%>
</h2>