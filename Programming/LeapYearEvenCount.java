import java.util.Scanner;
class LeapYearEvenCount
{

	public static void main(String[]args)
	{

	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the starting year");
	int start=sc.nextInt();

	System.out.println("Enter the ending year");
	int end=sc.nextInt();
	
	int count=0;

	if(start>=1582)
	{
	
	
		for(int year=start; year<=end; year++)
		{
		
			if(year%4==0 && year%100!=0 || year%400==0)
			{
		
				if(year%2==0)
				{

				System.out.println(year);			
	
				}		
				
			}
			
			
			

	
		}
	
	}

	else

	{
	System.out.println("Invalid range");


	}


	
	}

}