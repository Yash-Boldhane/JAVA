package WrapperClass;
//AutoUnboxing
public class Wrap5 {
	public static void main(String[] args) {
		int a=50;
		
		Integer a1=a;//		AutoBoxing
		
		int c='c';//		AutoUnboxing
		
		System.out.println(a1);
		
		char c1='d';
		Character c2=c1;//		AutoBoxing
		
		char c3=c2;//		AutoUnboxing
		
		System.out.println(c3);

	}
}
