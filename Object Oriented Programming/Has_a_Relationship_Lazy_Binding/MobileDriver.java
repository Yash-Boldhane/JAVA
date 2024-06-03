package Has_a_Relationship_Lazy_Binding;

public class MobileDriver {
		public static void main(String[] args) {
			Mobile m1=new Mobile("Samsung", "S21", "Black", 150000.0);
			m1.displayMobile();
			System.out.println("-----------------------------------------------------------");
			
			m1.insertSim("Jio", 5,299.00);
			m1.s.displaySim();
		}
}
