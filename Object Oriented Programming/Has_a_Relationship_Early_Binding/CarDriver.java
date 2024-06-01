package Has_a_Relationship_Early_Binding;

public class CarDriver {
		public static void main(String[]args)
		{
			Car c1=new Car("Maruti", "Swift",5,700000.0,5);
			c1.displayCar();
			
			
			System.out.println("---------------------------------------------------------------");
			
			c1.e1.displayEngine();
		}
}
