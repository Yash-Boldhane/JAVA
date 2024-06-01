package Has_a_Relationship_Early_Binding;

public class MobileDriver {
		public static void main(String[]args)
		{
			Mobile m1=new Mobile("Samsung","S21","Black",150000.0,512,256);
			m1.displayMobile();
			System.out.println("-----------------------------------------------------------------------");
			
			m1.b1.displayBattery();
			
			System.out.println("---------------------------------------------------------------------");
			
			
			Mobile m2=new Mobile("Apple", "15 pro max", "White",150000.0,512,256);
			m2.displayMobile();
			
			System.out.println("----------------------------------------------------------------------");
			m2.b1.displayBattery();
			
		}
		
		
}
