import java.util.Scanner;
class DigitPrime
{
	public static void main(String[]args)
	{
	 Scanner sc=new Scanner(System.in);
	 System.out.println("Enter a number");
	 int num= sc.nextInt();
	 while(num>0)
	 {
		int last=num%10;
		if(last!=2 && last!=3 && last!=5 && last!=7)
		{
		 break;
		}
		num/=10;
	
	 }   

	 if(num==0)
	 {
	 System.out.println("It has all digits prime");

	 }
	 else
	 {
	 System.out.println("It does not have all prime digits");
	 }


	}

}

