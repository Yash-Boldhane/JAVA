import java.util.Scanner;
class If2
{
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Is your age is less than 5 years?");
		
		boolean ip= sc.nextBoolean();
	
		if(ip)
		{
			System.out.println("You have to sit on your own risk");
		}

		System.out.println("You can sit on ride");
	}
}