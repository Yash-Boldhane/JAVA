package Has_a_Relationship_Lazy_Binding;

public class SuitcaseDriver {
		public static void main(String[] args) {	
				Suitcase s1=new Suitcase("American Tourister", "Black", 15, 6000.0);
				s1.displatSuitcase();
				
				System.out.println("--------------------------------------------------");
				
				s1.insertClothes("Tshirt", "Red", 400.0);
				s1.c.displayClothes();
		}
}
