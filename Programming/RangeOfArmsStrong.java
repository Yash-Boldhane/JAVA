class RangeOfArmsStrong
{
	public static void main(String[]args)
	{
		for(int start=10; start<1000; start++)
		{
		 	int sum=0;
			 int count=0;
		 
	
		for(int i=start; i!=0; i/=10)
		{
			count++;
		}
	
		for(int i=start; i!=0; i/=10)
		{
			int last=i%10;
			int power=1;
	
			for(int j=0; j<count;j++)
			{
				power=power*last;
			}
	
				 sum+=power;
	

		
	
	
		}
		if(sum==start)
		{
		System.out.println(start);
		}
		
		
		}
		
	
	
	}


}