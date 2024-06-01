package Encapsulation;

public class Account 
{
	private String bank;
	private String name;
	private long accno;
	private String ifsc;
	private String branch;
	private double balance=100000;
	private int pin;
	
	Account()
	{
		
	}
	
	Account(String bank,String name,long accno,String ifsc,String branch,int pin)
	{
		this.bank=bank;
		this.name=name;
		this.accno=accno;
		this.ifsc=ifsc;
		this.branch=branch;
		this.pin=pin;
		
	}
	
	public String getBankName() 
	{
		return bank;
	}
	public String getName() {
		return name;
	}
	public long getAccno() {
		return accno;
	}
	public String getIfsc() {
		return ifsc;
	}
	public String getBranch() {
		return branch;
	}
	public double getBalance(long accno, int pin) {
		if (this.accno==accno && this.pin==pin) {
			System.out.println("Login Successful !");
			return balance;
		} else {
			System.out.println("Invalid Credentials !");
			return 0;
		}
	}
	
	public void withDraw(long accno, int pin, int amt)
	{
		if (this.accno==accno && this.pin==pin &&amt>=2000) {
			System.out.println("Login Successful!");
			if(balance-amt>=2000)
			{
				balance=balance-amt;
				System.out.println("Amount Deducted");
				System.out.println(balance);
			}
			else {
				System.out.println("Insufficient Fund");
				System.out.println(balance);
				
			}
			
			}
		else {
			System.out.println("Invalid Credentials !");
			
		}
	}
	public void deposit(long accno, int pin, int amt) {
		if (this.accno==accno && this.pin==pin)
		{
			balance=balance+amt;
			System.out.println(balance);

		}
		else {
			System.out.println("Invalid Credentials !");
			
		}
	}
	
	public void setPin(long accno, int oldpin, int newpin)
	{
		if(pin==oldpin)
		{
			pin=newpin;
			System.out.println("Pin updated");
		}
		else
		{
			System.out.println("Invalid Pin");
		}
	}
}
