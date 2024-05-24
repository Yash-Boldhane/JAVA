class Bottle
{
	String brand;
	String color;
	String shape;
	String type;
	
	Bottle(String brand,String color,String shape,String type)
	{
		System.out.println("From Parametarized Constructor");
		this.brand=brand;
		this.color=color;
		this.shape=shape;
		this.type=type;
	
		
	}	

	public void displayBottle()
	{
		System.out.println(brand);
		System.out.println(color);
		System.out.println(shape);
		System.out.println(type);
	}
}