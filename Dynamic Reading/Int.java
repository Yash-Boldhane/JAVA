import java.util.Scanner;

class Int
{
	public static void main(String[]args)
	{
		Scanner i= new Scanner(System.in);
		
		System.out.println("Enter the First number :");
		int a= i.nextInt();

		System.out.println("Enter the Second number :");

		int b= i.nextInt();

		int c=a+b;

		System.out.println("The sum of "+a+" and "+b+" is: "+c);
	}
}