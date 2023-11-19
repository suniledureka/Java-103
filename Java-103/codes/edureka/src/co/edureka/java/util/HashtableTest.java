package co.edureka.java.util;

import java.util.Hashtable;
import java.util.Map;

public class HashtableTest {

	public static void main(String[] args) {
		Map<String,Float> bank = new Hashtable<String, Float>();
		
		System.out.println(bank.put("Sunil", 15500f)); //null
		System.out.println(bank.put("Sunil", 11500.50f)); //15500.0
		System.out.println(bank.put("Ajay", 12500f)); //null
		bank.put("Charles", 25700f);
		bank.put("Pankaj", 12500.75f);
		bank.put("Rahul", 25000f);
		
		System.out.println(bank);
		System.out.println();

		bank.put("Sanjay", null); //java.lang.NullPointerException
		System.out.println(bank);
		
		bank.put(null, 12500f); //java.lang.NullPointerException
		System.out.println(bank);
	}

}
