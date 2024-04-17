import java.util.Scanner;
class NFibonacciPrime
{	
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter a number");
		int i = s.nextInt();
		int n1=0, n2=1, n3;
		int count=1;
		
		for (;;)
		{
			n3= n1+n2;
			if(i==count)
			{
				System.out.println(n1);	
				break;
			}
			n1=n2;
			n2=n3;
		
			count++;
		}
		
		int den = 2;
		
		while (den<i)
		{
			if (i%den==0)
			{
				break;	
			}
			den++;
		}
		if (i==den)
		{
			System.out.println("It is a prime no");
		}
		else
		{
			System.out.println("It is not a prime no");
		}		


		
	}
}