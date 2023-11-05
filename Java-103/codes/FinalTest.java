//final class A{
class A{
 final void display(){}
}
class B extends A{
 void display(){}
}

class FinalTest 
{
	final int n = 12; //instance variable

	//final FinalTest(){} //error: modifier final not allowed here
	final String name; //blank final variable
	
	FinalTest(){
		name = "edureka";
	}

	public static void main(String[] args) 
	{
		final int n = 10; //local variable
		//n = 12; //error: cannot assign a value to final variable n
		System.out.println(n);

		FinalTest obj = new FinalTest();
		//obj.n = 12; //error: cannot assign a value to final variable n
		System.out.println(obj.n);
	}
}
