// Write a program to convert the lowercase into uppercase and uppercase into lowercase in the String or a sentence.
package ProgrammingWithStrings;

public class Str15 {
	public static void main(String[] args) {
		String s="Hello My name is yash";
		System.out.println(caseChange(s));
	}
	public static String caseChange(String ip)
	{
		String result=" ";
		for (int i = 0; i < ip.length(); i++) {
			char ch=ip.charAt(i);
			if(ch>='A'&& ch<='Z')
			{
				result+=(char)(ch+32);
			}
			else if(ch>='a'&& ch<='z')
			{
				result+=(char)(ch-32);
			}
			else
			{
				result+=ch;
			}
		}
		
		return result.trim();
	}
}
