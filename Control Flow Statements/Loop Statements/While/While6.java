import java.util.Scanner;
class While6
{
	public static void main(String[]args)
	{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the first number");
	int start=sc.nextInt();

	System.out.println("Enter the end number");
	int end=sc.nextInt();



	while(start<=end)
	{
		if(start%2==0)
		{

			System.out.println(start);

		}
		
		start++;

	}
	

	}
}