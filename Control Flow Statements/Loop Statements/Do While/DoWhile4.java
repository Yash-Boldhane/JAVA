import java.util.Scanner;
class DoWhile4
{
	public static void main(String[]args)
	{
	Scanner sc=new Scanner(System.in);

	System.out.println("Enter the number");

	int table= sc.nextInt();
	int start=1;
	
	do
	{

	System.out.println(table+"*"+start+"="+(table*start));
	 start++;
	
	
	}
	while(start<=10);

	}
}