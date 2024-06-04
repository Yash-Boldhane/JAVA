package Inheritance;//Multilevel Inheritence

public class Qspiders extends Testyantra1{
	String domain;
	int noofcenters;
	
	public Qspiders() {
		// TODO Auto-generated constructor stub
	}
	
	Qspiders(String name, String hq, String ceo, int no, String type,String domain,int noofcenters)
	{
		this.name=name;
		this.hq=hq;
		this.ceo=ceo;
		this.no=no;
		this.type=type;
		
		this.domain=domain;
		this.noofcenters=noofcenters;
	}
	
	public void displayQspiders()
	{
		displayTestyantra();
		System.out.println(domain);
		System.out.println(noofcenters);
		
	}
}
