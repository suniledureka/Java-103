package co.edureka.java.arrays;

import java.util.Arrays;

public class ArrayInitialization {

	public static void main(String[] args) {
		int[] marks = {78,84,96,82,91,76,63};
		
		System.out.println(marks); //toString()
		System.out.println("no of subjects = " + marks.length);
		System.out.println(Arrays.toString(marks));
		System.out.println();
		
		/*-- array iteration using for loop --*/
		for(int i=0; i<marks.length; i++) {
			System.out.println("mark for subject-"+(i+1) + " = " + marks[i]);
		}
		System.out.println();
		
		/*-- array iteration using for..each loop / enhanced for loop --*/
		System.out.print("marks obtained ----> ");
		for(int mark : marks) {
			System.out.print(mark + " | ");
			try {
				Thread.sleep(1000);
			}catch(Exception ex) {}
		}
		System.out.println();
		System.out.println(marks[6]);
		System.out.println(marks[7]); //java.lang.ArrayIndexOutOfBoundsException
	}
}
