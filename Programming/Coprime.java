import java.util.Scanner;
class CoPrime
{
	public static void main(String[]args)
	{
	 Scanner sc=new Scanner(System.in);
	 System.out.println("Enter the first number");
	 int n1=sc.nextInt();

	 System.out.println("Enter the second number");
	 int n2=sc.nextInt();
	
	 int small= n1<n2 ? n1 : n2;

	 while(true)
	 {
	 	if(n1%small==0 && n2%small==0)
		{
		 System.out.println("The HCF of "+n1+" and "+n2+" is : "+small);
		 break;
		} 
		
		small--;
	 }
	
	 if(small==1)
	 {
		System.out.println("The numbers are coprime");
	 }
	 else
	 {
	 System.out.println("The numbers are not coprime");
	 }
	
	
	}


}