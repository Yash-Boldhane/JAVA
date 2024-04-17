import java.util.Scanner;
class PrimeNumber
{
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int num=sc.nextInt();
		int den=2;
	
		while(den<=num/2)
		{
			if(num%den==0)
			{
				break;
			}
		
			den++;
		}
		
		if(num==den)
		{
		 System.out.println("It is a prime Number");
		}
		else
		{
		System.out.println("It is not a prime number");
		}
	
	
	}	
}