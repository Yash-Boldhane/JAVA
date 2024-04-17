import java.util.Scanner;
class StatBlock2
{
	static Scanner sc;
	
	static
	{
		sc=new Scanner(System.in);
		System.out.println("Global scanner ref is available!");
	}
	
	public static void main(String[]args)
	{
		System.out.println("Enter the first number: ");
		int n1=sc.nextInt();

		System.out.println("Enter the Second number: ");
		int n2=sc.nextInt();
	
		System.out.println(n1+n2);
	
		merge();
	}
	
	public static String merge()
	{
		System.out.println("Enter the first name: ");
		String n1=sc.next();

		System.out.println("Enter the last name: ");
		String n2=sc.next();
	
		System.out.println(n1+" "+n2);

		return n2;
	}
}