class Pattern29
{
	public static void main(String[]args)
	{
	
	int n=4;
	
	for(int i=1; i<=n; i++)
	{
	
		int val=i;

		for(int j=1; j<=i; j++)
		{
		
		System.out.print(val+" ");
		val += n - j+1;
	
		}

		System.out.println();
		

	}	



	}

}