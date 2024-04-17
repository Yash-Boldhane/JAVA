import java.util.Scanner;
class Switch2
{
	public static void main(String[]args)
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("******Welcome to your own calculator******");
				
		System.out.println("1.+");
		System.out.println("2.-");
		System.out.println("3.*");
		System.out.println("4./");
	
		System.out.println("Enter the choics");


		int ip= sc.nextInt();
		
		switch(ip)
			{
		case 1:
		{
		System.out.println("Enter the First number");	
		int a= sc.nextInt();


		System.out.println("Enter the Second number");
		int b= sc.nextInt();
		
			
		int c=a+b;

		System.out.println("The output of the above operation is " +c);
		
		break;
		}

		case 2 :
		{
		System.out.println("Enter the First number");
			
		int a= sc.nextInt();

		System.out.println("Enter the Second number");
			
		int b= sc.nextInt();
		
			
		int c=a-b;

		System.out.println("The output of the above operation is " +c);
		break;
		}

		case 3 :
		{
		System.out.println("Enter the First number");
			
		int a= sc.nextInt();

		System.out.println("Enter the Second number");
			
		int b= sc.nextInt();
		
			
		int c=a*b;

		System.out.println("The output of the above operation is " +c);
		
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