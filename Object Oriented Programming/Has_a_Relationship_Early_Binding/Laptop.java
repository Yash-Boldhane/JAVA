package Has_a_Relationship_Early_Binding;

public class Laptop {
		String Brand;
		String Model;
		String color;
		double price;
		String RGB;
		
		
		MotherBoard m1=new MotherBoard("Foxin",2,"Intel",4);
		Laptop()
		{
			
		}
		
		Laptop(String Brand,String Model,String color,double price,String RGB)
		{
			this.Brand=Brand;
			this.Model=Model;
			this.color=color;
			this.price=price;
			this.RGB=RGB;
		}
		
		public void displayLaptop()
		{
			System.out.println(Brand);
			System.out.println(Model);
			System.out.println(color);
			System.out.println(price);
			System.out.println(RGB);
		}
}
