package Collection.Arraylist;

import java.util.Arrays;

public class AL4 {
	public static void main(String[] args) {
		Student s[]=new Student[4];
		
		s[0]=new Student("Raju",5,"Cse");
		s[1]=new Student("Raja",4,"Ce");
		s[2]=new Student("Rani",6,"CA");
		
				
		System.out.println(Arrays.toString(s));
	}

}
