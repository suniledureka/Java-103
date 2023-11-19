package co.edureka.java.util;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetTest {

	public static void main(String[] args) {
		Set<String> names = new TreeSet<String>();
		
		System.out.println(names.add("Pankaj")); //true
		System.out.println(names.add("Pankaj")); //false
		System.out.println(names.add("Mark")); //true
		names.add("Charles");
		names.add("Sanjay");
		names.add("Bharath");
		
		System.out.println(names);
		
		names.add(null); //java.lang.NullPointerException
		System.out.println(names);
	}

}
