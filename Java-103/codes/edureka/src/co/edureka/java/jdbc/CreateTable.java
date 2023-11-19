package co.edureka.java.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class CreateTable {

	public static void main(String[] args) throws Exception {
		//-- initialize MySQL JDBC Driver
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		//-- make a connection to db_edureka database
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/db_edureka", "root", "root");
		
		//-- create an object for passing SQL queries to connect DB
		Statement st = con.createStatement();
		
		//-- pass the DDL Query to create table
		try {
			String sql = "create table emp(empno int(5), ename varchar(30), sal float(10,2), primary key(empno))";
			st.execute(sql);
			System.out.println("###--- DATABASE TABLE \"EMP\" CREATED ---###");
		}catch(Exception ex) {
			System.err.println("Table could not be created --> " + ex.toString());
		}
		
		//-- close connection with DB
		st.close();
		con.close();
	}

}
