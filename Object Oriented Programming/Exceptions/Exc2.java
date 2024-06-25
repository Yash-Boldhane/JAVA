package Exceptions;

public class Exc2 {

		public static void main(String[] args) {
			String s=null;
			try
			{
			System.out.println(s.toString());
			}
			catch (NullPointerException e) {
				// TODO: handle exception
				System.out.println("String value cannot be null Please enter valid input");
			}
			
		}
}
