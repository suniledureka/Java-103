var xhr;

function getEmployeeDetails(eno){
	xhr = new XMLHttpRequest();
	xhr.open("GET", "search?empno="+eno, true);	
	xhr.onreadystatechange = handleStateChange;
	xhr.send();
}

function handleStateChange(){
	var ename = "NO MATCH";
	var esal = "NO MATCH";
	
	if(xhr.readyState==4 && xhr.status==200){
	  	var text = xhr.responseText;
	  	if(text.length > 2){
			  var empJson = JSON.parse(text);
			  ename = empJson.employeename;
			  esal = empJson.employeesal;
		  }	
	}
	document.getElementById("empname").innerText=ename;
	document.getElementById("empsal").innerText=esal;
} 