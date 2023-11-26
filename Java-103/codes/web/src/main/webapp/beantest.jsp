<jsp:useBean class="co.edureka.web.models.Account" id="acc"></jsp:useBean>
<h2>
A/C No: <jsp:getProperty name="acc" property="accountNo"/> <br>
Name: <jsp:getProperty name="acc" property="accountName"/> <br>
Balance: <jsp:getProperty name="acc" property="accountBal"/> <br>
<br>
<jsp:setProperty property="accountName" name="acc" value="Sunil Joseph"/>
Name: <jsp:getProperty name="acc" property="accountName"/> <br>
</h2>