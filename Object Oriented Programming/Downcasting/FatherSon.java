package Downcasting;

public class FatherSon {
	public static void main(String[] args) {
		Father f1=new Son();
		f1.displayfather();
		
		System.out.println("----------------------------");
		
		Son s1=(Son)f1;
		s1.displayfather();
		s1.displaySon();
	}
}
