// Write a program to check if it is a valid password or not
package ProgrammingWithStrings;
import java.util.Scanner;
public class Str17 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the password");
		String pass=sc.next();
		if(pass!=null && pass.length()>=8)
		{
			int upper=0, lower=0,digit=0,spl=0;
			
			for (int i = 0; i < pass.length(); i++) {
				char ch=pass.charAt(i);
				if(ch>='A' && ch<='Z')
				{
					upper++;
				}
				else if(ch>='a'&& ch<='z')
				{
					lower++;
				}
				else if(ch>='0'&& ch<='9')
				{
					digit++;
				}
				else
				{
					spl++;
				}
			}
			
			if(upper>0 && lower>0 && digit>0 && spl>0)
			{
				System.out.println("It is a Strong Password");
			}
			else
			{
				System.out.println("It is not a Strong Passwoord");
			}
		}
		else
		{
			System.out.println("The length of the password must be atleast 8 characters");
		}
		
	}
}
