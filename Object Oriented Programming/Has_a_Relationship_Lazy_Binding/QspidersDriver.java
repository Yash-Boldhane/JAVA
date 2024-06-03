package Has_a_Relationship_Lazy_Binding;

public class QspidersDriver {
	public static void main(String[] args) {
		Qspiders q1=new Qspiders("Deccan", "Swati", "Tejus Sir", 987654321l);;
		q1.displayQspiders();
		
		System.out.println("---------------------------------------------------------");
		
		q1.detailsOfStudent("Yash", "CSE", 987456123l,"Incubationn");
		q1.s.displayStudent();
	}
}
