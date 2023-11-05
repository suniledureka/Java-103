package co.edureka.java.util;

import java.util.ArrayList;
import java.util.List;

public class ListMethods {

	public static void main(String[] args) {
		List<String> names = new ArrayList<>();
		
		System.out.println("is the list empty = " + names.isEmpty());
		System.out.println("no of participants = " + names.size());
		
		names.add("Sunil");
		names.add("Aravind");		
		names.add("Sunil");
		names.add("Archana");
		names.add("Bhagyasree");
		names.add("Praveen");
		names.add("Sunil");
		System.out.println(names + " | size = " + names.size());
		
		names.add(1, "Ranjan");
		names.set(1, "RANJAN");
		System.out.println(names + " | size = " + names.size());
		
		System.out.println("person in index (0) = " + names.get(0));
		
		System.out.println("index of \"Sunil\" = " + names.indexOf("Sunil"));
		System.out.println("last index of \"Sunil\" = " + names.lastIndexOf("Sunil"));
		System.out.println("index of \"edureka\" = " + names.indexOf("edureka"));
		
		System.out.println("is \"Aravind\" in list = " + names.contains("Aravind"));
		System.out.println("is \"edureka\" in list = " + names.contains("edureka"));
		
		System.out.println("remove(0) = " + names.remove(0)); //Sunil
		System.out.println("remove(Sunil) = " + names.remove("Sunil"));// true
		System.out.println(names + " | size = " + names.size());
	}

}
