package co.edureka.java.util;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapTest {

	public static void main(String[] args) {
		Map<String,Float> bank = new HashMap<String, Float>();
		
		System.out.println(bank.put("Sunil", 15500f)); //null
		System.out.println(bank.put("Sunil", 11500.50f)); //15500.0
		System.out.println(bank.put("Ajay", 12500f)); //null
		bank.put("Charles", 25700f);
		bank.put("Pankaj", 12500.75f);
		bank.put("Rahul", 25000f);
		
		System.out.println(bank);
		System.out.println();
		
		float balance = bank.get("Sunil");
		System.out.println("A/C Balance of \"Sunil\" = " + balance);
		balance += 1250.5f;
		bank.put("Sunil", balance);
		System.out.println(bank);
		System.out.println();
		
		Set<String> accHoldersSet = bank.keySet();
		System.out.print("A/C Holders ----> ");
		for(String name : accHoldersSet) {
			System.out.print(name  + "  |  ");
		}
		System.out.println("\n");
		
		
		Set<Map.Entry<String, Float>> entries = bank.entrySet();
		Iterator<Map.Entry<String, Float>> it =entries.iterator();
		while(it.hasNext()) {
			Map.Entry<String, Float> entry = it.next();
			String name = entry.getKey();
			float bal = entry.getValue();
			
			System.out.printf("%-10s ----> %.2f \n", name, bal);
			try {
				Thread.sleep(1000);
			}catch(Exception ex) {}
		}
		
		System.out.println();
		
		bank.put(null, null);
		System.out.println(bank);
	}

}
