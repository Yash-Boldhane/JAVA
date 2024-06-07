package SuperKeyword;

public class Y extends X{

	int d=1;
	
	public void test()
	{
		System.out.println("From Class Y");
	}
	
	public void display()
	{
		System.out.println(d);
		System.out.println(super.d);
		
		System.out.println("------------------------");
		
		test();
		
		super.test();
	}
}
