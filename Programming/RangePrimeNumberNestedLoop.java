class RangePrimeNumberNestedLoop
{
	public static void main(String[]args)
	{
	int start=1;
	int end=1000;
	
	for(int i=start; i<=end; i++)
	{

	while(i<=end)
	{
		int den=2;
		while(i>den)
		{
		if(i%den==0)
		{
		 break;
		}
		den++; 
		}
	
		if(i==den)
		{
		System.out.println(i);
		}
	
		

		i++;
	
	}
	
	}
		
	
	}
	



}