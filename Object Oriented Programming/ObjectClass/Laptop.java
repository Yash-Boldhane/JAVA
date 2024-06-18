package ObjectClass;

public class Laptop {
	String brand;
	String model;
	String color;
	double price;
	
	public Laptop() {
		// TODO Auto-generated constructor stub
	}
	
	Laptop(String brand,String model,String color, double price)
	{
		this.brand=brand;
		this.model=model;
		this.color=color;
		this.price=price;
	}
	
	public String toString()
	{
		
		return "[Brand: " +brand+ ", Model:" +model+ ", Color: "+ color + ",Price :"+price+ "]";

		
	}
}
