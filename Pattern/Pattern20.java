import java.util.Scanner;
class Pattern20
{
	public static void main(String[]args)
	{
	 Scanner sc=new Scanner(System.in);
	 System.out.println("Enter the Number");
	 int n=sc.nextInt();
	
		
	
	int a=97;

	for(int i=0; i<n-1; i++)
	{
		for(int j=0; j<n; j++)
		{
		
		if(j<n-i-1)
		{
		 System.out.print((char)(a++));
		}

		}
	
		System.out.println();


	}


	}


}