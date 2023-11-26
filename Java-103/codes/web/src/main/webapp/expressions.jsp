<%!
  String cname = "edureka limited"; //instance variable
  
  public int add(int x, int y){
	  return x+y;
  }
%>
<h2>
my company name = <%=cname %>
<br><br>
<%="Sum = " + add(10,24) %>
</h2>