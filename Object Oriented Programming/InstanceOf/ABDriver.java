package InstanceOf;

public class ABDriver {
	public static void main(String[] args) {
		B b1=new B();
		System.out.println(b1 instanceof B);
		System.out.println(b1 instanceof A);
		
		A a1=new A();
		
		System.out.println("------------------------------------");
		
		System.out.println(a1 instanceof A);
		System.out.println(a1 instanceof B);
		
	}
}
