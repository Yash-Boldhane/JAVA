// Write a program to replace a character from a given string
package ProgrammingWithStrings;

public class Str9 {
	public static void main(String[] args) {
		String s="Qspiders";
		
		System.out.println(replace(s, 'Q', 'P'));
	}
	public static String replace(String ip, char old, char replace)
	{
		String ans="";
		for (int i = 0; i < ip.length(); i++) {
			char ch=ip.charAt(i);
			
			if(ch==old)
			{
				ans+=replace;
			}
			else
			{
				ans+=ch;
			}
		}
		return ans;
	}
}
