package Has_a_Relationship_Early_Binding;

public class MotherBoard {
		String Brand;
		int ram;
		String processor;
		int sata;
		
		
		
		MotherBoard()
		{
			
		}
		MotherBoard(String Brand, int ram, String processor, int sata)
		{
			this.Brand=Brand;
			this.ram=ram;
			this.processor=processor;
			this.sata=sata;
		}
		
		public void displayMotherboard()
		{
			System.out.println(Brand);
			System.out.println(ram);
			System.out.println(processor);
			System.out.println(sata);
		}
}
