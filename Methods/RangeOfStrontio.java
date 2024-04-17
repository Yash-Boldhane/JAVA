class RangeOfStrontio
{
	public static void main(String[]args)
	{
		int start=1000;
		int end=5000;
	
	while(start<=end)
	{
		if(isStrontio(start))
		{
			System.out.println(start);
		}
		start++;
	}


	
	
	}
	
	public static boolean isStrontio(int num)
	{
		int temp=num*2;
		int last=temp%10;
		int ct=count(temp);
		if(ct>=4)
		{
		
		 temp=(temp%1000)/10;
	
		}
		
		

		return temp%10==temp/10;
		
	
	
	}
		
	public static int count(int num)
	{
		int ct=0;
		while(num!=0)
		{
			ct++;
			num/=10;
		}
		return ct;
	}


}