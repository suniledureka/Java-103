<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>account</title>
</head>
<body>
<jsp:useBean class="co.edureka.web.models.Account" id="acc"></jsp:useBean>
<jsp:setProperty name="acc" property="*"/>

<h2>
A/C No: <jsp:getProperty name="acc" property="accountNo"/> <br>
Name: <jsp:getProperty name="acc" property="accountName"/> <br>
Balance: <jsp:getProperty name="acc" property="accountBal"/> <br>


</h2>
</body>
</html>