package Inheritance;//Multilevel Inheritence

public class Qspiders1 extends Testyantra1{
	String domain;
	int noofcenters;
	
	public Qspiders1() {
		// TODO Auto-generated constructor stub
	}
	
	Qspiders1(String name, String hq, String ceo, int no, String type,String domain,int noofcenters)
	{
		super(name,hq,ceo,no,type);
		
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
