package co.edureka.ems.controllers;

import java.io.IOException;
import java.io.PrintWriter;

import org.json.JSONObject;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import co.edureka.ems.dto.Employee;
import co.edureka.ems.services.EmployeeService;
import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class EmployeeSearchController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private EmployeeService  service;
	
	public void init(ServletConfig config) throws ServletException {
		ApplicationContext context = new ClassPathXmlApplicationContext("ems-beans.xml");		
		service = (EmployeeService) context.getBean("emp-service");
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {	 	
		Integer eno = Integer.parseInt(request.getParameter("empno"));
		Employee emp = service.searchEmployeeByNo(eno);
		
		PrintWriter out = response.getWriter();
		
		if(emp != null) {
			response.setContentType("application/json");
			String name = emp.getEmployeeName();
			float sal = emp.getEmployeeSal();
			
			JSONObject empJson = new JSONObject();
			empJson.put("employeename", name);
			empJson.put("employeesal", sal);
			
			out.println(empJson);
		}else {
			out.print("");
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		doGet(request, response);
	}

}
