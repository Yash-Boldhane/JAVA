package Polymorphism;

public class B extends A{
	public static void test()
	{
		System.out.println("From class B test() which is static");
	}
	
	public void demo()
	{
		System.out.println("From class B demo() which is nonstatic");
	}
}
