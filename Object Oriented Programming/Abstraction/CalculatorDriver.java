package Abstraction;

public class CalculatorDriver {
		public static void main(String[] args) {
			Calculator c1=new Calculatorimp();//upcasting
			c1.add(5, 10);
			
		//c1.message();//only parent class can be accessed
		c1.greetings();
		}
}
