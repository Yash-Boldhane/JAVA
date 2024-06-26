package Modifiers;
// Private Modifier
public class A {
	
	
	
	//We cannot Access private members in different class os subclass and parent class of the same package......
	//A private member cannot be accessed outside the package...

		static private int a=123;
		
		private void test()
		{
			System.out.println("From Private non sstatic method from Test() of A");
		}
		
		private A()
		{
			
		}
		
		public static void main(String[] args) {
			A a1=new A();
			System.out.println(a);
			a1.test();
		}
}
