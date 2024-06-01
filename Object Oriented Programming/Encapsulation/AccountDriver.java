package Encapsulation;

public class AccountDriver {
	
	public static void main(String[]args)
	{
		Account a1=new Account("HDFC", "Amit",1234567890l,"HDFC123","Nagpur",1234 );
		a1.withDraw(1234567890l, 1234, 4000);
		a1.deposit(1234567890l, 1234, 15000);
		a1.withDraw(1234567890l, 1234, 8000);
		a1.setPin(1234567890l, 1234, 5678);
	}

}
