package co.edureka.java.util;

import java.util.Arrays;
import java.util.Collections;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ListIterations {

	public static void main(String[] args) throws InterruptedException {
		List<Integer> marks = Arrays.asList(92, 67, 78, 91, 64, 77, 82);
		
		System.out.println(marks);	
		
		iteration1(marks);
		Thread.sleep(2000); //2000ms - 2 seconds
		iteration2(marks);
		Thread.sleep(2000);
		iteration3(marks);
		Thread.sleep(2000);
		iteration4(marks);
		Thread.sleep(2000);
		iteration5(marks);
		Thread.sleep(2000);
		iteration6(marks);
	}

	private static void iteration1(List<Integer> marks) {
		System.out.println(">>> iteration using for loop and get() method - only applicable for List implementations");
		for(int i=0; i<marks.size(); i++) {
			Integer n = marks.get(i);
			System.out.print(n + "       ");
		}
		System.out.println("\n");
	}
	
	private static void iteration2(List<Integer> marks) {
		System.out.println(">>> iteration using enhanced for loop/ for..each loop");
		for(Integer n : marks) {
			System.out.print(n + "       ");
		}
		System.out.println("\n");
	}
	
	private static void iteration3(List<Integer> marks) {
		System.out.println(">>> iteration using java.util.Iterator");
		Iterator<Integer> it = marks.iterator();
		while(it.hasNext()) {
			Integer n = it.next();
			System.out.print(n + "       ");
		}
		System.out.println("\n");
	}	
	
	private static void iteration4(List<Integer> marks) {
		System.out.println(">>> iteration using java.util.ListIterator - only applicable for List implementations ");
		ListIterator<Integer> it = marks.listIterator();
		while(it.hasNext()) {
			Integer n = it.next();
			System.out.print(n + "       ");
		}
		System.out.println();
		
		while(it.hasPrevious()) {
			Integer n = it.previous();
			System.out.print(n + "       ");			
		}
		System.out.println("\n");
	}	
	
	private static void iteration5(List<Integer> marks) {
		System.out.println(">>> iteration using java.util.Enumeration");
		Enumeration<Integer> en = Collections.enumeration(marks);
		while(en.hasMoreElements()) {
			Integer n = en.nextElement();
			System.out.print(n + "       ");
		}
		System.out.println("\n");
	}	
	
	public static void iteration6(List<Integer> marks) {
		System.out.println(">>> iteration using lambda expression in forEach method");
		marks.forEach(n -> System.out.print(n + "       "));
	}
}
