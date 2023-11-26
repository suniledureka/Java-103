<%!
  String cname = "edureka limited"; //instance variable
  
  public int add(int x, int y){
	  return x+y;
  }
%>
<h2>
<%
 out.println("My company name = " + cname + "<br><br>");
 out.println("sum = " + add(10, 23));
%>
</h2>