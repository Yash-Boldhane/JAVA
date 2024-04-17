
class PerfectPalindrome
{
	public static void main(String[]args)
	{
	 
	 int n=52;
	 int sum=0;
	 int sum1=0;
	 int reverse=0;
	
	 for(int i=1; i<=n ; i++)
	 {
		if(n%i==0)
		{
		 sum= sum + i; 
			
		}

		
	  
	 }
	
	 


	if(sum==n)
	{
	 
		 while(sum>0)
  		 {
		  int last=sum%10;
		  reverse = reverse * 10 +last;
		  sum=sum/10;
		
		 }
		 	  System.out.println("It is a perfect palindrome");		
	
	}
	
	else
	{
	 while(n>0)
		{
		int last=n%10;
		  sum1=sum1+last;
		  n=n/10;
		}
		System.out.println("The sum of the orignal digit is "+sum1);	
	}	
       
			


	}



}