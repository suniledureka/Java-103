package co.edureka.java.oops;

import java.util.Scanner;

public class DrawingApp {

	public static void main(String[] args) {
		Shape sh = null;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("which shape do you want to work with? [1.Rectangle | 2.Circle]: ");
		int shapeType = sc.nextInt();
		
		//sh = new Shape(); //Cannot instantiate the type Shape
		
		switch(shapeType) {
		 case 1:
		   sh = new Rectangle("Blue", 12,8);	 
		   break;	
		 case 2:
		   sh = new Circle("Green", 7.85f);	 
		   break;		   
		 default:
		   System.err.println("INVALID SHAPE SELECTION --- TRY AGAIN");
		   return; //System.exit(0);
		}
		
		System.out.println("\n===================== SHAPE SELECTED :: " + sh.getClass().getSimpleName().toUpperCase() + " =====================");
		System.out.println("color of \"" + sh.getClass().getSimpleName() + "\" = "+sh.getColor());
		sh.setColor("Yellow");
		sh.area();		
	}

}
