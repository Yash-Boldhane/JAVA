import java.util.Scanner;
class If1
{
	public static void main(String[]args)
	{
	Scanner sc = new Scanner(System.in);
	System.out.println("Are you a paid student or Not ?");

	boolean ip = sc.nextBoolean();

	if(ip)
	{
	System.out.println("Pay the fees of amount 39500.0");
	}
	
	System.out.println("Attend the class");
	
	}

}