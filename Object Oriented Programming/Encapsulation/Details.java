package Encapsulation;

public class Details {

		private String name;
		private String Blood;
		private int age;
		
		public Details() {
			// TODO Auto-generated constructor stub
		}
		
		Details(String name,String Blood, int age)
		{
			this.name=name;
			this.Blood=Blood;
			this.age=age;
			
		}
		
		public String getName()
		{
			return name;
		}
		
		public void setName(String name)
		{
			this.name=name;
		}
		
		public String getBlood() 
		{
			return Blood;
		}
		public void setBlood(String Blood)
		{
			this.Blood=Blood;
		}
		public int getAge() {
			return age;
		}
		
		public void getAge(int age)
		{
			this.age=age;
		}
		
		public void display()
		{
			System.out.println("Name :"+name);
			System.out.println("Blood :"+Blood);
			System.out.println("Age :"+age);
		}
}
