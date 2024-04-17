import java.util.Scanner;

class Byte
{
	public static void main(String[]args)
	{
		Scanner c=new Scanner(System.in);

		System.out.println("Enter the first number: "); 
		
		byte a= c.nextByte();

		System.out.println("Enter the second number: ");		

		byte b= c.nextByte();

		int d=a+b;

		System.out.println("The sum of " +a+ " and " +b+ " is: " +d);
	}
}