package co.edureka.java.except;

import java.util.Scanner;

public class FinallyTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try {
			System.out.print("enter a number: ");
			int x = sc.nextInt();
		
			System.out.print("enter another number: ");
			int y = sc.nextInt();
		
			int z = x / y;
			System.out.println(x + " / " + y + " = " + z);
		}catch(ArithmeticException ex) {
			System.err.println("inside catch block");
			System.err.println(ex.toString());
		}finally {
			System.out.println("inside finally block");
			System.out.println("application designed & developed by");
			System.out.println("\t team @ edureka");
			sc.close();
		}
		
		System.out.println("application completed");
	}

}
