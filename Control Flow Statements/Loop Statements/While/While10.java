import java.util.Scanner;
class While10


{
	public static void main(String[]args)
	{
	 Scanner sc=new Scanner(System.in);
	 System.out.println("Enter the Number");
	 
	 
	 int num= sc.nextInt();
	 int count=0;
	 int sum=0;



	while(num>0)
	{
		sum+=num%10;
		count++;
		num=num/10;

	}
	
   System.out.println("Sum :"+sum);
     System.out.println("Count :"+count);
	}
}