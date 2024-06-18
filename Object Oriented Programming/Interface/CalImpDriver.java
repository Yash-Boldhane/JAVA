package Interface;

public class CalImpDriver {

	public static void main(String[] args) {
		CalImp c1=new CalImp();
		c1.add(5, 10);
		c1.div(22.0, 7.0);
		
		System.out.println("---------------------");
		System.out.println(c1.pi);
	}
}

