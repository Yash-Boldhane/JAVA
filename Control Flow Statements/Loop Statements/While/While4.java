import java.util.Scanner;
class While4
{
	public static void main(String[]args)
	{
	 Scanner sc=new Scanner(System.in);
	 System.out.println("Enter the number");
	 int table = sc.nextInt();
	 int start=1;
	 int end=10;

	while(start<=end)
	{

	System.out.println(table+ "*"+start+ "=" +(table*start));

	start++;	

	}
	

	}
}