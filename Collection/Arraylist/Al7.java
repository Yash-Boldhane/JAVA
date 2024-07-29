package Collection.Arraylist;

import java.util.ArrayList;

public class Al7 {
	public static void main(String[] args) {
	ArrayList a1=new ArrayList<>();
		
		a1.add("Apples");
		a1.add("Mango");
		a1.add("Bananas");
		a1.add("Grapes");
	
		ArrayList a2=new ArrayList<>();
		
		a2.add("Tomato");
		a2.add("Potato");
		a2.add("Spinacg");
		a2.add("Ladies Finger");
		
		a1.addAll(2, a2);
		
		System.out.println(a1);
	}
}
