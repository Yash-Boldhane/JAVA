import java.util.Scanner;
class TwistedPrimeNumber
{	
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter a number");
		
		int num = s.nextInt();
		int den;
		for (den =2; num>den; den++)
		{
			if (num%den==0)
			{
				break;
			}
		}
		
		int reverse =0;
		if (num==den)
		{
			System.out.println("It is a prime no");
			
			for (int a = num; a >0; a/=10)
			{
				int last =a%10;
				reverse = reverse*10+last;
			}
			for (den=2; reverse>den; den++)
			{
				if (reverse%den==0)  
				{
					break;
				}
			}
			
			if (reverse==den)
			{
				System.out.println("and also a twisted prime no");	
			}
			else
			{
				System.out.println("but not a twisted prime no");
			}
				
		}
		else
		{
			System.out.println("It is not a prime no");
		}
		

	}
}

