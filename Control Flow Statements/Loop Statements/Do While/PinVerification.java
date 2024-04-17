import java.util.Scanner;
class PinVerification
{

	public static void main(String[]args)
	{

	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the pin");
	
	int saved=1234;
	int attempt=0;
	
	do
	{
	 int pin =sc.nextInt();
		if(pin==saved)
		{
		System.out.println("Login Success!");
		break;
		}
		
		attempt++;

		if(attempt<3)
		{
		System.out.println("Incorrect pin! please try again");
		System.out.println("Number of attempts :"+(3-attempt));
		
		}
	
		

	}
	while(attempt<3);
	if(attempt==3)
	{
	System.out.println("You have entered wrong pin 3 times, wait 30 sec to enter again");
	}
	

	}

}