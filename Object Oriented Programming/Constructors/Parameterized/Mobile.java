class Mobile
{
	String brand;
	String name;
	String color;
	double price;


	Mobile(String brand,String name,String color,double price)
	{
		System.out.println("From Parametarized Constructor");
		this.brand=brand;
		this.name=name;
		this.color=color;
		this.price=price;

	}

	public void displayMobile()
	{
		System.out.println(brand);
		System.out.println(name);
		System.out.println(color);
		System.out.println(price);
	}	
}