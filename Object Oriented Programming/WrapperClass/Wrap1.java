package WrapperClass;
//Boxing
public class Wrap1 {
	public static void main(String[] args) {
		int a=10;
		
		Integer a1=new Integer(a);
		System.out.println(a);
		
		char c='a';
		Character c1=new Character(c);
		System.out.println(c1);
		
		double d=123.5;
		Double d1=new Double(d);
		
		System.out.println(d1);
	}
}
