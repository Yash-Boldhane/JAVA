package Has_a_Relationship_Early_Binding;

public class Car {
		String brand;
		String name;
		int seater;
		double price;
		int airbags;
		
		
		Engine e1=new Engine("Kirloskar","TV",1,"Forced Feed System");
		
		Car()
		{
			
		}
		Car(String brand, String name, int seater, double price, int airbags)
		{
			this.brand=brand;
			this.name=name;
			this.seater=seater;
			this.price=price;
			this.airbags=airbags;
		}
		
		public void displayCar()
		{
			System.out.println(brand);
			System.out.println(name);
			System.out.println(seater);
			System.out.println(price);
			System.out.println(airbags);
		}
		
		
}
