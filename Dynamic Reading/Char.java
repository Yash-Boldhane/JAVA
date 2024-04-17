import java.util.Scanner;

class Char
{
	public static void main(String[]args)
	{
		Scanner c= new Scanner(System.in);

		System.out.println("Enter the First Character: "); 
		char first= c.next().charAt(0);

		System.out.println("Enter the Second Character: ");
		char second= c.next().charAt(0);
		
		
		int ans=first+second;

		System.out.println("The sum of "+first+" and "+second+ " is : "+ans);
	}
}