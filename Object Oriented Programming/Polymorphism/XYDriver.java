package Polymorphism;

public class XYDriver {
	public static void main(String[] args) {
		Y y1=new Y();
		System.out.println(y1.a);//Variable shadowing
		System.out.println(y1.c);//When we try to call the static as well as the non static members in the driver class this process is known as variable shadowing.
		System.out.println(y1.x);
		System.out.println(y1.s);
	}
}
