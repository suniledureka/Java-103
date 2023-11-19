package co.edureka.java.strings;

public class StringMethods3 {

	public static void main(String[] args) {
		String s1 = "ABC";
		//String s2 = "ABC";
		String s2 = "ADA";
		int n = s1.compareTo(s2); //return 0 if both the Strings are equal; otherwise it returns the numerical 
								  // difference b/w the first non-matching character
		
		System.out.println(n);
	}

}
