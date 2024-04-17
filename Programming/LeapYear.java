import java.util.Scanner;
class LeapYear
{

	public static void main(String[]args)
	{
	
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the year");

	int year=sc.nextInt();
	
	if(year<1582)
	{
	System.out.println("Please enter the year above 1582");
	}

	else if(year/4==0 && year/100!=0 || year/400==0)
	{
	System.out.println("It is a leap Year");
	}

	else
	{
	System.out.println("It is not a leap year");
	}
	
	
	}

}