class ExtractEvenOddDigits
{
	public static void main(String[]args)
	{
	int num=123456;
	int even=0;
	int odd=0;
	
	
	while(num>0)
	{
	 
	 int last=num%10;
	
		if(last%2==0)
		{
		 even++;
		}
	
		else if(last%2!=0)
		{
		 odd++;
		}
		
		num=num/10;
	}
	System.out.println("Even :"+even++);
	System.out.println("Odd :"+odd++);
	
	}


}