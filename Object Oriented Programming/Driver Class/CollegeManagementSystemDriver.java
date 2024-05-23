class CollegeManagementSystemDriver
{
	public static void main(String[]args)
	{
		CollegeManagementSystem c1=new CollegeManagementSystem();
		c1.StudentModule="Made for the Students";
		c1.TeacherModule="Made for the Teachers";
		c1.AdminModule="Who can control the system";
		c1.SubjectList="List of Subjects";
		c1.TeacherDetails="Details of the Teacher";	
		c1.StudentDetails="Details of the Student";


		System.out.println("Reference :"+c1);
		System.out.println("StudentModule :"+c1.StudentModule);
		System.out.println("TeacherModule :"+c1.TeacherModule);
		System.out.println("AdminModule :"+c1.AdminModule);
		System.out.println("SubjectList :"+c1.SubjectList);
		System.out.println("TeacherDetails :"+c1.TeacherDetails);
		System.out.println("StudentDetails :"+c1.StudentDetails);
		
	}
}