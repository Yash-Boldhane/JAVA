import java.util.Scanner;

class Short
{
	public static void main(String[]args)
	{
		Scanner c=new Scanner(System.in);

		System.out.println("Enter the first number: "); 
		
		short a= c.nextShort();

		System.out.println("Enter the second number: ");		

		short b= c.nextShort();

		int d=a+b;

		System.out.println("The sum of " +a+ " and " +b+ " is: " +d);
	}
}