package Inheritance;//Single Level Inheritence

public class BankAccount1 {
	String name;
	long accno;
	String ifsc;
	String branch;
	String bankname;
	
	BankAccount1()
	{
		
	}
	BankAccount1(String name, long accno,String ifsc, String branch, String bankname)
	{
		this.name=name;
		this.accno=accno;
		this.ifsc=ifsc;
		this.branch=branch;
		this.bankname=bankname;
		
		
	}
	
	public void displayBankAccount()
	{
		System.out.println("name: "+name);
		System.out.println("Accno :"+accno);
		System.out.println("IFSC :"+ifsc);
		System.out.println("Branch :"+branch);
		System.out.println("Bank Name :"+bankname);
	}
}
