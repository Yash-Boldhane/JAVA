package Exceptions;

public class ObjPropogation {

		public static void main(String[] args) {
			try {
				
				divion(10, 1);
				
			} catch (ArithmeticException e) {
				System.out.println("Do not divide by 0");
			}
			
			
		}
		public static void divion(int a, int b)
		{
			System.out.println(a/b);
		}
}
