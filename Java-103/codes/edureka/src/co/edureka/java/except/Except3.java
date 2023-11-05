package co.edureka.java.except;

public class Except3 {

	public static void main(String[] args) {
		String str = "675";
		System.out.println(str + 25); //67525
		
		int n = Integer.parseInt(str);
		System.out.println(n + 25); //700
		
		byte b = Byte.parseByte("25");
		System.out.println(b);
		
		short s = Short.parseShort("25");
		System.out.println(s);
		
		long l = Long.parseLong("25");
		System.out.println(l);
		
		float f = Float.parseFloat("25");
		System.out.println(f);
		
		double d = Double.parseDouble("25.0");
		System.out.println(d);
		
		str = "A";
		n = Integer.parseInt(str); //java.lang.NumberFormatException
		System.out.println(n);
	}
}
