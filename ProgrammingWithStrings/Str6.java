// write a program to reverse a given String
package ProgrammingWithStrings;

public class Str6 {
	public static void main(String[] args) {
		String s="Qspiders";
		
		String ans="";
		
		for (int i = s.length()-1; i >=0 ; i--) {
			ans+=s.charAt(i);
		}
		
		System.out.println(ans);
	}

}
