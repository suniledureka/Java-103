<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Expression Language</title>
</head>
<body>
 <%
   out.println("user name = " + request.getParameter("txt_uid"));
 %>
 <br>
 user name = ${param.txt_uid}
 <hr>
 <%
   out.println("user name = " + request.getParameter("txt_uidd"));
 %>
 <br>
  user name = ${param.txt_uidd}
</body>
</html>