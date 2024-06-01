package Has_a_Relationship_Early_Binding;

public class Mobile {
	String brand;
	String name;
	String color;
	double price;
	int hd;
	int camera;
	
	Battery b1=new Battery("Samsung",5000,2000.0);
	
	public Mobile() {
		// TODO Auto-generated constructor stub
	}
	
	Mobile(String brand,String name,String color,double price,int hd,int camera)
	{
		this.brand=brand;
		this.name=name;
		this.color=color;
		this.price=price;
		this.hd=hd;
		this.camera=camera;
	}
	
	public void displayMobile()
	{
		System.out.println(brand);
		System.out.println(name);
		System.out.println(color);
		System.out.println(price);
		System.out.println(hd);
		System.out.println(camera);
	}
}
