import java.util.Scanner;
class Pattern26
{
	public static void main(String[]args)
	{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the Number(Only enter odd numbers only)");

	int n=sc.nextInt();

	int star=1,   space=n/2;

	for(int i=0; i<n; i++)
	{
		for(int j=0; j<space; j++)
		{
		System.out.print("  ");
		}

		for(int j=0; j<star; j++)
		{
		 System.out.print(" *");

		}

		System.out.println();

		if(i<n/2)
		{
		 star+=2;
		 space--;

		}
		else
		{
		star-=2;
		space++;
		}
	
	
	}

	}


}