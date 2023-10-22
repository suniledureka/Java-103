
public class CharacterType {

	public static void main(String[] args) {
		char c = 'A';
		System.out.println(c);
		
		c = 65; //implicit typecasting
		System.out.println(c);
		
		System.out.println("hexa decimal value of 65 = " + Integer.toHexString(65));
		
		c = '\u0041';
		System.out.println(c);
		
		c = '\u0905'; //Hindi
		System.out.println(c);
		
		c = '\u0c05'; //Telugu
		System.out.println(c);
		c = '\u0d05'; //Malayalam
		System.out.println(c);
		
		c = '\u4eca'; //Japanese, Hebru
		System.out.println(c);
	}

}
