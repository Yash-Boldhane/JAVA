package Inheritance;//Single Level Inheritence

public class SavingAccount extends BankAccount{
	double intrest;
	double Balance;
	
	public SavingAccount() {
		// TODO Auto-generated constructor stub
	}
	
	SavingAccount(String name, long accno,String ifsc, String branch, String bankname, double intrest,double Balance)
	{
		this.name=name;
		this.accno=accno;
		this.ifsc=ifsc;
		this.branch=branch;
		this.bankname=bankname;
		
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
