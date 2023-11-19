package co.edureka.java.util;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetTest {

	public static void main(String[] args) {
		Set<String> names = new HashSet<String>();
		
		System.out.println(names.add("Pankaj")); //true
		System.out.println(names.add("Pankaj")); //false
		System.out.println(names.add("Mark")); //true
		names.add("Charles");
		names.add("Sanjay");
		names.add("Bharath");
		
		System.out.println(names);
		
		Iterator<String> it = names.iterator();
		while(it.hasNext()) {
			String name = it.next();
			System.out.println("\t----------> " + name);
		}
		System.out.println();
		
		names.add(null);
		System.out.println(names);
	}
}
