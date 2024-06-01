package Encapsulation;

public class onlinecourses {

	private String courseId;
	private String courseName;
	private String instructor;
	double enrolledStudents=200;
	double vaccancy=300;
	double left=vaccancy-enrolledStudents;
	
	onlinecourses()
	{
		
	}
	
	onlinecourses(String courseId,String courseName,String instructor)
	{
		this.courseId=courseId;
		this.courseName=courseName;
		this.instructor=instructor;
	}
	
	public String getCourseId()
	{
		return courseId;
	}
	public String getCourseName()
	{
		return courseName;
	}
	public String getInstructor()
	{
		return instructor;
	}
	public double getEnrolledStudents()
	{
		return enrolledStudents;
	}
	
	public void addStudent(String courseName,String instructor,double Students)
	{
		if(this.courseName==courseName && this.instructor==instructor)
		{
			System.out.println("Congratulations!!! the course  and the instructor you want are available");
			if(left>Students)
			{
				System.out.println("Yes You can join the classes!!!!!");
			}
			else
			{
				System.out.println("Sorry!!!! The batch is fullll, you have to wait till the batch finishes or join another batch");
			}
			
			
		}
		else
		{
			System.out.println("Invalid Credentials!!!!");
		}
	}
}
