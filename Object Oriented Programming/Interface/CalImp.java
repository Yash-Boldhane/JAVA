package Interface;

public class CalImp implements Calculator {

	String brand;
	String name;
	double price;
	
	public CalImp() {
		// TODO Auto-generated constructor stub
	}
	
	CalImp(String brand,String name, double price)
	{
		this.brand=brand;
		this.name=name;
		this.price=price;
	}
	
	@Override
	public void add(int a, int b) {
		// TODO Auto-generated method stub
		
		System.out.println(a+b);
		
	}
	
	@Override
	public void div(double a, double b) {
		// TODO Auto-generated method stub
		
		System.out.println(a/b);
	}
}
