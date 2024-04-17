import java.util.Scanner;
class Ladder3
{
	public static void main(String[]args)
	{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the colour");

	String a= sc.nextLine();
	if(a=="red" || a=="Red")
	{
	System.out.println("You have to wait until its get Green");
	}

	else if(a=="Yellow" || a=="yellow")
	{
	System.out.println("You have to wait until its get red and after it turns green you can 				go");
	}

	else if(a=="Green" || a=="green")
	{
	System.out.println("You can go before it turns red");
	}
	
	else
        {
	System.out.println("Wait until it gets red");
	}
	}

}