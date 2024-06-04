package Inheritance;//Multilevel Inheritence

public class QspDriver {
	public static void main(String[] args) {
		QspidersDeccan q1=new QspidersDeccan("Testyantra Software", "Bengluru", "Girish Ramanna", 4000, "Software Company", "Software Training Institute", 52, "Kedarnath sir", 22, "Deccan");
		q1.displayTestyantra();
		
		System.out.println("--------------------------------------------------------------------");
		q1.displayQspiders();
		
		System.out.println("---------------------------------------------------------------------");
		q1.displayQspidersDeccan();
	}
}
