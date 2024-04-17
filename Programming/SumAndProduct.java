class SumAndProduct
{
	public static void main(String[]args)
	{
	 int num=6;
	 int sum=0;
	 int product=1;

	for(int i=1; i<=num/2;i++)
	{
	
		if(num%i==0)
		{
		
		 sum= sum + i;
		product= product * i;
		}
		
		
	}
	if(sum==product)
	{
	System.out.println("The sum and product of factors are equal");
	}
	else
	{
	System.out.println("The sum and product of factors are not equal");
	}

	}


}