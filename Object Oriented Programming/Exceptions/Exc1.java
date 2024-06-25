package Exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;
public class Exc1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);

		try
		{
			System.out.println("Enter the first number");
			int a=sc.nextInt();
			
			System.out.println("Enter the Second Number");
			int b=sc.nextInt();
			
			System.out.println(a/b);
			
		}
		catch (ArithmeticException e) {
			// TODO: handle exception
			System.out.println("Please enter the Number between 0 to 9");
			
		}
		catch (InputMismatchException e) {
			// TODO: handle exception
			System.out.println("Please enter the input in integer between 0-9");
		}
		catch (Exception e) {
			// TODO: handle exception
		}
	}
}
