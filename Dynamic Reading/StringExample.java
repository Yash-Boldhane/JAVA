import java.util.Scanner;

class StringExample
{
	public static void main(String[]args)
	{
		Scanner sc= new Scanner(System.in);
	
		System.out.println("Enter the First Sentence: ");
		String a= sc.nextLine();
		

		System.out.println("Enter the Second Sentence: ");
		String b= sc.nextLine();


		String c=a+b;
		System.out.println(c);

	}
}