package Has_a_Relationship_Early_Binding;

public class Battery {
		String brand;
		int mah;
		double price;
		
		Battery()
		{
			
		}
		Battery(String brand, int mah, double price)
		{
			this.brand=brand;
			this.mah=mah;
			this.price=price;
		}
		
		public void displayBattery()
		{
			System.out.println(brand);
			System.out.println(mah);
			System.out.println(price);
		}
}
