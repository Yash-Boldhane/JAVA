package Collection.Arraylist;

public class Student {
			String name;
			int year;
			String stream;
			
			public Student() {
	// TODO Auto-generated constructor stub
			}
	
			
			Student(String name, int year, String stream)
			{
				this.name=name;
				this.year=year;
				this.stream=stream;
				
			}
			
			public String toString()
			{
				return "[Name : "+name+ ", " + " Year : "+year+ " , " + "Stream :"+stream+"]";
			}
			
			
			
		
	}


