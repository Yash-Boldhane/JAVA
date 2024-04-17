import java.util.Scanner;
class IfElse2
{
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the character");

		char ch=sc.next().charAt(0);
	
		if(ch>='a'&& ch<='z' || ch>='A'&& ch<='Z')
		{
		System.out.println("It is an alphabet");
		}
		else
		{
			System.out.println("It is not an alphabet");
		}
	}
}