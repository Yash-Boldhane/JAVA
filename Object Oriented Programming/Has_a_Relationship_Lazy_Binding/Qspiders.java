package Has_a_Relationship_Lazy_Binding;

public class Qspiders {
	String branch;
	String hr;
	String trainer;
	long phnno;
	
	Student  s;
	
	Qspiders()
	{
		
	}
	Qspiders(String branch,String hr,String trainer,long phnnoo)
	{
		this.branch=branch;
		this.hr=hr;
		this.trainer=trainer;
		this.phnno=phnnoo;
	}
	
	public void detailsOfStudent(String name,String branch,long mobno,String type)
	{
		s=new Student(name, branch, mobno, type);
		System.out.println("Students Joined");
	}
	
	public void displayQspiders()
	{
		System.out.println(branch);
		System.out.println(hr);
		System.out.println(trainer);
		System.out.println(phnno);
	}
}
