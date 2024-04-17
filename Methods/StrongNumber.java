class StrongNumber
{
	public static void main(String[]args)
	{
	
	int ip=145;
	int sn=strong(ip);
	
		if(sn==ip)
		{
		System.out.println("It is a strong number");
		}
		else
		{
		System.out.println("It is not a strong number");
		}


	}
	
	public static int strong(int num)
	{
	
	int sum=0;
	
	while(num>0)
		{
		 int last=num%10;
		 int fact=1;
	
			for(int i=last; i>0; i--)
			{
			 fact=fact*i;
			}
			sum=sum+fact;
	
			num/=10;
	
			
		}
	return sum;


	}


}