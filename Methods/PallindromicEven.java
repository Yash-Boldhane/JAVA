class PallindromicEven
{
	public static void main(String[]args)
	{
	int ip=101;
	int rev=reverse(ip);
	
	if(checkPallindrome(ip,rev) &&  checkEven(ip))
	{
		System.out.println("It is a pallindromic even number");
	
	}
	else
	{
		System.out.println("It is not a pallindromic even number");

	}
		

	}
	
	public static int reverse(int num)
	{
	int rev=0;
	
		while(num!=0)
		{
		rev=rev*10+(num%10);
		num/=10;
		
		}
	return rev;
	}
		
	public static boolean checkPallindrome(int num, int rev)
	{
	
		return num==rev;


	}

	public static boolean checkEven(int num)
	{
		return num%2==0;
	}


	


}