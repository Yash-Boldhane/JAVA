package Inheritance;//Single Level Inheritence

public class SavingAccount1 extends BankAccount{
	double intrest;
	double Balance;
	
	public SavingAccount1() {
		// TODO Auto-generated constructor stub
	}
	
	SavingAccount1(String name, long accno,String ifsc, String branch, String bankname, double intrest,double Balance)
	{
		super(name, accno,ifsc, branch, bankname);		
		this.intrest=intrest;
		this.Balance=Balance;
		
		
	}
	
	public void displaySavingAccount()
	{
		displayBankAccount();
		
		System.out.println("Intrest :"+intrest);
		System.out.println("Balance : "+Balance);
	}
}
