package Inheritance;//Multilevel Inheritence

public class QspidersDeccan extends  Qspiders {
		String head;
		int trainer;
		String location;
		
		public QspidersDeccan() {
			// TODO Auto-generated constructor stub
		}
		
		QspidersDeccan(String name, String hq, String ceo, int no, String type,String domain,int noofcenters,String head, int trainer, String location)
		{
			this.name=name;
			this.hq=hq;
			this.ceo=ceo;
			this.no=no;
			this.type=type;
			this.domain=domain;
			this.noofcenters=noofcenters;
			
			this.head=head;
			this.trainer=trainer;
			this.location=location;
		}
		
		public void displayQspidersDeccan()
		{
			displayQspiders();
			System.out.println(head);
			System.out.println(trainer);
			System.out.println(location);
		}
		
}
