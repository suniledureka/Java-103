<%@page isErrorPage="true"%>
<p style="color:red;font-size:22px;">
<%
 if(exception instanceof ArithmeticException)
	 out.println("Error ---> " + exception.toString());
 else if(exception instanceof ArrayIndexOutOfBoundsException)
	 out.println("Invalid Array Index -> " + exception.getMessage());
 else
	 out.println("Internal Server Error --- Please try again!!!");
%>
</p>