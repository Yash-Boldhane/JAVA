import java.util.Scanner;
class PronicNumber
{
	public static void main(String[]args)
	{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the number");
	int num=sc.nextInt();
	
	int ans=0;
	
	
	for(int i=1 ; i<100 ; i++)
	{
		if(i*(i+1)==num)
		{
		 ans=1;
		 break;
		}
	
	
	}
	if(ans==1)
	{
		System.out.println("It is a pronic number");
	}
	else
	{
	System.out.println("It is not a pronic number");
	}
	
	


	}


}