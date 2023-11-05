package co.edureka.java.except;

public class ThrowTest {
	
	void calc(int x, int y) {
		if(y == 0)
			//throw new ArithmeticException();
			throw new ArithmeticException("cannot divide a number by 0");
		
		int z = x / y;
		System.out.println("result = " + z);
	}
	
	public static void main(String[] args) {
		ThrowTest obj = new ThrowTest();
		try {
			obj.calc(10, 0);
		}catch(Exception ex) {
			System.err.println("message = " + ex.getMessage());
			System.err.println(ex.toString());
		}
	}

}
