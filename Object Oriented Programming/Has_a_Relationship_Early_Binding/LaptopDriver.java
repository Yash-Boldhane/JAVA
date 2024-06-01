package Has_a_Relationship_Early_Binding;

public class LaptopDriver {

	public static void main(String[]args)
	{
		Laptop l1=new Laptop("HP","F15","Black",75000.0,"Yes");
		l1.displayLaptop();
		
		System.out.println("----------------------------------------------------");
		l1.m1.displayMotherboard();
	}
}
