package Has_a_Relationship_Early_Binding;

public class MobileDriver1 {
		public static void main(String[]args)
		{
			Mobile1 m1=new Mobile1("Samsung","S21","Black",150000.0,512,256,"Samsung",5000, 2000.0);
			m1.displayMobile();
			System.out.println("-----------------------------------------------------------------------");
			
			m1.b1.displayBattery();
			
			System.out.println("---------------------------------------------------------------------");
			
			
			Mobile1 m2=new Mobile1("Apple", "15 pro max", "White",150000.0,512,256,"Nokia",2000,700.0);
			m2.displayMobile();
			
			System.out.println("----------------------------------------------------------------------");
			m2.b1.displayBattery();
			
		}
		
		
}
