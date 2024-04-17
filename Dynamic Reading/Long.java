import java.util.Scanner;

class Long
{
	public static void main(String[]args)
	{
		Scanner L= new Scanner(System.in);

		System.out.println("Enter the First number: "); 
		long a= L.nextLong();

		System.out.println("Enter the Second number: ");
		long b= L.nextLong();
		
		
		long c=a+b;

		System.out.println("The sum of "+a+" and "+b+ " is : "+c);
	}
}