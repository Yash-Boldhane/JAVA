class IsPrimeRange
{
	public static void main(String[]args)
	{

		int start=100;

		int end=200;

		while(start<=end)
		{
			if(isPrime(start))
			{
				System.out.println(start);

			}
			start++;

		}



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