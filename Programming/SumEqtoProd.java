class SumEqtoProd
{
	public static void main(String[]args)
	{
	 int num=02;
	 int sum=0;
	 int product=1;
	 
	
	while(num>0)
	{
	
	int last=num%10;
	sum=sum+last;
	product=product*last;
	num=num/10;
	
	
	}
	
	if(sum==product)
	{
	System.out.println("The digits are same");
	}
	else
	{
	System.out.println("The digits are not same");
	}
	

	


	}
}