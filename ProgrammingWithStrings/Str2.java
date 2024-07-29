// Write a  program in which method accepts a string and return character array
package ProgrammingWithStrings;

import java.util.Arrays;

public class Str2 {
	public static void main(String[] args) {
	String s="Qspiders";
	
	char []ans=charArray(s);
	
	System.out.println(Arrays.toString(ans));
	}
	
	public static char[] charArray(String s)
	{
		char ch[]=new char[s.length()];
		
		for (int i = 0; i < s.length(); i++) {
			ch[i]=s.charAt(i);
		}
				return ch;
	}
}
