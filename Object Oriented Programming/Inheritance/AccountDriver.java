package Inheritance;//Single Level Inheritence

public class AccountDriver {
	public static void main(String[] args) {
		SavingAccount s1=new SavingAccount("Umesh", 123456789l, "BI001", "Lonara", "SBI", 8.25, 1000000.00);
		s1.displayBankAccount();
		
		System.out.println("---------------------------------------------------------------------");
		
		s1.displaySavingAccount();
	}
}
