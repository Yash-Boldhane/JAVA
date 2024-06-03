package Has_a_Relationship_Lazy_Binding;

public class Mobile {
		String brand;
		String name;
		String color;
		double price;
		
		Sim s;
		public Mobile() {
			// TODO Auto-generated constructor stub
		}
		
		Mobile(String brand, String name, String color, double price)
		{
			this.brand=brand;
			this.name=name;
			this.color=color;
			this.price=price;
		}
		
		public void  insertSim(String brand, int g, double recharge)
		{
			s=new Sim(brand, g, recharge);
			System.out.println("Sim inserted");
		}
		public void displayMobile()
		{
			System.out.println(brand);
			System.out.println(name);
			System.out.println(color);
			System.out.println(price);
		}
}
