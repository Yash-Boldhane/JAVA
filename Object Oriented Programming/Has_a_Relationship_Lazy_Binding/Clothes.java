package Has_a_Relationship_Lazy_Binding;

public class Clothes {
		String type;
		String color;
		double price;
		
		public Clothes() {
			// TODO Auto-generated constructor stub
		}
		
		Clothes(String type,String color,double price)
		{
			this.type=type;
			this.color=color;
			this.price=price;
		}
		public void displayClothes()
		{
			System.out.println(type);
			System.out.println(color);
			System.out.println(price);
		}
}
