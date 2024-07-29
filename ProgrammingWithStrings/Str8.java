//// Write a program to convert a string into lowercase
package ProgrammingWithStrings;

public class Str8 {
	public static void main(String[] args) {
		String s="HELLO";
		
		String ans="";
		
		for (int i = 0; i < s.length(); i++) {
			char ch=s.charAt(i);
			if(ch>='A' && ch<='Z')
			{
				ans+=(char)(ch+32);
			}
			else
			{
				ans+=ch;
			}
		}
		System.out.println(ans);
	}
}
