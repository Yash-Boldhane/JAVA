package Has_a_Relationship_Early_Binding;

public class Pen {
		String brand;
		String color;
		double Price;
		
		
		refil r1=new refil("Cello", "Black",0.5);
		
		Pen()
		{
			
		}
		Pen(String brand, String color, double Price)
		{
			this.brand=brand;
			this.color=color;
			this.Price=Price;
		}
		
		public void displayPen()
		{
			System.out.println(brand);
			System.out.println(color);
			System.out.println(Price);
		}
		
}
