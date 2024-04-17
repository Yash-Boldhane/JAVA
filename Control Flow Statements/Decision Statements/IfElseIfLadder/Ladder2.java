import java.util.Scanner;
class Ladder2
{
	public static void main(String[]args)
	{
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter your Percentage");
		
		int d=sc.nextInt();
		
		
		if(d>= 90)
		{
		System.out.println("You have received Disticion");
		}
	
		else if(d>= 80 && d<=90)
		{
		System.out.println("You are in First class");
		}

		else if(d>= 70 && d<=80)
		{
		System.out.println("You are in First class");
		}

		else if(d>= 60 && d<=70)
		{
		System.out.println("You are in Second class");
		}
		
		else if(d>= 50 && d<=60)
		{
		System.out.println("You are in Second class");
		}
		
		else if(d>= 45 && d<=50)
		{
		System.out.println("You have received Second class");
		}

		else
		{
		System.out.println("Failed");
		}


	}
}