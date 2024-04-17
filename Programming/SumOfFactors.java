class SumOfFactors
{
	public static void main(String[]args)
	{
		int n=1234;
		int sum=0;
	
		while(n>0)
		{
		 int last=n%10;
		 int fact=1;
	
			for(int i=last; i>0; i--)
			{
			 fact=fact*i;
			}
			sum=sum+fact;
	
			n/=10;
	
			
		}
		System.out.println(sum);
	
		
	}


}