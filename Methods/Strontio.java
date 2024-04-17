class Strontio
{
	public static void main(String[]args)
	{
	
		int num=1451;
		if(count(num)==4)
		{
			if(isStrontio(num))
			{
				System.out.println("It is a strontio number");
				

			}
			else
			{
				System.out.println("It is not a strontio number");

			}
		}
		else
		{
			System.out.println("Enter a 4 digit  number");

		}
	
	
	}
	
	public static boolean isStrontio(int num)
	{
		int temp=num*2;
		int last=temp%10;
		int ct=count(temp);
		if(ct>=4)
		{
		
		 temp=(temp%1000)/10;
	
		}
		
		

		return temp%10==temp/10;
		
	
	
	}
		
	public static int count(int num)
	{
		int ct=0;
		while(num!=0)
		{
			ct++;
			num/=10;
		}
		return ct;
	}


}