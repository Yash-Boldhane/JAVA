import java.util.Scanner;
class If4
{
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Have you bought the ticket ?");

		boolean ip= sc.nextBoolean();
	
		if(ip==false)
		{
			System.out.println("First go and buy the ticket");
		}

			System.out.println("Then you can Watch the show");
	}	
}