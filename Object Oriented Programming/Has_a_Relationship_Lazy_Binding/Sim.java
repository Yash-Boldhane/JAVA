package Has_a_Relationship_Lazy_Binding;

public class Sim {
		String brand;
		int g;
		double recharge;
		
		public Sim() {
			// TODO Auto-generated constructor stub
		}
		
		Sim(String brand, int g, double recharge)
		{
			this.brand=brand;
			this.g=g;
			this.recharge=recharge;
		}
		
		public void displaySim()
		{
			System.out.println(brand);
			System.out.println(g);
			System.out.println(recharge);
		}
}
