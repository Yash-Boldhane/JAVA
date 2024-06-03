package Has_a_Relationship_Lazy_Binding;

public class Pendrive {

		String brand;
		double price;
		int storage;
		double speed;
		
		
		Pendrive()
		{
			
		}
		
		Pendrive(String brand, double price, int storage, double speed)
		{
			this.brand=brand;
			this.price=price;
			this.storage=storage;
			this.speed=speed;
			
		}
		
		public void displayPendrive()
		{
			System.out.println(brand);
			System.out.println(price);
			System.out.println(storage);
			System.out.println(speed);
		}
}
