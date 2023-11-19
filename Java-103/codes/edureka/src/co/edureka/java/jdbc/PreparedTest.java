package co.edureka.java.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class PreparedTest {

	public static void main(String[] args) throws Exception{
		Connection con = ConnectionFactory.getDbConnection();
		
		PreparedStatement pst = con.prepareStatement("insert into emp(empno,ename,sal) values(?,?,?)");
		
		Scanner sc = new Scanner(System.in);
		String req = "Y";
		
		do {
			System.out.print("enter employee no, name & salary");
			int eno = sc.nextInt();
			String name = sc.next();
			float sal = sc.nextFloat();
			
			pst.setInt(1, eno);
			pst.setString(2, name);
			pst.setFloat(3, sal);
			
			int n = pst.executeUpdate();
			System.out.println("employee saved!!!\n");
			
			System.out.print("do you want to save more emplyees? [Y/N]: ");
			req =sc.next();
			
			pst.clearParameters();
		}while(req.equalsIgnoreCase("Y"));
		
		pst.close();
		con.close();
	}

}
