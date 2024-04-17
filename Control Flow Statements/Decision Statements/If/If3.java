import java.util.Scanner;
class If3
{
	public static void main(String[]args)
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Have you have cleared all your fees ?");
		
		boolean ip=sc.nextBoolean();

		if(ip==false)
		{
			System.out.println("First go and pay the pending fees");
		}
		
		System.out.println("Then you can give Exams");
			

	}
}