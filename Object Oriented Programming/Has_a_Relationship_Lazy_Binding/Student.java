package Has_a_Relationship_Lazy_Binding;

public class Student {
	String name;
	String branch;
	long mobno;
	String type;
	
	public Student() {
		// TODO Auto-generated constructor stub
	}
	
	Student(String name,String branch,long mobno,String type)
	{
		this.name=name;
		this.branch=branch;
		this.mobno=mobno;
		this.type=type;
	}
	
	public void displayStudent()
	{
		
		System.out.println(name);
		System.out.println(branch);
		System.out.println(mobno);
		System.out.println(type);
	}
	
}
