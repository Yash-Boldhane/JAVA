package Has_a_Relationship_Early_Binding;

public class Mobile1 {
	String brand;
	String name;
	String color;
	double price;
	int hd;
	int camera;
	
	Battery1 b1;
	
	public Mobile1() {
		// TODO Auto-generated constructor stub
	}
	
	Mobile1(String brand,String name,String color,double price,int hd,int camera, String bbrand, int mah, double cost)
	{		b1=new Battery1(bbrand, mah, cost);
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
