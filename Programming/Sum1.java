class Sum1
{

	public static void main(String[]args)
	{

	int num=123456789;
	int sum=0;
	int total=0;
	
	while(num>0)
	{
	sum=num%10;
	total=total+sum;
	
	num=num/10;
	
	
	}

	System.out.println("The sum of the given input is "+total);


	}

}