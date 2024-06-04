package Inheritance;//Multilevel Inheritence

public class Testyantra {
		String name;
		String hq;
		String ceo;
		int no;
		String type;
		
		public Testyantra() {
			// TODO Auto-generated constructor stub
		}
		
		Testyantra(String name, String hq, String ceo, int no, String type)
		{
			this.name=name;
			this.hq=hq;
			this.ceo=ceo;
			this.no=no;
			this.type=type;
		}
		
		public void displayTestyantra()
		{
			System.out.println("Name :"+name);
			System.out.println("Headquarter :"+hq);
			System.out.println("CEO :"+ceo);
			System.out.println("No :"+no);
			System.out.println("Type :"+type);
		}
}
