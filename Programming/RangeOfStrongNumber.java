class  RangeOfStrongNumber
{
	public static void main(String[]args)
	{
		for(int start=1; start<=1000; start++)
		{
		int sum=0;
		
		for (int ip=start; ip>0; ip/=10)
		{
		 int last=ip%10;
		 int fact=1;
	
			for(int i=last; i>0; i--)
			{
			 fact=fact*i;
			}
			sum=sum+fact;
	
			
	
			
		}
		if(start==sum)
		{
		System.out.println(start);
		}

		}
		
	
		
}			


}