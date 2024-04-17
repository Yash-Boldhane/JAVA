import java.util.Scanner;
class NumberContainsFibonacci
{
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int num=sc.nextInt();
		int n1=0, n2=1, n3;
		
	
		while(num>0)
		{
			int last=num%10;
			if(last==n1)
			{
			break;
			}
	
			else if(n1>last)
			{
			break;
			}
	
			else
			{
			n3=n1+n2;
			n1=n2;
			n2=n3;
			}
		
			num/=10;
		}
	
		if(num!=0)
		{
		 System.out.println("The number contains all fibonacii digits");
		}
		else
		{
		 System.out.println("The number does contains all fibonacii digits");
		}
	
		
		
	}	
}