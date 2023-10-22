
public class ConditionalOperator {

	public static void main(String[] args) {
		int x = 17;
		int y = 12;
		int lar;
		
		lar = (x > y) ? x : y;
		System.out.println("largest of ("+ x + ", " + y + ") = " + lar);
		System.out.printf("largest of (%d, %d) = %d \n", x, y, lar);
		System.out.println((x > y) ? x : y);
	}

}
