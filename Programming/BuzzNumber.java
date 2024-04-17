import java.util.Scanner;
class BuzzNumber
{
	public static void main(String[]args)
	{
	 Scanner sc=new Scanner(System.in);
	 System.out.println("Enter the number");
	 int n=sc.nextInt();
	 
	int last=n%10;
	if(last==7 || n%7==0)
	{
	System.out.println("It is a buzz No.");
	}
	else
	{
	System.out.println("It is not a buzz No.");
	}
	
	
	}


}