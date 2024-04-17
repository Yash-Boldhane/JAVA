import java.util.Scanner;
class Introduction
{
	public static void main(String[]args)
	{
		Scanner sc= new Scanner(System.in);

		System.out.println("What is your name?");
		String name = sc.nextLine( );

		System.out.println("In which college did you study?");
		String year = sc.nextLine( );

		System.out.println("What is your branch?");
		String branch = sc.nextLine( );
		

		System.out.println("What are your technical skills?");
		String technical = sc.nextLine( );
		

		System.out.println("In which year do you study?");
		String study = sc.nextLine( );
		
		
		System.out.println("Aggrgate till last Semister?");
		float cgpa = sc.nextFloat( );
		

		System.out.println("What is your age");
		int age = sc.nextInt( );
		
		
	}
}