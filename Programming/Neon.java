import java.util.Scanner;
class Neon
{
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int n=sc.nextInt();
		
		int square=n*n;
		int sum=0;
	
		while(square>0)
		{
		 int last=square%10;
		 sum=sum+last;
	  	 square=square/10;
		}
		
	
		if(sum==n)
		{
		System.out.println("It is a neon number");
		}
		else
		{
		System.out.println("It is not a neon number");
		}
	}


}