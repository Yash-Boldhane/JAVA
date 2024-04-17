import java.util.Scanner;
class Pattern10
{
	public static void main(String[]args)
	{
	Scanner sc=new Scanner(System.in);
	 System.out.println("Enter the Number");
	 int n=sc.nextInt();
	

	int a=1;
	int b=1;

	for(int i=1; i<=n; i++)
	{
		for(int j=1; j<=n; j++)
		{
		if(i==j)
		{
		System.out.print(a+ " ");
		a++;
		}
		else if(i+j==n+1)
		{
		System.out.print(b+ " ");
		b++;

		}
		else
		{
		System.out.print("* ");

		}


		}

		System.out.println();
	}


	}


}