package co.edureka.java.util;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapTest {

	public static void main(String[] args) {
		Map<String,Float> bank = new LinkedHashMap<String, Float>();
		
		System.out.println(bank.put("Sunil", 15500f)); //null
		System.out.println(bank.put("Sunil", 11500.50f)); //15500.0
		System.out.println(bank.put("Ajay", 12500f)); //null
		bank.put("Charles", 25700f);
		bank.put("Pankaj", 12500.75f);
		bank.put("Rahul", 25000f);
		
		System.out.println(bank);
		System.out.println();

		bank.put(null, null);
		System.out.println(bank);		
	}

}