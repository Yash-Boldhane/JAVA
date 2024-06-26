package Modifiers;
//Protected Modifier
public class A2 {

		static protected int a=10;
		
		// We can use the protected member anywhere within the same package.
		// We can use a protected member outside the package only with the help of subclass...
		
		
		
		protected void test()
		{
			System.out.println("From protected non static test() of A2");
		}
		
		protected A2()
		{
			
		}
		
		public static void main(String[] args) {
			A2 a2=new A2();
			a2.test();
			
			System.out.println(a2.a);
		}
}
