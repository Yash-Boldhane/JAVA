// Write a program to print the food items whose first character starts with 0 and ends with o;
package Collection.Arraylist;

import java.util.ArrayList;

public class Al9 {
	public static void main(String[] args) {
		ArrayList<String> a1=new ArrayList<>();
		
		a1.add("Apples");
		a1.add("Mango");
		a1.add("Bananas");
		a1.add("Grapes");
	
		ArrayList<String> a2=new ArrayList<>();
		
		a2.add("Tomato");
		a2.add("Potato");
		a2.add("Spinacg");
		a2.add("Ladies Finger");
		
		
		ArrayList<String> c=new ArrayList<>();
		c.addAll(a1);
		c.addAll(a2);
		
		for(String o:c)
		{
			String s=(String) o;
			
			char first=s.charAt(0);
			char last=s.charAt(s.length()-1);
			
			if(first=='o'|| last=='o')
			{
				System.out.println(s);
			}
			
		}
		
		
		
		
	
	}
}
