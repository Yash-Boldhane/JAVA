import java.util.Scanner;
class DoWhile6
{
	public static void main(String[]args)
	{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the First Number :");
	int start=sc.nextInt();

	System.out.println("Enter the Second Number :");

	int Last=sc.nextInt();

	do
	{

		if(start%2==0)
		{
		System.out.println(start);
		
		}
	
		start++;
	
	}
	while(start<=Last);
	
	
	}
}