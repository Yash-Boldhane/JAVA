package Has_a_Relationship_Lazy_Binding;

public class ComputerDriver {
		public static void main(String[] args) {
			Computer c1=new Computer("HP", "Windows",16,1,"i7");
			
			
			c1.insertPendrive("Sandisk", 250.00, 32, 100);
			c1.p.displayPendrive();
			
			System.out.println("--------------------------------------");
			c1.displayComputer();
		}
}
