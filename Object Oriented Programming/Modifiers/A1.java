package Modifiers;

//Default class 
class A1 {
	static int a=123;
	
	
	//We cannot use a default member outside the package
	
	// Default can be used anywhere within same package  but not outside the package.
	//We can make classes,method,variable and a constructor default.
	
	// We Cannot import default members....
	
	
	
	void test()
	{
		System.out.println("From default non static test() of A1");
	}
	
	A1() {
		// TODO Auto-generated constructor stub
	}
	
	public static void main(String[] args) {
		A1 a1=new A1();
		a1.test();
		System.out.println(a1.a);
	}
}
