import java.util.Scanner;
class Pattern16
{
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		 System.out.println("Enter the Number");
		 int n=sc.nextInt();
	

		int a=1;
	
	for(int i=1; i<=n; i++)
	{
		for(int j=0; j<i; j++)
		{
	
		System.out.print(a+" ");
		a++;
		
		
		}

		System.out.println();
	}
	
	
	
	


	}


}