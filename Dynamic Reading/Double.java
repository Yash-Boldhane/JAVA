import java.util.Scanner;

class Double
{
	public static void main(String[]args)
	{
		Scanner sc= new Scanner(System.in);
	
		System.out.println("Enter the First Number: ");
		double a= sc.nextDouble();
		

		System.out.println("Enter the Second Number: ");
		double b= sc.nextDouble();


		double c=a+b;
		System.out.println("The sum of "+a+ " and " +b+ "is :"+c);

	}
}