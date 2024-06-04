package Inheritance;

public class UPI1 {
		String name;
		String Virtualid;
		String password;
		
		public UPI1() {
			// TODO Auto-generated constructor stub
		}
		
		UPI1(String name, String Virtualid, String password)
		{
			this.name=name;
			this.Virtualid=Virtualid;
			this.password=password;
		}
		
		public void displayUpi()
		{
			System.out.println(name);
			System.out.println(Virtualid);
			System.out.println(password);
		}
}
