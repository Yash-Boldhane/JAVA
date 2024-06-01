package Has_a_Relationship_Early_Binding;

public class refil {
		String brand;
		String color;
		double thickness;
		
		refil()
		{
			
		}
		refil(String brand, String color, double thickness)
		{
			this.brand=brand;
			this.color=color;
			this.thickness=thickness;
		}
		public void diplayRefil()
		{
			System.out.println(brand);
			System.out.println(color);
			System.out.println(thickness);
		}
}
