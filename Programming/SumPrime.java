import java.util.Scanner;
class SumPrime
{
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int num=sc.nextInt();
		
		int sum=0;
		int den;
		int prime=1;
		while(num>0)
		{
		 int last=num%10;
		 sum=sum+last;
		 num=num/10;
		}
		System.out.println(sum);
	
		for(den=2; den<sum; den++)
		{
			if(sum%den==0)
			{
			  	prime=0;
				break;
			 }
			
				
	
		}
		if(sum>1 && prime==1)
			{
			  System.out.println("It is  a prime number");
			 
			}
			 else
			{
			 System.out.println("It is not a prime number");
			}
				
	
		
		
	
	}
}