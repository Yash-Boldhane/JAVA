package Polymorphism;

public class ABDriver {
	public static void main(String[] args) {
		A a1=new B();// upcasting
		
		a1.test();// Method Shadowing
		a1.demo();//Method overriding
	}
}
