class IsPrime
{
	public static void main(String[]args)
	{
	
		int ip=23;
		int rev=reverse(ip);
		
		if(isPrime(ip))
		{
			
		
			if(isPrime(rev))
			{
				System.out.println("It is a Twisted prime number");
				
	
			}
			else
			{
				System.out.println("It is not a Twisted prime number");
			}

		
		}
		
		else
		{
			System.out.println("It is not a prime number");
		}
	
	
	}
	
	public static int reverse(int num)
	{
		int rev=0;
		
		 rev=rev*10+(num%10);
		num/=10;

		return rev;
	}

	public static boolean isPrime(int num)
	{

	int den;
	
	for(den=2; den<num; den++)
	{
		if(num%den==0)
		{
			break;
		}


	}

	if(den==num)
	{
		return true;
	}
	else
	{
		return false;
	}
	
	
	
	}


	
}