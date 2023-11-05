package co.edureka.java.except;

import java.io.IOException;
import java.sql.SQLException;

public class ThrowsTest {

	public static void main(String[] args) throws InterruptedException {
		int uid = 101;
		UserService service = new UserService();
		
		try {
			String userName = service.findUserNameById(uid);
			if(userName != null)
				System.out.println("Welcome " + userName);
			else
				System.out.println("Welcome Guest");
		} catch (SQLException | IOException e) {			
			e.printStackTrace();
		} 
		
		System.out.println("\nPlease wait for 5 seconds");
		Thread.sleep(5000); //5000ms (5 seconds)
		System.out.println("Thanks for waiting");
	}

}
