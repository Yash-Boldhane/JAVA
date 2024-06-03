package Has_a_Relationship_Lazy_Binding;

public class Suitcase {
		String brand;;
		String color;
		int cap;
		double price;
		
		
		Clothes c;
		
		public Suitcase() {
			// TODO Auto-generated constructor stub
		}
		
		Suitcase(String brand,String color,int cap,double price)
		{
			this.brand=brand;
			this.color=color;
			this.cap=cap;
			this.price=price;
		}
		
		public void insertClothes(String type,String color,double price)
		{
			c=new Clothes(type, color, price);
			System.out.println("Clothes Inserted");
		}
		public void displatSuitcase()
		{
			System.out.println(brand);
			System.out.println(color);
			System.out.println(cap);
			System.out.println(price);
		}
}
