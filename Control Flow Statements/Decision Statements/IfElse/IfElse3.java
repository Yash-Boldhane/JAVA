import java.util.Scanner;
class IfElse3
{
	public static void main(String[]args)
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the amount to transfer");
		
		double amount=sc.nextDouble();

		double limit=20000.00;

		if(amount<=limit)
		{
			System.out.println("You can continue with your money transfer");
		}
		else
		{
			System.out.println("You have reached your limit");
		}
	}	
}