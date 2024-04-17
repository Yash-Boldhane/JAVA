class SmithNo
{
	public static void main(String[]args)
	{

	System.out.println(isSmith(85));

	}
	public static boolean isSmith(int num)
	{
		int num1=num;
		int den=2;
		int sum=0;
		while(num!=1)
		{
			if(num%den==0)
			{
				num/=den;

				if(isPrime(den))
				 {
					sum+=sumOfDigits(den);
				}
				
				den=2;
			}
			
			else
			{
				den++;
			}

		}
		
		return sumOfDigits(num1)==sum;
		
	}
	
	public static int sumOfDigits(int num)
	{
		int sum=0;
		while(num!=0)
		{
			int last=num%10;
			sum+=last;
			num/=10;
		}
		return sum;
	}

	public static boolean isPrime(int num)
	{

	int den;
	
	for(den=2; den<=num; den++)
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