package co.edureka.java.jdbc;

import java.sql.Connection;
import java.sql.Statement;

public class SaveEmployee {

	public static void main(String[] args) throws Exception {
		Connection con = ConnectionFactory.getDbConnection();
		Statement st = con.createStatement();
		
		//String sql = "insert into emp values(101, 'Sanjay', 2500.75)";
		String sql = "insert into emp(empno,ename,sal) values(102, 'Praveen', 2500.50), (103, 'Rakesh', 3250),"
				+ "(104, 'Srinivas', 3500.50), (105, 'Shankar', 3750)";
		
		int employeesSaved = st.executeUpdate(sql);
		System.out.printf("employee(s) saved = %d ", employeesSaved);
		
		st.close();
		con.close();
	}

}
