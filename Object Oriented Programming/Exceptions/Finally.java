package Exceptions;

public class Finally {

		public static void main(String[] args) {
			try {
				System.out.println(10/0);
			}
			catch (ArithmeticException e) {
				// TODO: handle exception
				System.out.println("Dont Divide by 0");
			}
			finally 
			{
				System.out.println("From Finally");
			}
		}
}
