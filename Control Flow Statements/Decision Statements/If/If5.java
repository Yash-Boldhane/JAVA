import java.util.Scanner;
class If5
{
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);

		System.out.println("Have you taken token from counter ?");
		boolean ip= sc.nextBoolean();

		if(ip==false)
		{
		System.out.println("First go and take the token");
		}
		System.out.println("Then you can stand in line");
	}
}