package Has_a_Relationship_Early_Binding;

public class Engine {
		String Make;
		String model;
		int numberofcylinders;
		String lubricatingsystem;
		
		
		Engine()
		{
			
		}
		
		Engine(String Make, String model, int numberofcylinders,String lubricatingsystem)
		{
			this.Make=Make;
			this.model=model;
			this.numberofcylinders=numberofcylinders;
			this.lubricatingsystem=lubricatingsystem;
		}
		public void displayEngine()
		{
			System.out.println(Make);
			System.out.println(model);
			System.out.println(numberofcylinders);
			System.out.println(lubricatingsystem);
		}
		
		
}
