package WrapperClass;
//Unboxing
public class Wrap2 {
	public static void main(String[] args) {
		int a=10;
		Integer a1=new Integer(a);//Boxing
		
		
		int i=a1.intValue();// Unboxing
		
		System.out.println(i);
		

		char c='a';
		Character c1=new Character(c);
		
		char c2=c1.charValue();
		System.out.println(c2);
		
		double d=123.5;
		Double d1=new Double(d);
		
		
		double d2=d1.doubleValue();
		System.out.println(d2);
	}
}
