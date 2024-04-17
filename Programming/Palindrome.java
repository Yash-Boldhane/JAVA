class Palindrome
{

	public static void main(String[]args)
	{

	int num=121;
	int reverse=0;
	
	for(int temp=num; temp>0; temp=temp/10)
	{
	
	int last=temp%10;
	
	reverse=(reverse * 10) + last;
	}
	
		if(num==reverse)
		{
	
		System.out.println("It is a pallindrome");
		}
		else
		{
		System.out.println("It is not a pallindrome");
		}
	
	
	
	
	
	
	}


}
