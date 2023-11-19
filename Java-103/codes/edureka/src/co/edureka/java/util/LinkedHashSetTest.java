package co.edureka.java.util;

import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetTest {

	public static void main(String[] args) {
		Set<String> names = new LinkedHashSet<String>();
		
		System.out.println(names.add("Pankaj")); //true
		System.out.println(names.add("Pankaj")); //false
		System.out.println(names.add("Mark")); //true
		names.add("Charles");
		names.add("Sanjay");
		names.add("Bharath");
		
		System.out.println(names);
		
		names.add(null);
		System.out.println(names);
	}

}
