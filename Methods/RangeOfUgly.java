class RangeOfUgly // It is also known as the Hamming number
{
	public static void main(String[]args)
	{
			
		int start=1;
		int end=100;
	
	while(start<=end)
	{
		if(isUgly(start))
		{
			System.out.println(start);	
		}
		start++;
	}

	}
	
	public static boolean isUgly(int num)
	{
		while(num!=1)
		{
			if(num%2==0)
			{
				num/=2;
				
			}
			
			else if(num%3==0)
			{
				num/=3;
				
			}
		
			else if(num%5==0)
			{
				num/=5;
			
			}
		
			else
			{
				break;
			}
			
		}
		System.out.println(num);
		return num==1;
		
		
		
		
		
	}


}
	
