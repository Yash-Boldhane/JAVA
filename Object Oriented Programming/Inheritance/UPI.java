package Inheritance;

public class UPI {
		String name;
		String Virtualid;
		String password;
		
		public UPI() {
			// TODO Auto-generated constructor stub
		}
		
		UPI(String name, String Virtualid, String password)
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
