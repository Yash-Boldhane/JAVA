import java.util.Scanner;
class IfElse1
{
	public static void main(String[]args)
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the pin :");
	
		int num=sc.nextInt();
	
		if(num==1234)
		{
			System.out.println("Login Successfull");
		}
		else
		{
			System.out.println("Login Failed");
		}
	}	
}