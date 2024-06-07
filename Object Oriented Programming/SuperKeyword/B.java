package SuperKeyword;

public class B extends A{
	String x="Hello World";
	
	public void Test()
	{
		System.out.println("From class B");
	}
	
	public void display()
	{
		System.out.println(x);
		System.out.println(super.x);
		
		System.out.println("----------------------------");
		
		Test();
		super.Test();
		
		System.out.println(this);
		
		//System.out.println(super);// CTE
	}
}
