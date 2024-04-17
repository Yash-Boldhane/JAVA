class RangeOfMysteryNumber
{
	public static void main(String[]args)
	{
	
	int start=1;
	int end=100;
	
	while(start<=end)
	{
		if(isMystery(start))
		{
			System.out.println(start);
		}
		start++;
	}

		


	}	
	
	public static int reverse(int num)
	{
		int rev=0;
		while(num!=0)
		{
			int last=num%10;
			rev=rev*10+last;
			num/=10;
		}
		return rev;
	}
	
	public static boolean isMystery(int num)
	{
		int ct=0;
		
		for(int i=0; i<num;i++)
		{
			int p=reverse(i);
			if(i+p==num)
			{
				ct++;
			}	
		}
		
		return ct>0;
	}

}