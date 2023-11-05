interface Bank
{
	int n = 25; //public static final

	void deposit(float amt); //public abstract
	//void withdraw(float amt){} //interface abstract methods cannot have body
	//default void withdraw(float amt){} //from java 8
	void withdraw(float amt); //public abstract

	default void gstCalculation(){
		System.out.println("GST Calculations ----");
	}
}