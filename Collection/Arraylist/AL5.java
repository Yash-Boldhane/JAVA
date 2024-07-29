package Collection.Arraylist;

import java.util.ArrayList;

public class AL5 {
	public static void main(String[] args) {
		ArrayList<Object> a1=new ArrayList<>();
		
		a1.add(new Student("Yash", 4, "CSE"));
		a1.add(new Student("AMIT", 5, "IT"));
		
		System.out.println(a1);
		
		for(Object c: a1)
		{
			Student s=(Student)c;
			
			System.out.println(s.year);
		}
	}
}
