import java.util.Scanner;
class Switch4
{
	public static void main(String[]args)
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("******Welcome to your own calculator******");
				
		System.out.println("1.+");
		System.out.println("2.-");
		System.out.println("3.*");
		System.out.println("4./");
	
		System.out.println("Enter the choice");


		int ip= sc.nextInt();
		
		switch(ip)
			{
		case 1:
		{
		System.out.println("Enter the First number");	
		double a= sc.nextDouble();


		System.out.println("Enter the Second number");
		double b= sc.nextDouble();
		
		System.out.println("What type of output do you want ?");
		System.out.println("1.Whole number ");
		System.out.println("2.Decimal Number ");
		
		double c=a+b;
		
		int ab= sc.nextInt();

		switch(ab)
		{

		case 1:
		{
			System.out.println("The sum of "+(int)a+ " and "+(int)b+ " is "+(int)c );
			break;		
		}
		
		case 2:
		{
			System.out.println("The sum of "+a+ " and "+b+ " is "+c );	
			break;
		}

		}
		
		break;
		}

		case 2 :
		{
		System.out.println("Enter the First number");
			
		int a= sc.nextInt();

		System.out.println("Enter the Second number");
			
		int b= sc.nextInt();
		
		System.out.println("What type of output do you want ?");
		System.out.println("1.Whole number ");
		System.out.println("2.Decimal Number ");
		
		double c=a-b;
		
		int ab= sc.nextInt();

		switch(ab)
		{

		case 1:
		{
			System.out.println("The Difference of "+(int)a+ " and "+(int)b+ " is "+(int)c );
			break;		
		}
		
		case 2:
		{
			System.out.println("The Difference of "+a+ " and "+b+ " is "+c );	
			break;
		}

		}
		

		break;
		}

		case 3 :
		{
		System.out.println("Enter the First number");
			
		int a= sc.nextInt();

		System.out.println("Enter the Second number");
			
		int b= sc.nextInt();
		
		System.out.println("What type of output do you want ?");
		System.out.println("1.Whole number ");
		System.out.println("2.Decimal Number ");
		
		double c=a*b;
		
		int ab= sc.nextInt();

		switch(ab)
		{

		case 1:
		{
			System.out.println("The product of "+(int)a+ " and "+(int)b+ " is "+(int)c );
			break;		
		}
		
		case 2:
		{
			System.out.println("The product of "+a+ " and "+b+ " is "+c );	
			break;
		}

		}
		
		
		break;
		}
		

		case 4 :
		{
		System.out.println("Enter the First number");
			
		int a= sc.nextInt();

		System.out.println("Enter the Second number");
			
		int b= sc.nextInt();
		
			
		int c=a/b;

		System.out.println("The output of the above operation is " +c);
		break;
		}
		
		default :
		{
		System.out.println("Wrong input");
		}
		}
		
	}
}