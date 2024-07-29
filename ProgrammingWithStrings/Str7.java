// Write a program to convert a string into uppercase
package ProgrammingWithStrings;

public class Str7 {

	public static void main(String[] args) {
		String s="heLlO";
		
		String ans="";
		
		for (int i = 0; i < s.length(); i++) {
			char ch=s.charAt(i);
			if(ch>='a'&& ch<='z')
			{
				ans=ans+(char)(ch-32);
			}
			else
			{
				ans+=ch;
			}
		}
		System.out.println(ans);
	}
		
}
