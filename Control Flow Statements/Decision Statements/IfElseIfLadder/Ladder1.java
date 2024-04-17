import java.util.Scanner;
class Ladder1
{
	public static void main(String[]args)
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter your cgpa:");
	
		int cgpa= sc.nextInt();

		if(cgpa>=9 && cgpa<=10)
		{
			System.out.println("You have achieved A+");
		}

		else if(cgpa>=8 && cgpa<=9)
		{
		System.out.println("You have achieved A+");
		}

		else if(cgpa>=7 && cgpa<=8)
		{
		System.out.println("You have achieved B+");
		}

		else if(cgpa>=6 && cgpa<=7)
		{
		System.out.println("You have achieved B+");
		}

		else if(cgpa>=5 && cgpa<=6)
		{
		System.out.println("You have achieved C+");
		}

		else if(cgpa>=4 && cgpa<=5)
		{
		System.out.println("You have achieved C+");
		}

		else if(cgpa>=3 && cgpa<=4)
		{
		System.out.println("You have achieved D+");
		}

		else
		{
		System.out.println("Failed");
		}
	}
}