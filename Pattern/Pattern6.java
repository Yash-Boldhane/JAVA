import java.util.Scanner;
class Pattern6
{
	public static void main(String[]args)
	{
	
	Scanner sc=new Scanner(System.in);
	 System.out.println("Enter the Number");
	 int n=sc.nextInt();
	


	for(int i=1; i<=n; i++)
	{
		for(int j=1; j<=n; j++)
		{
			if(i==(n+1)/2 || j==(n+1)/2 || j>n/2 && i==1 || j<(n+1)/2 && i==n || i<(n+1)/2 && j==1 || i>(n+1)/2 && j==n )
			{
			System.out.print("* ");
			}
			else
			{
			System.out.print("  ");
			}
	

		}
	
		System.out.println();


	}


	}


}