package Has_a_Relationship_Early_Binding;

public class PenDriver {
		public static void main(String[]args) 
		{
			Pen p1=new Pen("Cello","Black",10.00);
			p1.displayPen();
			
			System.out.println("----------------------------------------------------------");
			
			p1.r1.diplayRefil();
		}
}
