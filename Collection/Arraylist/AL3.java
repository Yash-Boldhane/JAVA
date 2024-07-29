// Write a program to extract the elements from a given arraylist using foreach loop.
package Collection.Arraylist;

import java.util.ArrayList;

public class AL3 {
	public static void main(String[] args) {
		ArrayList<Object> a1=new ArrayList<>();
		
		a1.add(10);
		a1.add(20);
		a1.add("Hello");
		a1.add('A');
		a1.add('a');
		a1.add(true);
		a1.add(false);
		a1.add(500);
		a1.add('@');
	
		for(Object o:a1)
		{
			System.out.println(o);
		}
		
	}
		
		
}
