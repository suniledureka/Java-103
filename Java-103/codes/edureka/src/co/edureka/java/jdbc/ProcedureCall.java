package co.edureka.java.jdbc;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.Types;


public class ProcedureCall {

	public static void main(String[] args) throws Exception {
		Connection con = ConnectionFactory.getDbConnection();
		
		CallableStatement cst = con.prepareCall("{call hike_emp_salary(?,?,?)}");
		
		int eno = 101;
		int hike = 10;
		
		cst.setInt(1, eno);
		cst.setInt(2, hike);
		
		cst.registerOutParameter(3, Types.FLOAT);
		
		cst.execute();
		
		System.out.printf("updated salary of employee (%d) is %.2f", eno, cst.getFloat(3));
		
		cst.close();
		con.close();
	}

}
