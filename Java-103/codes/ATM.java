import java.util.Scanner;

class ATM 
{
	public static void main(String[] args) 
	{
		Bank bank;

		Scanner sc = new Scanner(System.in);

		System.out.print("which bank's card? [1.SBI | 2.ICICI]: ");
		int cardType = sc.nextInt();

		switch(cardType){
			case 1:
				bank = new SBI();
				break;
			case 2:
				bank = new ICICI();
				break;
			default:
				System.out.println("---- CARD READ ERROR ---- TRY AGAIN ----");
				sc.close();
				return;
		}//switch

		System.out.println("\n============================ WELCOME TO "+bank.getClass().getName()+ " =============================\n");
		bank.deposit(1000);
		bank.withdraw(500.75f);

		System.out.println(Bank.n);
		System.out.println(SBI.n);
		System.out.println(ICICI.n);
		System.out.println(bank.n);

		//bank.n = 25; //error: cannot assign a value to final variable n
		bank.gstCalculation();
	}
}
