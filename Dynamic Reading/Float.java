import java.util.Scanner;

class Float
{
	public static void main(String[]args)
	{
		Scanner sc= new Scanner(System.in);
	
		System.out.println("Enter the First Number: ");
		float a= sc.nextFloat();
		

		System.out.println("Enter the Second Number: ");
		float b= sc.nextFloat();


		float c=a+b;
		System.out.println("The sum of "+a+ " and " +b+ "is :"+c);

	}
}