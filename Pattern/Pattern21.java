import java.util.Scanner;
class Pattern21
{
	public static void main(String[]args)
	{
	 Scanner sc=new Scanner(System.in);
	 System.out.println("Enter the Number");
	 int n=sc.nextInt();
	
		int a=1;
	
	for(int i=0; i<n; i++)
	{
		for(int j=0; j<n; j++)
		{
		if(j<n-i)
		{
		System.out.print(a+" ");
		a++;
		}
		else
		{
		System.out.print(" ");
		}
		
		}

		System.out.println();
	}
	
	
	
	


	}


}