import java.util.Scanner;
class Pattern24
{
	public static void main(String[]args)
	{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the number");
	int n=sc.nextInt();

	for(int i=1; i<n; i++)
	{
	 	for(int space=0; space<n-i-1; space++)
		{

		System.out.print("  ");

		}

		for(int star=0; star<n; star++)
		{

		System.out.print("* ");

		}

		System.out.println();
		

	}


	}


}