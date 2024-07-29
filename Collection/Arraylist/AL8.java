// Write a program to remove an element from the list.
package Collection.Arraylist;

import java.util.ArrayList;

public class AL8 {
	public static void main(String[] args) {
		ArrayList a1=new ArrayList<>();
		
		a1.add(1);
		a1.add(2);
		a1.add(3);
		a1.add(4);
		a1.add(45);
		a1.add(6);
		a1.add(7);
		a1.add(8);
		
		a1.remove((Integer)45);
		
		System.out.println(a1);
		
	}
}
