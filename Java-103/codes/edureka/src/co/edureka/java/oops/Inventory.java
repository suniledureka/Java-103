package co.edureka.java.oops;

public class Inventory {

	public static void main(String[] args) {
		Product prod = new Product();
		
		//System.out.println(prod.productId);//The field Product.productId is not visible
		System.out.println(prod.getProductId() + " - " + prod.getProductName());
		
		prod.setProductId(85749);
		prod.setProductName("Mobile Phone");
		System.out.println(prod.getProductId() + " - " + prod.getProductName());
		System.out.println();
		
		System.out.println("\"prod\" is an instance of type ---> " + prod.getClass().getName());
		System.out.println("\"prod\" is an instance of type ---> " + prod.getClass().getSimpleName());
		System.out.println("hashCode() ---> " + prod.hashCode());
		System.out.println("hashCode() in hexdecimal form --> " + Integer.toHexString(prod.hashCode()));
		System.out.println();
		
		System.out.println(prod); //toString()
	}

}
