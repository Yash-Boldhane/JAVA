class ArmsStrongNumber
{
	public static void main(String[]args)
	{
	 int num=1;
	 int sum=0;
	 int count=0;
	
	for(int i=num; i!=0; i/=10)
	{
		count++;
	}
	
	for(int i=num; i!=0; i/=10)
	{
		int last=i%10;
		int power=1;
	
		for(int j=0; j<count;j++)
		{
			power=power*last;
		}

		 sum+=power;
		
	
	
	}
	if(sum==num)
	{
		System.out.println("It is an armsstrong number");
	}
	else
	{
		System.out.println("It is not an armsstrong number");
	}
	
	
	
	}


}