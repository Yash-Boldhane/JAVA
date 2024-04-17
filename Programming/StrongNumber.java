class StrongNumber
{
	public static void main(String[]args)
	{
		int n=145;
		int sum=0;
		int ip=n;
		
	
		while(ip>0)
		{
		 int last=ip%10;
		 int fact=1;
	
			for(int i=last; i>0; i--)
			{
			 fact=fact*i;
			}
			sum=sum+fact;
	
			ip/=10;
	
			
		}
	
		if(sum==n)
		{
		System.out.println("It is a strong number");
		}
		else
		{
		System.out.println("It is not a strong number");
		}
		
	
		
	}


}