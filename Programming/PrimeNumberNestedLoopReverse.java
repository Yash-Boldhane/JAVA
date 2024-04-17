class PrimeNumberNestedLoopReverse
{
	public static void main(String[]args)
	{
	int start=100;

	int end=50;

	while(start>=end)
	{
		int den=2;
		while(start>den)
		{
		if(start%den==0)
		{
		 break;
		}
		den++; 
		}
	
		if(start==den)
		{
		System.out.println(start);
		}
	
		

		start--;
	
	}
		
	
	}
	



}