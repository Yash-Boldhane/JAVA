package Exceptions;
import java.util.Scanner;
import java.util.InputMismatchException;
public class Excep3 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		try {
			
			System.out.println("Enter the First Number");
			int a=sc.nextInt();
			
			System.out.println("Enter the Second Number");
			int b=sc.nextInt();
			
			
			System.out.println(a/b);
			
			System.out.println(sc.toString());
		}
		catch (NullPointerException e) {
			// TODO: handle exception
			
			System.out.println("Object Reference cannot be null");
		}
		catch (ArithmeticException e) {
			// TODO: handle exception
			System.out.println("Please enter the number between 0-9");
		}	
		
		catch (InputMismatchException e) {
			// TODO: handle exception
			System.out.println("Please enter integer numbers only....");
		}
		
			
		
		}
		
		
		
}

		
		
	
	

